class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        
        int sum=0;



        for(int n:nums){
            sum+=n;
        }
        
        int[] tot=new int[k];
        Arrays.sort(nums);
        reverse(nums);

        // System.out.println(sum/k);
        

        return dfs(0,tot,nums,sum/k);
    }

    public boolean dfs(int i,int[] tot,int[] nums,int tar){


        if(i==nums.length)return true;
        
        

            for(int k=0;k<tot.length;k++){


                if(tot[k]+nums[i]>tar)continue;

                tot[k]+=nums[i];

                if(dfs(i+1,tot,nums,tar)){
                
                return true;

                }

                tot[k]-=nums[i];

                if(tot[k]==0)break;
                   
            }

        return false;

    }

    public void reverse(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int t = a[l]; 
            a[l] = a[r]; 
            a[r] = t;
            l++; 
            r--;
        }
    }
}