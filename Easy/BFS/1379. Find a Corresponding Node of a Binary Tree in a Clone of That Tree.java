/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 class Solution {
    public TreeNode bfs(TreeNode original, TreeNode cloned, TreeNode target)
    {   
        Queue <TreeNode> queue= new LinkedList<>();
        queue.add(cloned);
        
        while(!queue.isEmpty())
        {
            TreeNode node = queue.remove();
            if(node.val==target.val)
                return node;
            if(node.left!=null)
            {
                queue.add(node.left);
            }
            if(node.right!=null)
            {
                queue.add(node.right);
            }
        }

        return cloned;


    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        

        return bfs(original, cloned , target);
    }
}