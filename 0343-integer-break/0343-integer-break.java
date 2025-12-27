class Solution {

    Integer[] dp;
    public int integerBreak(int n) {

        // if(n==2)return 1;
        dp=new Integer[n+1];
        
        return helper(n);
        // return Math.max(Math.max(helper(x)*helper(y),helper(x-1)*helper(y+1)));              
    }

    public int helper(int n){

        if(dp[n]!=null)return dp[n];
        if(n<=3)return n-1;

        int max=0;

        for(int i=1;i<=n;i++){
            max=Math.max(max,Math.max(i*(n-i),i*helper(n-i)));
        }

        return dp[n]=max;
        
    }
}