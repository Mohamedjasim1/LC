class Solution {

    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        
        int target=0;

        for(int n:nums)target+=n;

        

        if(target%2!=0)return false;

        target/=2;
        dp=new Boolean[nums.length+1][target+1];

        return dfs(0,target,nums);
        
    }

    public boolean dfs(int i,int tar,int[] nums){


        if(tar==0)return true;

        if(tar<0)return false;

        if(dp[i][tar]!=null)return dp[i][tar];

       for(int j=i;j<nums.length;j++){
            if(dfs(j+1,tar-nums[j],nums))return dp[i][tar]=true;
       }

        return dp[i][tar]=false;

    }
}