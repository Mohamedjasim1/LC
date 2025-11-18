class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
        for(int i=0;i<bits.length;i++){

            

            // System.out.println(bits[i]);
            if(bits[i]==1){
                i+=1;
            }else{
                System.out.println(i);
                 if(i==bits.length-1)return true;
                // i++;
            }
            // if(i==bits.length-1 && bits[i]==0)return true;
            
        }
        return false;
    }
}