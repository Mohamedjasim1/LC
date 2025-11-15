class Solution {
    int n;
    // int count=0;
    HashMap<String,Integer> map;
    int mod=1000000007;
    public int numWays(int steps, int arrLen) {
        n=arrLen;
        // dp=new int[steps+1][arrLen+1];
        // for(int[] i:dp){
        //     Arrays.fill(i,-1);
        // }
        map=new HashMap<>();
        
        return helper(steps,0);
        // return count;
    }

    public int helper(int steps,int ind){

        if(ind<0 || ind>n-1)return 0;
        String temp=steps+" "+ind;
        if(map.containsKey(temp))return map.get(temp);

        if(steps==0){
            if(ind==0){
                return 1;
            }
            return 0;
        }


        int res=0;

        if(ind!=0)res=(res+helper(steps-1,ind-1))%mod;
        res=(res+helper(steps-1,ind))%mod;
        if(ind<n-1)res=(res+helper(steps-1,ind+1))%mod;

        map.put(temp,res%mod);

        return res%mod;

    }
}