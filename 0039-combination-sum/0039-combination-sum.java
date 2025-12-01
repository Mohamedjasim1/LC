class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res=new ArrayList<>();

        dfs(0,candidates,target,res,new ArrayList<>(),0);
        return res;
    }

    public void dfs(int j,int[] candidates, int target ,List<List<Integer>> res,ArrayList<Integer> temp,int cur){

        if(cur>target)return;

        if(cur==target){
            res.add(new ArrayList<>(temp));
            // dfs(j+1,candidates,target,res,temp,cur);
            // temp.remove(temp.size()-1);
            return;
        }


        for(int i=j;i<candidates.length;i++){
            temp.add(candidates[i]);
            dfs(i,candidates,target,res,temp,cur+candidates[i]);
            temp.remove(temp.size()-1);
        }


    }
}