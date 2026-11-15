/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int dfs(TreeNode root, int depth) {
        if (root == null) {
            return --depth;
        }

        ++depth;
        int leftDepth = dfs(root.left, depth);
        int rightDepth = dfs(root.right, depth);

        return rightDepth > leftDepth ? rightDepth : leftDepth;

    }

    public int maxDepth(TreeNode root) {

        return dfs(root, 1);
    }
}

//AI solution

// class Solution {

//     public int maxDepth(TreeNode root) {

//         if (root == null) {
//             return 0;
//         }

//         int leftDepth = maxDepth(root.left);
//         int rightDepth = maxDepth(root.right);

//         return 1 + Math.max(leftDepth, rightDepth);
//     }
// }