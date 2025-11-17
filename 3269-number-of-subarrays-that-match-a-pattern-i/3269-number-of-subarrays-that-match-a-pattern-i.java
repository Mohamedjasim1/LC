class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        
        int m=pattern.length+1;
        int ans=0;
        int count=1;
        for(int k=0;k<nums.length-m+1;k++){
            int i=k;
            for(int j:pattern){
                if(nums[i]<nums[i+1] && j==1){
                    count++;
                }else if(nums[i]==nums[i+1] && j==0){
                    count++;
                }else if(nums[i]>nums[i+1] && j==-1){
                    count++;
                }else{
                    break;
                }
                i++;
            }
            if(count==m)ans++;
            count=1;
        }
        return ans;
    }
}