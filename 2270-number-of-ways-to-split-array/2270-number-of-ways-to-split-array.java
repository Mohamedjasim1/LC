class Solution {
    public int waysToSplitArray(int[] num) {

        long[] nums=new long[num.length];
        nums[0]=num[0];

        for(int i=1;i<num.length;i++)nums[i]=num[i]+nums[i-1];

        int count=0;

        for(int i=0;i<nums.length-1;i++){

            // int first=0;
            // if(i!=0)first=nums[i];
            if(nums[i]>=(nums[nums.length-1]-nums[i])){
                count++;
            }
        }

        return count;

    }
}