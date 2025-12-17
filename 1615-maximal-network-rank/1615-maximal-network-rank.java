class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

        for(int i=0;i<n;i++)map.put(i,new ArrayList<>());


        for(int[] r:roads){
            // map.putIfAbsent(r[0],new ArrayList<>());
            // map.putIfAbsent(r[1],new ArrayList<>());
            map.get(r[0]).add(r[1]);
            map.get(r[1]).add(r[0]);
        }

        int res=0;

        for(int i=0;i<n;i++){
           int sum=map.get(i).size();
           for(int j=i+1;j<n;j++){
                sum+=map.get(j).size();
                if(checkplz(map.get(i),j)){
                    sum--;
                }
                res=Math.max(sum,res);
                sum=map.get(i).size();
           }
            
        }
        return res;
    }

    public boolean checkplz(ArrayList<Integer> arr,int i){


        for(int j:arr)if(i==j)return true;
        return false;
    }   

}