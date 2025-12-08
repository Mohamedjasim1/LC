class Solution {
    Integer dp[];
    public int numDecodings(String s) {
        
        dp=new Integer[s.length()+1];
        return dfs(0,s);

    }

    public int dfs(int i,String s){

        if(i==s.length())return 1;

        if(s.charAt(i)=='0')return 0;

        if(dp[i]!=null)return dp[i];

        int way=0;

        int val=s.charAt(i)-'0';
        way+=dfs(i+1,s);
        
        if(i+1<s.length()){
            int val2=(val*10)+s.charAt(i+1)-'0';
            if(val2<=26)way+=dfs(i+2,s);
        }

        return dp[i]=way;

    }
}

// 2