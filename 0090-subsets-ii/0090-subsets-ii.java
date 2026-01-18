class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort( nums );
    int[] check=new int[nums.length];
    
    dfs(list, new ArrayList<>(), nums, 0);
    return list;
}

private void dfs(List<List<Integer>> res , ArrayList<Integer> curr, int [] nums, int i){

    
    res.add(new ArrayList(curr));

    for(int start=i;start<nums.length;start++){
        if(i!=start && nums[start]==nums[start-1])continue;
        curr.add(nums[start]);
        dfs(res,curr,nums,start+1);
        curr.remove(curr.size()-1);
        // dfs(res,curr,nums,i+1);
    }

    
    
}}