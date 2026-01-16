class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ar=new ArrayList<>();

        backtrack(ar,res,nums);
        return res;
    }

    public void backtrack(List<Integer> ar,List<List<Integer>> res,int[] nums){

        if(ar.size()==nums.length){
                res.add(new ArrayList(ar));
                return;
            }

            for(int n:nums){
            if(ar.contains(n))continue;
            ar.add(n);
            // System.out.println(ar);
            backtrack(ar,res,nums);
            ar.remove(ar.size()-1);}
        
    }
}