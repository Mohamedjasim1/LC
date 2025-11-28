class Solution {
    String res="z";
    Set<String> set=new HashSet<>();
    public String findLexSmallestString(String s, int a, int b) {
        
        char[] num=s.toCharArray();

        dfs(num,a,b);

        return res;

        // return new String(rot("1234",2));
    }

    public void dfs(char[] num,int a,int b){

        String temp=new String(num);
        if(set.contains(temp))return;

        // System.out.println(temp);
        set.add(temp);

        if(res.compareTo(temp)>0)res=temp;

        dfs(subt(temp,a),a,b);
        dfs(rot(temp,b),a,b);

    }

    public char[] subt(String s,int a){
        char[] num=s.toCharArray();
        for(int i=1;i<num.length;i+=2){
            num[i]=(char)(((num[i]-'0'+a)%10)+'0');

        }
        return num;
    }

    public char[] rot(String s,int b){
        char[] num=s.toCharArray();
        // char[] num = s.toCharArray();
        char[] temp = s.toCharArray();
        for(int i=0;i<num.length;i++){
            num[i]=temp[(i+b)%num.length];
        }
        return num;
    }
}