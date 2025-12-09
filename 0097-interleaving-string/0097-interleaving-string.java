class Solution {

    Boolean[][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        
        dp=new Boolean[s1.length()+1][s2.length()+1];
        return dfs(0,0,0,s1,s2,s3);

    }

    public boolean dfs(int i,int j,int k,String s1,String s2,String s3){


        if(k==s3.length() && i==s1.length() && j==s2.length())return true;

        if(k==s3.length())return false;

        if(i>=s1.length() && j>=s2.length())return false;

        if(dp[i][j]!=null)return dp[i][j];


        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
            if(dfs(i+1,j,k+1,s1,s2,s3)){
                return dp[i][j]=true;
            }
        }

        if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
            if(dfs(i,j+1,k+1,s1,s2,s3)){
                return dp[i][j]=true;
            }
        }

        return dp[i][j]=false;

    }
}