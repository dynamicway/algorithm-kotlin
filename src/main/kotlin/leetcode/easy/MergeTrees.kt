package leetcode.easy

fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
    if (root1 == null && root2 == null)
        return null
    if (root1 == null)
        return root2
    if (root2 == null)
        return root1
    val treeNode = TreeNode(root1.`val` + root2.`val`)
    treeNode.left = mergeTrees(root1.left, root2.left)
    treeNode.right = mergeTrees(root2.right, root2.right)
    return treeNode
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}