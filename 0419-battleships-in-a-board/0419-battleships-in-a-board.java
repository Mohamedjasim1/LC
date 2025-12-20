class Solution {
    public int countBattleships(char[][] board) {
        int count=0;
          for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(board[r][c]=='X'){
                   
                    if(dfs(r,c,board)){
                        count++;
                    }
             
                }
                
            }
        }  
        return count;
    }
    public static boolean dfs(int r,int c,char[][] grid){
        if(r<0 || c<0 || r>grid.length-1 || c>grid[0].length-1 || grid[r][c]=='.'){
            return false;
        }
        grid[r][c]='.';

        dfs(r+1,c,grid);
        dfs(r-1,c,grid);
        dfs(r,c+1,grid);
        dfs(r,c-1,grid);

        

     
        return true;
}
}