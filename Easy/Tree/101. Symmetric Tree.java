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

    private boolean bfs(TreeNode root, Queue<TreeNode> que) {

        while (!que.isEmpty()) {
            TreeNode left = que.poll();
            TreeNode right = que.poll();

            if (left == null && right != null)
                return false;
            if (right == null && left != null)
                return false;
            if (left == null && right == null)
                continue;

            if (left.val != right.val) {
                return false;
            }

            if (!(left.left == null && right.right == null)) {
                que.offer(left.left);
                que.offer(right.right);
            }

            if (!(left.right == null && right.left == null)) {
                que.offer(left.right);
                que.offer(right.left);
            }

        }
        return true;
    }

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        if (root == null)
            return true;
        if (root.left == null && root.right != null)
            return false;
        if (root.right == null && root.left != null)
            return false;
        que.offer(root.left);
        que.offer(root.right);

        return bfs(root, que);

    }
}