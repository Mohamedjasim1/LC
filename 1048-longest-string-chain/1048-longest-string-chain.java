class Solution {
    Integer[] dp;
    public int longestStrChain(String[] words) {

        Arrays.sort(words,(s1,s2)->Integer.compare(s1.length(),s2.length()));
        
        int ans=0;

        dp=new Integer[words.length+1];

        for(int i=0;i<words.length;i++){
            ans=Math.max(ans,dfs(i,words));
        }
        
        return ans;
    }

    public int dfs(int i,String[] words){

        // if(i==words.length)return 0;

        if(dp[i]!=null)return dp[i];

        int max=0;

        for(int j=i+1;j<words.length;j++){
            if(isTrue(words[i],words[j])){
                // System.out.println(words[i]+" "+words[j]);
                max=Math.max(max,dfs(j,words));
            }
        }

        return dp[i]=1+max;

    }

    public boolean isTrue(String a,String b){

        if(a.length()>=b.length())return false;

        if(a.length()!=b.length()-1)return false;


        int i=0;
        for(int j=0;j<b.length();j++){
            if(a.charAt(i)==b.charAt(j)){
                i++;
            }
            if(i==a.length())return true;
        }

        return i==a.length();

    }
}