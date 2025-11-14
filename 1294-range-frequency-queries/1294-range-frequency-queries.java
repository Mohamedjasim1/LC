class RangeFreqQuery {

    HashMap<Integer,ArrayList<Integer>> map;
    public RangeFreqQuery(int[] arr) {
        map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
    }
    
    public int query(int left, int right, int value) {

        if(!map.containsKey(value))return 0;
        List<Integer> arr=map.get(value);
        int l=0;
        int r=arr.size();

        return findRight(arr,l,r,right)-findLeft(arr,l,r,left);

    }

    public int findLeft(List<Integer> arr,int l,int r,int val){
        while(l<r){
            int mid=(l+r)/2;

            if(arr.get(mid)>=val){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }

    public int findRight(List<Integer> arr,int l,int r,int val){
        while(l<r){
            int mid=(l+r)/2;

            if(arr.get(mid)>val){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}

/**
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */