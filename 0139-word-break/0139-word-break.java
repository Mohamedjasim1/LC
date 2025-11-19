class Solution {
    int max=0;
    Boolean[] dp;
    public boolean wordBreak(String s, List<String> dic) {
        
        HashSet<String> set=new HashSet<>();
        dp=new Boolean[s.length()+1];
        for(String st:dic){
            set.add(st);
            // max=Math.max(max,st.length());
        }

        return dfs(0,s,set);
    }

    public boolean dfs(int i,String s,HashSet<String> set){



        if(i==s.length())return true;



        if(i>s.length())return false;

        if(dp[i]!=null)return dp[i];

        // for(int start=i;start<s.length();i++){

            StringBuilder temp=new StringBuilder();
            int j=i;
            boolean flag=false;
            for(j=i;j<s.length();j++){
                temp.append(s.charAt(j));
                if(i-j>max)return false;
                if(set.contains(temp.toString())){
                    flag|=dfs(j+1,s,set);
                }
            }
            

        // }
        
            return dp[i]=flag;
        
    }


}