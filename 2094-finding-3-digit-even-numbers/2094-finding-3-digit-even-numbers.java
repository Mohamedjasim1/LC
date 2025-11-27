class Solution {
    Set<Integer> res=new HashSet<>();
    
    public int[] findEvenNumbers(int[] digits) {
        
        helper(digits,0,3,0,-1,new HashSet<Integer>());
        
        return makeArray();

    }

    public void helper(int[] arr,int j,int k,int sum,int prev,HashSet<Integer> set){


        if(j>arr.length-1)return;
        if(k==0){
            
            if(sum>=100 && sum%2==0)res.add(sum);
            return;
        }

        if(k==3 && arr[j]==0){
            helper(arr,j+1,k,sum,j,set);
            return;
        }

        

        for(int i=0;i<arr.length;i++){

            if(prev==i || set.contains(i))continue;
            int temp=sum;
            sum=sum*10+arr[i];
            set.add(i);
            // System.out.println(sum);
            helper(arr,i,k-1,sum,i,set);
            sum=temp;
            set.remove(i);
        }

        return;
    }

    public int[] makeArray(){
        int[] arr=new int[res.size()];
        int j=0;
        for(int i:res){
            arr[j++]=i;
        }
         Arrays.sort(arr);
        return arr;
    }
}