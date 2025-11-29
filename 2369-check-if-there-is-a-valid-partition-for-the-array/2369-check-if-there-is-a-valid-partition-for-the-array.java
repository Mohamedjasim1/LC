class Solution {
    Boolean[] dp;
    public boolean validPartition(int[] nums) {
        
        dp=new Boolean[nums.length+1];
        return dfs(0,nums);

    }

    public boolean dfs(int i,int[] nums){

        if(i==nums.length)return true;

        // boolean flag=false;

        if(dp[i]!=null)return dp[i];
        int j=i;

        int count=1;
        while(i+1<nums.length && nums[i]==nums[i+1]){
            count++;
            i++;
            if(count==2 || count==3){
                if(dfs(i+1,nums))return dp[j]=true;
            }
        }

        i=j;

        int count1=1;
        while(i+1<nums.length && nums[i]<nums[i+1] && Math.abs(nums[i]-nums[i+1])==1){
            count1++;
            i++;
            if(count1==3){
                if(dfs(i+1,nums))return dp[j]=true;
            }
        }


        return dp[j]=false;

    }
}