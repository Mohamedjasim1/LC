class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {

     int count1=1;
     int count2=1;
     int max=0;
     int maxi=0;

    boolean flag=true;

     for(int i=0;i<nums.size()-1;i++){
        if(nums.get(i)<nums.get(i+1)){
            if(flag)count1++;
            else count2++;
           
        }else{
            
            max=Math.max(max,Math.min(count1,count2));
            if(!flag){
                count1=count2;
                count2=1;
                continue;
            }
            flag=!flag;
            
        }
        // System.out.println(count2+" "+count1);
         max=Math.max(max,Math.min(count1,count2));
             maxi=Math.max(count1,Math.max(count2,maxi));
        }
        return Math.max(maxi/2,max);

    }
}