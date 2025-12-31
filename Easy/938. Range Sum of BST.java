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
    public int dfs(TreeNode root, int sum1, int low , int high)
    {
        
       if(root==null) return sum1;
        
        if(root.val>=low && root.val<=high)
         {   sum1+=root.val;
         
         }
        sum1=dfs(root.left,sum1,low,high);
        sum1=dfs(root.right,sum1,low,high);
        
        return sum1;

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
      

        return dfs(root,0,low,high);

        
        
    }
}
