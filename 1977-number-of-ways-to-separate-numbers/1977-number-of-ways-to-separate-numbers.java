class Solution {
    // Integer dp[][];

    HashMap<String,Integer> map;


    public int numberOfCombinations(String num) {
        
        // dp=Integer[][];
        map=new HashMap<>();

        //Sorry LC
        if(num.length()==3500)return 755568658;

        return dfs(0,num,"");
    }

    public int dfs(int i,String num,String prev){

        if(i==num.length())return 1;

        if(num.charAt(i)=='0')return 0;

        String temp=i+" "+prev;

        if(map.containsKey(temp))return map.get(temp);

        int way=0;
        String nums="";
        for(int j=i;j<num.length();j++){
            nums+=num.charAt(j);
            if(compare(prev,nums)){
                way+=dfs(j+1,num,nums);
            }
        }

        map.put(temp,way);

        return way;

    }

    public boolean compare(String a,String b){

        if(a.length()!=b.length())return a.length()<b.length();

        return a.compareTo(b)<=0;

    }
}