class Solution {
    // int max=0;
    Integer[][] dp;
    public int maxSumDivThree(int[] nums) {
        
        dp=new Integer[nums.length+1][3];
        return dfs(0,0,nums);

        // return max;
    }

    public int dfs(int i,int r,int[] nums){

        if(i==nums.length){
            return r==0?0:Integer.MIN_VALUE; 
        }

        if(dp[i][r]!=null)return dp[i][r];

        int skip=dfs(i+1,r,nums);

        int temp=(r+nums[i])%3;
        int take=dfs(i+1,temp,nums)+nums[i];


        return dp[i][r]=Math.max(skip,take);
    }
}