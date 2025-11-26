class Solution {
    Long[][][] dp;
    // HashMap<String,Integer> map;
    public int numberOfPaths(int[][] grid, int k) {

        int m=grid.length;
        int n=grid[0].length;

        dp=new Long[m+1][n+1][k+1];
        // map=new HashMap<>();
        return (int)(dfs(0,0,grid,k,0)%1000000007);
    }

    public long dfs(int i,int j,int[][] grid,int k,int sum){

        if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1){
            return 0;
        }

        sum+=grid[i][j];

        int rem=sum%k;
        if(dp[i][j][rem]!=null)return dp[i][j][rem];
        // String val=i+","+j+","+sum;
        // if(map.containsKey(val))return map.get(val);

        if(i==grid.length-1 && j==grid[0].length-1){

            
            return dp[i][j][rem]=(long)((rem==0)?1:0);
        }

        return dp[i][j][rem]=(dfs(i,j+1,grid,k,sum)+dfs(i+1,j,grid,k,sum))%1000000007;

        

    }
}