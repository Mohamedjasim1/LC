class Solution {

    //  HashMap<String,Integer> map;
    int mod=1000000007;
    Integer[] dp;

    public int numberOfArrays(String s, int k) {
        // map=new HashMap<>();
        dp=new Integer[s.length()+1];
        return dfs(0,s,k);
    }

     public int dfs(int i,String num,int k){

        if(i==num.length())return 1;

        if(num.charAt(i)=='0')return 0;

        // String temp=i+" "+prev;
        if(dp[i]!=null)return dp[i];

        // if(map.containsKey(temp))return map.get(temp);

        int way=0;
        long nums=0;
        for(int j=i;j<num.length();j++){
            nums=nums*10+(num.charAt(j)-'0');
          
            if(nums>k)break;

            way=(way+dfs(j+1,num,k))%mod;
        
        }

        // map.put(temp,way);

        return dp[i]=way%mod;

    }

    //  public boolean compare(String a,String b){

    //     if(a.length()!=b.length())return a.length()<b.length();

    //     return a.compareTo(b)<=0;

    // }
}