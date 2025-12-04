class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            // System.out.println(reverse(nums[i]));
            if(map.containsKey(nums[i])){
                min=Math.min(min,Math.abs(map.get(nums[i])-i));
                map.put(reverse(nums[i]),i);
            }else{
                map.put(reverse(nums[i]),i);
            }
        }

        

        return min==Integer.MAX_VALUE?-1:min;
    }


    public int reverse(int num){
        int res=0;

        while(num>0){
            res=(res*10)+(num%10);
            num/=10;
        }

        return res;

        
    }
}