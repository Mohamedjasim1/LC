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
    int res=0;
    public int maxAncestorDiff(TreeNode root) {
        
        dfs(root);
        return res;
    }

    public int[] dfs(TreeNode root){

        if(root==null)return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE};

        if(root.left==null && root.right==null)return new int[]{root.val,root.val};

        int[] left=dfs(root.left);
        int[] right=dfs(root.right);

        int min=Math.min(left[0],right[0]);
        int max=Math.max(left[1],right[1]);


        res=Math.max(res,Math.max(Math.abs(root.val-min),Math.abs(root.val-max)));


        return new int[]{Math.min(min,root.val),Math.max(max,root.val)};

    }
}