class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum3(int k, int n) {
        res=new ArrayList<>();

        dfs(1,0,n,k,new ArrayList<>());

        return res;
    }

    public void dfs(int i,int sum,int n,int k,ArrayList<Integer> temp){

        if(sum==n){
            if(temp.size()==k){
                res.add(new ArrayList<>(temp));
            }
            return;
        }

        for(int j=i;j<=9;j++){
            temp.add(j);
            dfs(j+1,sum+j,n,k,temp);
            temp.remove(temp.size()-1);
        }



    }
}