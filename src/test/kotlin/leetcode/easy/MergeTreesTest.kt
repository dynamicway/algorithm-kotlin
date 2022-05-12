package leetcode.easy

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class MergeTreesTest: FreeSpec({

    "container" - {

        "test1" {
            val root1 = TreeNode(1).apply {
                left = TreeNode(2).apply {
                    left = TreeNode(3)
                }
            }

            val root2 = TreeNode(1).apply {
                right = TreeNode(2).apply {
                    right = TreeNode(3)
                }
            }

            mergeTrees(root1, root2)
        }

    }

})