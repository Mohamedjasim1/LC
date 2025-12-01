class Solution {
    List<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] can, int tar) {

        res=new ArrayList<>();

        Arrays.sort(can);

        dfs(0,0,can,tar,new ArrayList<>());
        return res;
    }

    public void dfs(int i,int sum,int[] can,int tar,ArrayList<Integer> temp){

        if(sum>tar)return;

        if(sum==tar){
            res.add(new ArrayList<>(temp));
            // System.out.println(temp);
            return;
        }

        for(int j=i;j<can.length;j++){

            if(j>i && can[j]==can[j-1])continue;

            temp.add(can[j]);


            // System.out.println(temp);
            dfs(j+1,sum+can[j],can,tar,temp);
            temp.remove(temp.size()-1);
        }


    }
}