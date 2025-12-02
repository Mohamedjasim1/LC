class Solution {
    ArrayList<ArrayList<Integer>> graph;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        

        graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList());
        }

        for(int[] e:edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        return bfs(source,destination,new boolean[n+1]);

    }

    public boolean bfs(int s,int d,boolean[] vis){

        Queue<Integer> q=new LinkedList<>();

        q.add(s);
        

        while(!q.isEmpty()){

            

            int curNode=q.poll();
            if(vis[curNode])continue;
            vis[curNode]=true;

            if(d==curNode)return true;

            for(int node:graph.get(curNode)){
                q.add(node);
            }

        }

        return false;
    }
}