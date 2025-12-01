class Solution {

    Integer[] dp;
    public int combinationSum4(int[] nums, int target) {
        
        dp=new Integer[target+1];
        return dfs(0,target,nums);

    }

    public int dfs(int sum,int target,int[] nums){

        if(sum>target)return 0;

        if(sum==target)return 1;

        if(dp[sum]!=null)return dp[sum];

        int res=0;

        for(int i=0;i<nums.length;i++){
            res+=dfs(sum+nums[i],target,nums);
        }

        return dp[sum]=res;

    }
}