class Solution {
    public int minimumOperations(String nums) {
        
        // if(nums.length()==1)return 1;

        // String[] temp={"25","50","75"};

        // if(nums.equals("25") || nums.equals("50") || nums.equals("75"))return 0;

        // if(nums.length()==2)return 2;

        return Math.min(helper(nums,'5','2','7'),helper(nums,'0','0','5'));
    }

    public int helper(String nums,char z,char x,char y){

        boolean flag=false;
        int a=0;
        int zero=0;
        for(int i=nums.length()-1;i>=0;i--){

            if(nums.charAt(i)==z && !flag){
                flag=true;
                a=nums.length()-i-1;
                if(z=='0'){
                    zero++;
                }
            }else if(flag && (nums.charAt(i)==x || nums.charAt(i)==y)){
                return a-1;
            }
            a++;

        }

        if(flag){
            return a-zero;
        }

        return a;
    }
}