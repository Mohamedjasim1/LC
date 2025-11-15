class Solution {
    int n;
    // Integer[][] dp;
    int mod=1000000007;
    HashMap<String,Integer> map;
    public int numberOfWays(int start, int end, int k) {
        n=k;
        // dp=new Integer[end+1][k+1];
        map=new HashMap<>();
        return helper(start,end,0)%mod;

    }

    public int helper(int start,int end,int k){
        if(k==n){
            if(start==end)return 1;
            return 0;
        }

        String temp=start+" "+k;
        if(map.containsKey(temp))return map.get(temp)%mod;


        int res=0;

        res=(res+helper(start-1,end,k+1))%mod;
        res=(res+helper(start+1,end,k+1))%mod;


        map.put(temp,res%mod);
        return res%mod;
    }
}