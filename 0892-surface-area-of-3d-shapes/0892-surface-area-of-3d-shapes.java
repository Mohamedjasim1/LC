class Solution {
    public int surfaceArea(int[][] grid) {
        
        int[][] dir={{0,-1},{1,0},{-1,0},{0,1}};

        int n=grid.length;

        int res=(n*n)*2;

        // System.out.println(res);

        for(int i=0;i<n;i++){
            res+=grid[0][i];
            res+=grid[i][0];
            res+=grid[n-i-1][n-1];
            res+=grid[n-1][n-i-1];
        }

        boolean[][] check=new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            
                int val=grid[i][j];
                if(val==0)res-=2;
                for(int[] d:dir){
                    int r=i+d[0];
                    int c=j+d[1];

                    if(r<n && c<n && r>=0 && c>=0 && grid[r][c]!=val && !check[r][c]){
                        check[i][j]=true;
                        res+=Math.abs(grid[r][c]-val);
                    }

                } 

            }
        }

        return res;

    }
}