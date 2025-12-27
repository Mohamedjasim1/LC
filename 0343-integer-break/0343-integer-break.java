class Solution {
    public int integerBreak(int n) {
        dfs(n,n);
        return 0;
    }

    public int dfs(int cur,int n){

        if(cur<0)return 0;

        if(cur==0){
            System.out.println(1);
            return 0;
        };

        for(int i=1;i<n;i++){
            dfs(cur-i,n);
        }

        return 1;
    }
}