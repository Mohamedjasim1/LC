class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        
        // int res=0;

        String res="";
        for(String st:dictionary){

            int j=0;
            int n=st.length();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==st.charAt(j)){
                    j++;
                }
                if(j==n){
                    if(res.length()<st.length()){
                        res=st;
                    }else if(res.length()==st.length() && res.compareTo(st)>0){
                        res=st;
                    }
                    break;
                }
            }
        }
        return res;
    }
}