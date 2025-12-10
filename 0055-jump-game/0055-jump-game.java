class Solution {
    Boolean[] dp;
    public boolean canJump(int[] nums) {
        
        if(nums.length==1)return true;

        dp=new Boolean[nums.length+1];
        return dfs(0,nums);

    }

    public boolean dfs(int i,int[] nums){

        if(i==nums.length-1)return true;

        if(dp[i]!=null)return dp[i];

        for(int j=1;j<=nums[i];j++){
            if(dfs(i+j,nums))return true;
        }

        return dp[i]=false;
    }
}