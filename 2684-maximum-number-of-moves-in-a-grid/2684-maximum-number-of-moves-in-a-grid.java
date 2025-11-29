class Solution {
    Integer dp[][];
    public int maxMoves(int[][] grid) {
        
        dp=new Integer[grid.length][grid[0].length];
        int max=0;
        for(int i=0;i<grid.length;i++){
            max=Math.max(max,dfs(i,0,grid,-1));
            // System.out.println("======");
        }

        return max-1;

    }

    public int dfs(int i,int j,int[][] grid,int prev){

        if(i<0 || i>grid.length-1 || j>grid[0].length-1)return 0;

        if(dp[i][j]!=null)return dp[i][j];

        if(prev>=grid[i][j])return 0;

        // System.out.println(grid[i][j]);
        int res=Math.max(dfs(i-1,j+1,grid,grid[i][j]),Math.max(
        dfs(i,j+1,grid,grid[i][j]),
        dfs(i+1,j+1,grid,grid[i][j])));


        return dp[i][j]=res+1;
    }
}