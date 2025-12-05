class Solution {

    int[] parent;

    public int findCircleNum(int[][] isConnected) {
        
        parent=new int[isConnected.length+1];


        int n=isConnected.length;

        for(int i=0;i<n;i++)parent[i]=i;


        List<List<Integer>> graph=new ArrayList<>();

         for(int i=0;i<n;i++)graph.add(new ArrayList());

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    graph.get(i).add(j);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int val:graph.get(i)){
                union(i,val);
            }
        }

        int count=0;

        for(int i=0;i<n;i++){
            // System.out.println(i);;
            if(i==parent[i]){
                count++;
            }
        }

        return count;

    }

    public void union(int a,int b){

        int pa=find(a);
        int pb=find(b);

        if(pa==pb)return;

        parent[pa]=pb;

    }

    public int find(int i){

        if(parent[i]!=i){
            parent[i]=find(parent[i]);
        }
        return parent[i];
    }

    
}