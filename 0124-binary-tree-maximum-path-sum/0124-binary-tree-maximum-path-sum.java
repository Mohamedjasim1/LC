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
    int max=Integer.MIN_VALUE;;
    public int maxPathSum(TreeNode root) {

        dfs(root);

        return max;   
    }

    public int dfs(TreeNode root){

        if(root==null)return 0;

        int left=Math.max(0,dfs(root.left));
        int right=Math.max(0,dfs(root.right));

        // if(Math.max(left,right)==Integer.MIN_VALUE){
        //     return root.val;
        // }

        // int sum=0;

        // if(left!=Integer.MIN_VALUE)sum+=left;
        // if(right!=Integer.MIN_VALUE)sum+=right;

        // System.out.println(sum);


        max=Math.max(max,left+right+root.val);


        return Math.max(left,right)+root.val;

    }
}