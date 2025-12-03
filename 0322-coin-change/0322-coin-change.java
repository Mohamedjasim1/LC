class Solution {

    Integer[] dp;
    public int coinChange(int[] coins, int amount) {

        dp=new Integer[amount+1];
        
        int val=dfs(amount,coins,amount);

        

        return val==amount+1?-1:val;
    }

    public int dfs(int amount,int[] coins,int n){

        if(amount==0)return 0;

        if(amount<0)return n;

        if(dp[amount]!=null)return dp[amount];

        int res=n;
        for(int c:coins){
            res=Math.min(res,dfs(amount-c,coins,n));
        }

        

        return dp[amount]=1+res;

    }
}