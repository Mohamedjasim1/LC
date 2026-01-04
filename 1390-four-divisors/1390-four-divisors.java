class Solution {
    public int sumFourDivisors(int[] nums) {
        
        int tot=0;
        for(int n:nums){
            int sum=n+1;
            int count=2;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    int j=n/i;
                    if(j==i){
                        sum+=i;
                    count++;
                    }else{
                        count+=2;
                        sum+=i+j;
                    }
                    
                }
            }
            // System.out.println(sum);
            if(count==4){
                tot+=sum;
            }
        }
        return tot;
    }
}