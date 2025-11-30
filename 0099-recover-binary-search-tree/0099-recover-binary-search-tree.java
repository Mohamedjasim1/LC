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
    TreeNode a=null;
    TreeNode b=null;
    TreeNode prev=null;
    public void recoverTree(TreeNode root) {
        

       
        // prev=r;
        dfs(root);

         int temp=a.val;
            a.val=b.val;
            b.val=temp;
    }

    public void dfs(TreeNode root){
        if(root==null)return;

       
            dfs(root.left);
        

        if(prev!=null && root.val<prev.val){
            if(a==null)a=prev;
            b=root;
        }
        // prev=root.val;
        prev=root;

      
          dfs(root.right);
        
        // return false;
    }
}

// 3 2 1