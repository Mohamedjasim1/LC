class Solution {

    Integer[][] dp;
    public int minFallingPathSum(int[][] matrix) {
        
        // int m=matrix.length;
        int n=matrix.length;
        int min=Integer.MAX_VALUE;

        dp=new Integer[n+1][n+1];
        // System.out.println(min);
        for(int i=0;i<n;i++){
            min=Math.min(min,dfs(0,i,matrix,0));
        }
        return min;
    }

    public int dfs(int i,int j,int[][] matrix,int sum){

        

        if(j<0 || j>matrix.length-1 || i>matrix.length-1)return Integer.MAX_VALUE;

        if(i==matrix.length-1)return matrix[i][j];

        if(dp[i][j]!=null)return dp[i][j];

        return dp[i][j]=matrix[i][j]+Math.min(dfs(i+1,j-1,matrix,sum),Math.min(dfs(i+1,j,matrix,sum),dfs(i+1,j+1,matrix,sum)));

    }
}