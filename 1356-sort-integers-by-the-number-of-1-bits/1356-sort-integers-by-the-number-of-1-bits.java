class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i:arr){
            int bit=bitCount(i);
            map.putIfAbsent(bit,new ArrayList());
            map.get(bit).add(i);
        }

        // System.out.println();

        int j=0;
        for(int i=0;i<15;i++){
            if(map.get(i)==null)continue;
            for(int val:map.get(i)){
                arr[j++]=val;
            }
            // System.out.println(map.get(i));
        }
        
        

        return arr;

    }


    public int bitCount(int n){
        int count=0;
        // System.out.println(n);

        while(n>0){
            count+=n&1;
            n>>=1;
        }
        // System.out.println(count);
        return count;

    }
}