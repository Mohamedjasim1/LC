class Solution {
    List<String> list;
    public List<String> wordBreak(String s, List<String> wordDict) {
        
        Set<String> set=new HashSet<>();
        list=new ArrayList<>();

        for(String str:wordDict)set.add(str);
        dfs(0,s,set,"");
        return list;
    }


    public void dfs(int i,String s,Set<String> set,String str){

        if(i==s.length()){
            list.add(str);
            // System.out.println(str);
            return;
        }

        String temp="";
        for(int j=i;j<s.length();j++){
            temp+=s.charAt(j);
            String word=(str.isEmpty())?temp:str+" "+temp;
            if(set.contains(temp))dfs(j+1,s,set,word);
        }

    }


}