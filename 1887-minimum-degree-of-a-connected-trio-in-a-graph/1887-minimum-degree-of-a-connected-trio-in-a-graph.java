class Solution {
    public int minTrioDegree(int n, int[][] edges) {
        

        boolean[][] isEdges=new boolean[n+1][n+1];

        HashMap<Integer,Integer> map=new HashMap<>();

        int min=Integer.MAX_VALUE;

        for(int[] e:edges){
            isEdges[e[0]][e[1]]=true;
            isEdges[e[1]][e[0]]=true;

            map.put(e[0],map.getOrDefault(e[0],0)+1);
            map.put(e[1],map.getOrDefault(e[1],0)+1);

        }


        for(int[] e:edges){
            for(int j=1;j<=n;j++){
                if(isEdges[e[0]][j] && isEdges[e[1]][j]){
                    int degree=map.get(j)+map.get(e[0])+map.get(e[1])-6;
                    min=Math.min(degree,min);
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}