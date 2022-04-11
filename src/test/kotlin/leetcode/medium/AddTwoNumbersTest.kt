package leetcode.medium

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class AddTwoNumbersTest : FreeSpec({

    "container" - {

        "test01" {

            val l1 = ListNode(2)
            l1.next = ListNode(4)
            l1.next!!.next = ListNode(3)

            val l2 = ListNode(5)
            l2.next = ListNode(6)
            l2.next!!.next = ListNode(4)

            val expected = ListNode(7)
            expected.next = ListNode(0)
            expected.next!!.next = ListNode(8)

            addTwoNumbers(l1, l2) shouldBe expected

        }

        "test02" {

            val l1 = ListNode(1)

            val l2 = ListNode(1)
            l2.next = ListNode(1)
            l2.next!!.next = ListNode(1)
            l2.next!!.next!!.next = ListNode(1)
            l2.next!!.next!!.next!!.next = ListNode(1)
            l2.next!!.next!!.next!!.next!!.next = ListNode(1)
            l2.next!!.next!!.next!!.next!!.next!!.next = ListNode(1)
            l2.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(1)
            l2.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(1)
            l2.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(1)
            l2.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(1)
            l1.next = ListNode(1)
            l1.next!!.next = ListNode(1)
            l1.next!!.next!!.next = ListNode(1)
            l1.next!!.next!!.next!!.next = ListNode(1)
            l1.next!!.next!!.next!!.next!!.next = ListNode(1)
            l1.next!!.next!!.next!!.next!!.next!!.next = ListNode(1)
            l1.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(1)
            l1.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(1)
            l1.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(1)
            l1.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(1)

            val expected = ListNode(2)
            expected.next = ListNode(2)
            expected.next!!.next = ListNode(2)
            expected.next!!.next!!.next = ListNode(2)
            expected.next!!.next!!.next!!.next = ListNode(2)
            expected.next!!.next!!.next!!.next!!.next = ListNode(2)
            expected.next!!.next!!.next!!.next!!.next!!.next = ListNode(2)
            expected.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(2)
            expected.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(2)
            expected.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(2)
            expected.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next!!.next = ListNode(2)

            addTwoNumbers(l1, l2) shouldBe expected

        }
    }

})
