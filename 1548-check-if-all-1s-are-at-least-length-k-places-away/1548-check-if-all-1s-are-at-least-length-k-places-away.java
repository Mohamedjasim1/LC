class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c=0;
        boolean f=true;
        for(int i=1;i<nums.length;i++){

           
            
            if(nums[i]==0){
                c++;
            }
            
            else if(nums[i]!=0 & i!=1){
                
                if(c<k){
                    return false;
                    
                }else{
                    f=true;
                }
                c=0;
            }

        }
        
        return f;
    }
}