class Solution {

    Integer[][] dp;
    public int numDistinct(String s, String t) {
        
        dp=new Integer[s.length()+1][t.length()+1];
        return dfs(0,0,s,t);

    }

    public int dfs(int i,int j,String s,String t){

        if(j==t.length())return 1;

        if(i==s.length())return 0;


        if(dp[i][j]!=null)return dp[i][j];

        int res=0;

        if(s.charAt(i)==t.charAt(j)){
            res+=dfs(i+1,j+1,s,t);
            res+=dfs(i+1,j,s,t);
        }else{
            res+=dfs(i+1,j,s,t);
        }

        return dp[i][j]=res;

        }
}