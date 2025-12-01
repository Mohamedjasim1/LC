class Solution {

    Integer[][] dp; 
    public int findTargetSumWays(int[] nums, int target) {
        

        dp=new Integer[nums.length+1][target+2005];
        return dfs(0,0,target,nums);

    }

    public int dfs(int i,int cur,int target,int[] nums){

        

        if(i>nums.length-1){
            if(cur==target)return 1;
            return 0;
        }

        int temp=cur>=0?cur:(-1*cur+1000);
        if(dp[i][temp]!=null)return dp[i][temp];

        // if(cur>(2*target) || cur<(-2*target))return 0;

        int sum=dfs(i+1,cur+nums[i],target,nums);

        int sub=dfs(i+1,cur-nums[i],target,nums);




        return dp[i][temp]=sum+sub;
    }
}