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
    int max=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null)return 0;
         dfs(root,root.val);
        return max;
    }

    public int dfs(TreeNode root,int val){

        if(root==null)return 0;

        int left=dfs(root.left,root.val);
        int right=dfs(root.right,root.val);

        

        // if(sum==0)return 0;

        max=Math.max(max,left+right);

        if(val==root.val)return 1+Math.max(left,right);

        return 0;

    }
}