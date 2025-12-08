class Solution {
    public int countTriples(int n) {
        
        int count=0;
        for(int i=1;i<=n;i++){
            int ipow=i*i;
            for(int j=1;j<=n;j++){
                int jpow=ipow+(j*j);
                for(int k=1;k<=n;k++){
                    if(jpow==k*k)count++;   
                }
            }
        }
        return count;
    }
}