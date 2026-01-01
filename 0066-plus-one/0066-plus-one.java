class Solution {
    public int[] plusOne(int[] digits) {
        int[] res;
        
        int j=digits.length-1;
        if(digits[j]!=9){
            digits[j]++;
            return digits;
        }

        while(j>=0 && digits[j]==9 ){
            digits[j]=0;
            j--;
        }
        if(j>=0){
            digits[j]++;
        }else{
            int[] temp=new int[digits.length+1];
            temp[0]=1;
            return temp;
        }
        return digits;
        




    //     for(int i=j-1;i>=0;i--){
    //         if(digits[i]<9){
    //             digits[i]++;
    //             return digits;
    //         }
    //         digits[i]=0;
    //     }
    //     int[] dig=new int[j+1];
    //     dig[0]=1;
    // return dig;

    }
}