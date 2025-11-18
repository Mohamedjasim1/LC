class Solution {
    public String optimalDivision(int[] nums) {

        if(nums.length==1)return nums[0]+"";

        if(nums.length==2)return nums[0]+"/"+nums[1];
        
        String res=nums[0]+"/(";



        // int i=0;
        for(int i=1;i<nums.length;i++){
            res+=nums[i];
            res+=(i!=nums.length-1)?"/":")";
            // i++;
        }

        return res;
    }
}