class Solution {
    public boolean exist(char[][] board, String words) {
        char[] word=words.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word[0]){
                    if(dfs(i,j,board,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(int i,int j,char[][] board,char[] word,int index){

        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 || index==word.length || index<0 ||board[i][j]!=word[index] ||board[i][j]=='+'){
            return false;
        }

        // System.out.println(word[index]);
        if(index+1==word.length){
            //  System.out.println("hi");
            return true;
        }
        
        char temp=board[i][j];
        board[i][j]='+';
        // for(int r=0;r<board.length;r++){
        //     for(int c=0;c<board[0].length;c++){
        //        System.out.print(board[r][c]);
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        boolean re= (dfs(i,j+1,board,word,index+1) || dfs(i+1,j,board,word,index+1) || dfs(i,j-1,board,word,index+1) ||dfs(i-1,j,board,word,index+1));
        board[i][j]=temp;
        return re;
        // dfs(i,j+1,board,word,index+1);
        // dfs(i+1,j,board,word,index+1);
        // dfs(i,j-1,board,word,index+1);
        // dfs(i-1,j,board,word,index+1);
   

    }
}