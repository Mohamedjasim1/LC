class Solution {
    public int minimumPartition(String s, int k) {
        
        // String temp="";
        long nums=0;

        
        
        int count=1;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)-'0'>k)return -1;

            int num=s.charAt(i)-'0';
            if(nums*10+num>k){
                count++;
                nums=num;

            }else{
                nums=nums*10+num;
            }

          
        }
        return count;
    }
}