class Solution {
    public int integerReplacement(int n) {

        if(n==Integer.MAX_VALUE)return 32;
        return dfs(n);
    }


    public int dfs(int n){
        
        if(n==1)return 0;


        int min=Integer.MAX_VALUE;

        if(n%2==1){
            min=Math.min(dfs(n+1),dfs(n-1));
        }else{
            min=dfs(n/2);
        }


        return min+1;
    }
}