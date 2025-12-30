class Solution {
    public String convert(String s, int numRows) {
        int i=0;
        boolean flag=true;
        String res="";
        if(numRows==1){
            return s;
        }
        HashMap<Integer,List<Character>> map=new HashMap<>();
        List<Integer> li=new ArrayList<>();
        for(int k=0;k<s.length();k++){
            if(i>=numRows){
                flag=false;
            }
            if(flag==false && i==1){
                flag=true;
            }
            
            if(flag){
                i++;
            }
            else{
                i--;
            }
            List<Character> li2 =map.getOrDefault(i,new ArrayList<>());
            // System.out.println(i);
                li2.add(s.charAt(k));
            map.put(i,li2);
        }
        //   System.out.println(map);
        for(int a:map.keySet()){
            for(char x:map.get(a)){
                res+=x;
            }
        }

        return res;
    }
}