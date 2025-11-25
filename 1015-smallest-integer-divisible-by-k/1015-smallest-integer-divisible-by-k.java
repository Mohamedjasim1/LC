class Solution {
    public int smallestRepunitDivByK(int k) {
        
        if(k%2==0)return -1;

        
        int i=0;
        int mul=1;
        int p=1;
        for(p=1;p<=k;p++){

            // System.out.println(i);
             i=(i*10+1)%k;
            if(i==0){
                return p;
            }
          
            // mul++;

        }
        return -1;
    }
}


// 1
// 11
// 111