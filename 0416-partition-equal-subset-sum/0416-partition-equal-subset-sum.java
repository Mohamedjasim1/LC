class Solution {

    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        
        int target=0;

        for(int n:nums)target+=n;

        

        if(target%2!=0)return false;

        target/=2;
        dp=new Boolean[nums.length+1][target+1];

        return dfs(0,0,nums,target);
        
    }

    public boolean dfs(int i,int tar,int[] nums,int target){


        if(tar==target)return true;



        if(tar>target || i>nums.length-1)return false;

        if(dp[i][tar]!=null)return dp[i][tar];

        boolean take=dfs(i+1,tar+nums[i],nums,target);

        boolean skip=dfs(i+1,tar,nums,target);

        

        return dp[i][tar]=take || skip;

    }
}