class Solution {
    ArrayList<ArrayList<Integer>> arr;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        

        arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList());
        }

        for(int[] e:edges){
            arr.get(e[0]).add(e[1]);
            arr.get(e[1]).add(e[0]);
        }

        return dfs(source,destination,new boolean[n+1]);

    }

    public boolean dfs(int s,int d,boolean[] vis){

        if(s==d)return true;

        if(vis[s])return false;
        vis[s]=true;

        for(int n:arr.get(s)){
            if(vis[n])continue;
            if(dfs(n,d,vis)){
                return true;
            }
        }

        return false;

    }
}