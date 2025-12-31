/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    public int getMinimumDifference(TreeNode root) {
        
        Queue <TreeNode> queue = new LinkedList<>();
        Queue <TreeNode> queue2 = new LinkedList<>();
        TreeNode head= root;
        int value= root.val;
        int min=11111110;
        queue.offer(head);
        queue2.offer(head);
        while(!queue2.isEmpty()){
        TreeNode node2  = queue2.poll();
        queue.offer(head);
            value=node2.val;
            if(node2.left!=null)
            {
                queue2.offer(node2.left);
            }
            if(node2.right!=null)
            {
                queue2.offer(node2.right);
            }
        while(!queue.isEmpty())
        {
            TreeNode node  = queue.poll();

            if(node.left!=null)
            {
                queue.offer(node.left);
            }
            if(node.right!=null)
            {
                queue.offer(node.right);
            }
            if(node.val==value) continue;
            int diff= node.val - value;
            if(diff<0)
            {
                diff = diff*-1;
            }
            if(min>diff){ min = diff;}
             
        }
        }
        
        return min;


    }
}
