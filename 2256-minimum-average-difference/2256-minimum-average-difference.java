class Solution {
    public int minimumAverageDifference(int[] nums) {
        

        int n=nums.length;
        long[] num=new long[n];

        num[0]=nums[0];
        for(int i=1;i<n;i++){
            num[i]=nums[i]+num[i-1];
        }

        long min=Long.MAX_VALUE;
        int ind=0;

        for(int i=0;i<n-1;i++){

            // long temp=0;
            long temp=num[i];
            long val=Math.abs(num[i]/(i+1) - (num[n-1]-temp)/(n-(i+1)));
            // System.out.println(val);
            if(val<min){
                min=val;
                ind=i;
            }
        
        }


        

        // if(n==1)return ind;

        // // System.out.println(nums[n-1]);

        // if((num[n-1]/(n))<min){
        //     ind=n-1;
        // }

        if(num[n-1]/n<min){
            ind=n-1;
        }
        
        return ind;
    }
}