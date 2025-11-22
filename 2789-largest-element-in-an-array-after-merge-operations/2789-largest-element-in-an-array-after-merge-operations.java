class Solution {
    public long maxArrayValue(int[] nums) {

        
        long ans=0;
        int len=nums.length-1;
         long cur=nums[len];
        for(int i=len-1;i>=0;i--){
            if(cur>=nums[i]){
                cur+=nums[i];
            }else{
                cur=nums[i];

            }
        }
        return cur;
    }
}