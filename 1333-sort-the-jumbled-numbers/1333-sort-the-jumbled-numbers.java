class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        PriorityQueue<int[]> arr=new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1])return a[1]-b[1];

            return a[2]-b[2]; 
        });

        int i=0;
        for(int n:nums){
            
            int k=n;
            String num="";
            if(n==0){
                arr.add(new int[]{k,mapping[0],i});
                i++;
            continue; 
            }
            while(n>0){
                num=mapping[n%10]+num;
                n/=10;
            }
            int val=0;

            for(char c:num.toCharArray()){
                val=val*10+(c-'0');
            }

            // System.out.println(val);



            arr.add(new int[]{k,val,i});
            i++;
        }
        i=0;
        while(!arr.isEmpty()){
            nums[i++]=arr.poll()[0];
        }   

        return nums;
    }
}