class Solution {
    public String longestWord(String[] words) {
        HashSet<String> set=new HashSet<>();

        String res="";

        for(String s:words)set.add(s);

        for(String s:words){

            String temp=s.charAt(0)+"";
            boolean flag=true;
            for(int i=1;i<s.length();i++){
                if(!set.contains(temp)){
                    flag=false;
                    break;
                }
                temp+=s.charAt(i);
            }

            if(flag){
                if(res.equals("")){
                    res=s;
                }else if(res.length()<s.length()){
                    res=s;
                }else if(res.length()==s.length()){
                    // System.out.println(s);
                    if(res.compareTo(s)>0){
                        res=s;
                    }
                }
                // System.out.println(s);
            }

        }
        return res;
    }
}