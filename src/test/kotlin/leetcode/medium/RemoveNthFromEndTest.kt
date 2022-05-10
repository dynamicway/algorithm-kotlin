package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class RemoveNthFromEndTest : FreeSpec({

    "container" - {

        "test1" {
            val head = ListNode(1).apply {
                next = ListNode(2)
                    .apply {
                        next = ListNode(3)
                            .apply {
                                next = ListNode(4)
                                    .apply {
                                        next = ListNode(5)
                                    }
                            }
                    }
            }

            removeNthFromEnd(head, 2) shouldBe ListNode(1)
                .apply {
                    next = ListNode(2)
                        .apply {
                            next = ListNode(3)
                                .apply {
                                    next = ListNode(5)
                                }
                        }
                }
        }

        "test2" {
            val head = ListNode(1)

            removeNthFromEnd(head, 1) shouldBe null
        }

        "test3" {
            val head = ListNode(1)
                .apply {
                    next = ListNode(2)
                }

            removeNthFromEnd(head, 1) shouldBe ListNode(1)
        }

        "test4" {
            val head = ListNode(1)
                .apply {
                    next = ListNode(2)
                }

            removeNthFromEnd(head, 2) shouldBe ListNode(2)
        }

    }

})