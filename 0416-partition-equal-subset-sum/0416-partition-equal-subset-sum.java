class Solution {

    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        
        int target=0;

        for(int n:nums)target+=n;

        

        if(target%2!=0)return false;

        target/=2;
        dp=new Boolean[target+1][nums.length+1];

        return dfs(0,target,nums);
        
    }

    public boolean dfs(int i,int tar,int[] nums){


        if(tar==0)return true;

        if(tar<0)return false;

        if(dp[tar][i]!=null)return dp[tar][i];

       for(int j=i;j<nums.length;j++){
            if(dfs(j+1,tar-nums[j],nums))return dp[tar][i]=true;
       }

        return dp[tar][i]=false;

    }
}