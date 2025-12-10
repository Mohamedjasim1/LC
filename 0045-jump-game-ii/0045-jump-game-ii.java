class Solution {

    Integer[] dp;
    public int jump(int[] nums) {
        
        dp=new Integer[nums.length+1];
        return dfs(0,nums);

    }


    public int dfs(int i,int[] nums){

        if(i==nums.length-1)return 0;

        if(i>nums.length-1)return 10001;

        if(dp[i]!=null)return dp[i];

        int res=10001;

        for(int j=1;j<=nums[i];j++){
            res=Math.min(res,dfs(i+j,nums));
        }

        
        return dp[i]=res+1;
    }
}