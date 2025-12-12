class Solution {
    Integer[][] dp;

    public int maxUncrossedLines(int[] nums1, int[] nums2) {

        dp=new Integer[nums1.length+1][nums2.length+1];
        return dfs(0,0,nums1,nums2);

    }

    public int dfs(int i,int j,int[] a,int[] b){

        if(i==a.length || j==b.length)return 0;

        if(dp[i][j]!=null)return dp[i][j];

        int res=0;
        if(a[i]==b[j]){
            res=1+dfs(i+1,j+1,a,b);
        }else{
            res=Math.max(dfs(i,j+1,a,b),dfs(i+1,j,a,b));
        }

        return dp[i][j]=res;

    }
}