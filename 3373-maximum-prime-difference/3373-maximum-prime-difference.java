class Solution {
    public int maximumPrimeDifference(int[] nums) {
        
        int a=-1;
        int b=-1;
        for(int i=0;i<nums.length;i++){
            boolean x=isPrime(nums[i]);
            // System.out.println(nums[i]+" "+x);
            if(x && a==-1){
                a=i;
            }else if(x){
                b=i;
            }
        }

        return b==-1?0:b-a; 

    }

    public boolean isPrime(int x){
        if(x==1)return false;
        if(x==2)return true;

        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0)return false;
        }
        return true;
    }
}