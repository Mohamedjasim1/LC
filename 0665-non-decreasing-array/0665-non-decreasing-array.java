class Solution {
    public boolean checkPossibility(int[] nums) {
        
        int[] arr=new int[nums.length+1];

        int max=1;

        for(int i=0;i<nums.length;i++){
           arr[i]=1;

           for(int j=i-1;j>=0;j--){
                if(nums[i]>=nums[j]){
                    arr[i]=Math.max(arr[i],arr[j]+1);
                    max=Math.max(arr[i],max);
                    // continue;
                }
           }
        }

        // for(int i:arr)System.out.println(i);
        
       return max+1==nums.length || max==nums.length;
        // return true;
    }
}