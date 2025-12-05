class Solution {
    public int countPartitions(int[] nums) {
        
        for(int i=1;i<nums.length;i++)nums[i]+=nums[i-1];

        int count=0;

        for(int i=0;i<nums.length-1;i++){

            int left=nums[i];
            // System.out.println(left);
            int right=nums[nums.length-1]-nums[i];

            if(Math.abs(left-right)%2==0)count++;

        }

        return count;

    }
}