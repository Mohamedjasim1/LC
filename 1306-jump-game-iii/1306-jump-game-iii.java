class Solution {
    public boolean canReach(int[] arr, int start) {
        return dfs(start,arr,new boolean[arr.length+1]);
    }

    public boolean dfs(int i,int[] arr,boolean[] vis){

        if(i<0 || i>arr.length-1)return false;

        if(arr[i]==0)return true;

        boolean a=false;
        int val=i-arr[i];
        if(val>=0){
            if(!vis[val]){
                vis[val]=true;
                a=dfs(val,arr,vis);
                vis[val]=false;
            }
        }
        boolean b=false;
        
        val=i+arr[i];
        if(val<=arr.length-1){
            if(!vis[val]){
                vis[val]=true;
                b=dfs(val,arr,vis);
                vis[val]=false;
            }
        }
        
        // boolean b=dfs(i+arr[i],arr);

        return a||b;

    }
}