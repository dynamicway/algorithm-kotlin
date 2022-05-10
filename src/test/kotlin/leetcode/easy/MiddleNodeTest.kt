package leetcode.easy

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class MiddleNodeTest: FreeSpec({

    "container" - {

        "test1" {
            val middleNode = ListNode(3).apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            }
            val head = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = middleNode
                }
            }

            middleNode(head) shouldBe middleNode
        }

        "test2" {
            val middleNode = ListNode(4).apply {
                next = ListNode(5).apply {
                    next = ListNode(6)
                }
            }
            val head = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = middleNode
                    }
                }
            }

            middleNode(head) shouldBe middleNode
        }

    }

})