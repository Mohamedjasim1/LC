class Solution {
    // int k;
    Integer[][][][] dp;
    public int numOfWays(int n) {
        // k=n;
        dp=new Integer[4][4][4][n+1];
        return helper(0,0,0,n)%1000000007;
    }

    public int helper(int i,int j,int k,int n){

        if(n==0)return 1;

        if(dp[i][j][k][n]!=null)return dp[i][j][k][n];
        int res=0;
        for(int a=1;a<=3;a++){
            if(a==i)continue;
            for(int b=1;b<=3;b++){
                if(b==j || b==a)continue;
                for(int c=1;c<=3;c++){
                    if(c==k || c==b)continue;
                    res=(res+helper(a,b,c,n-1))%1000000007;
                }
            }
        }

        return dp[i][j][k][n]=res;
    }
}