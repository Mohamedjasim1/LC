class Solution {
    int max=0;
    Integer[][] dp;
    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {

    int ans=0;

    dp=new Integer[nums1.length+1][3];

    ans=Math.max(dfs(0,nums1,nums2,0),ans);

    return ans;

    }

    public int dfs(int i,int[] a,int[] b,int ab){

        if(i==a.length)return 0;

        if(dp[i][ab]!=null)return dp[i][ab];
        
        int x=0;
        int y=0;

        int prev=-1;
        if(ab==1){
            prev=a[i-1];
        }else if(ab==2){
            prev=b[i-1];
        }

        

        if(a[i]>=prev){
            x=1+dfs(i+1,a,b,1);
        }

        if(b[i]>=prev){
            y=1+dfs(i+1,a,b,2);
        }
        int z=0;
        if(ab==0)z=dfs(i+1,a,b,0);



        return dp[i][ab]=Math.max(z,Math.max(x,y));

    }
}