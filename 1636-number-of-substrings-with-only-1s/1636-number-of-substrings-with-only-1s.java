class Solution {
    public int numSub(String s) {
        
        int sum=0;
        int count=0;

        for(char c:s.toCharArray()){
            if(c=='1'){
                count++;
            }else{
                int ans=0;

                for(int i=1;i<=count;i++){
                    ans=(ans+i)%1000000007;
                }
                sum=(sum+ans)%1000000007;
                count=0;
            }
        }

        // sum+=count;
        int ans=0;
         for(int i=1;i<=count;i++){
                    ans=(ans+i)%1000000007;
            }
                sum=(sum+ans)%1000000007;
        return sum;
    }
}