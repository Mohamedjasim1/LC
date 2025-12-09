class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        dfs(image,sr,sc,color,image[sr][sc]);

        return image;

    }

    public void dfs(int[][] grid,int i,int j,int c,int val){

        if(i<0 || j<0 ||  i>grid.length-1 || j>grid[0].length-1)return;

        if(grid[i][j]==c || grid[i][j]!=val)return;


        grid[i][j]=c;
        dfs(grid,i+1,j,c,val);
        dfs(grid,i,j+1,c,val);
        dfs(grid,i-1,j,c,val);
        dfs(grid,i,j-1,c,val);


    }
}