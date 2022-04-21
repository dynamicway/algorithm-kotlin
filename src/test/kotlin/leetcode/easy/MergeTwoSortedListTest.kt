package leetcode.easy

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class MergeTwoSortedListTest: FreeSpec({

    "container" - {

        "test01" {
            val list1 = ListNode(1).apply { next = ListNode(2).apply { next = ListNode(4) } }
            val list2 = ListNode(1).apply { next = ListNode(3).apply { next = ListNode(4) } }

            mergeTwoLists(list1, list2) shouldBe ListNode(1).apply { next = ListNode(1).apply { next = ListNode(2).apply { next = ListNode(3).apply { next = ListNode(4).apply { next = ListNode(4) } } } } }
        }

        "test02" {
            mergeTwoLists(null, null) shouldBe null
        }

    }

})