class Solution {

    Long[] dp;
    public int minCost(int[] nums, int k) {
        dp=new Long[nums.length+1];
        return (int)dfs(0,nums,k);
    }

    public long dfs(int i,int[] nums,int k){


        if(i==nums.length)return 0;

        if(dp[i]!=null)return dp[i];

        HashMap<Integer,Integer> map = new HashMap<>();
        // int[] freq=new int[1001];
        
        int count=0;

        long res=Long.MAX_VALUE;
        // int min
        for(int j=i;j<nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.get(nums[j])==2)count+=2;
            else if(map.get(nums[j])>2)count++;

            // System.out.println(count);
            res=Math.min(res,count+dfs(j+1,nums,k));
            
        }

        return dp[i]=k+res;
    }
}