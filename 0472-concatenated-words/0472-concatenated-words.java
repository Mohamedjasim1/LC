class Solution {
        List<String> res;
        int max=0;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        
        res=new ArrayList<>();
        Set<String> set=new HashSet<>();
        Arrays.sort(words,new Comparator<String>(){
            public int compare (String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        // for(String s:words){
        //     max=Math.max(s.length(),max);
        //     set.add(s);
        // }

        for(int i=0;i<words.length;i++){
            if(dfs(0,words[i],set,new Boolean[words[i].length()])){
                res.add(words[i]);
            }
            set.add(words[i]);

        }
        
        return res;
    }



    public boolean dfs(int i,String s,Set<String> set,Boolean[] dp){

        if(set.isEmpty())return false;


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
                    flag|=dfs(j+1,s,set,dp);
                }
            }
            

        // }
        
            return dp[i]=flag;
        
    }

    // public void dfs(int i,Set<String> set,String[] words,String str){

        

    //     if(str.length()>max)return;

         

    //     if(i>words.length-1)return;

        

    //     StringBuilder temp=new StringBuilder(str);
    //     // String t=str;
   
    //     // int added=add;
    //     for(int j=0;j<words.length;j++){
    //         int cur=temp.length();
    //         temp.append(words[j]);
    //         // added++;
    //         String val=temp.toString();
            

    //         if(val.length()>max)return;
    //         // System.out.println(val);

    //         // if(!val.equals(words[j]) && set.contains(val)){
    //         //     System.out.println(val);
    //         // }

    //         if(!val.equals(words[j]) &&  set.contains(val))res.add(val);
    //         // added++;
    //         // temp+=words[j];
    //         // System.out.println(temp);
    //         dfs(j,set,words,val);
    //         // added--;
    //         temp.setLength(cur);

    //     }

    //     // return /;
    // }
}