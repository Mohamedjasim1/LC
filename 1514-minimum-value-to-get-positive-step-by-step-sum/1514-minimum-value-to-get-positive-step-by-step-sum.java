class Solution {
    public int minStartValue(int[] nums) {
        
        int i=1;
        // int sum=0;
        while(true){
            int sum=i;
            int count=0;
            for(int n:nums){
                sum+=n;
                
                // System.out.println(i+" "+sum);
                if(sum<1){
                    i++;
                    break;
                }
                count++;
            }

            if(count==nums.length)return i;

            // i++;
        }
        // return -1;
    }
}