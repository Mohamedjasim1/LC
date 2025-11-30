class Solution {
    Map<Integer,ArrayList<Integer>> tree;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        
         tree=new HashMap<>();

        for(int i=0;i<n;i++){
            if(manager[i]==-1)continue;
            tree.putIfAbsent(manager[i],new ArrayList<>());
            tree.get(manager[i]).add(i);
        }


       

        return dfs(headID,informTime); 
    }

    public int dfs(int id,int[] time){


        int max=time[id];

        int maxi=0;
        
        if(!tree.containsKey(id))return 0;
        for(int node:tree.get(id)){
            maxi=Math.max(maxi,dfs(node,time));
        }


        return max+maxi;
    }
}