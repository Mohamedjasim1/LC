class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return dfs(0,0,target,nums);

    }

    public int dfs(int i,int cur,int target,int[] nums){

        

        if(i>nums.length-1){
            if(cur==target)return 1;
            return 0;
        }

        // if(cur>(2*target) || cur<(-2*target))return 0;

        int sum=dfs(i+1,cur+nums[i],target,nums);

        int sub=dfs(i+1,cur-nums[i],target,nums);


        return sum+sub;
    }
}