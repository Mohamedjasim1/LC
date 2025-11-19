class Solution {
    Integer[] dp;
    public int minExtraChar(String s, String[] dic) {
        // int[] arr=new int[26];

        dp=new Integer[s.length()+1];

        HashSet<String> set=new HashSet<>();

        for(String ss:dic)set.add(ss);

        return dfs(0,set,s);
    }

    public int dfs(int i,HashSet<String> set,String s){

        if(i==s.length())return 0;

        if(dp[i]!=null)return dp[i];

        int res=1+dfs(i+1,set,s);


        for(int j=i+1;j<=s.length();j++){
            if(set.contains(s.substring(i,j))){
                res=Math.min(res,dfs(j,set,s));
            }
        }

        return dp[i]=res;
    }
}