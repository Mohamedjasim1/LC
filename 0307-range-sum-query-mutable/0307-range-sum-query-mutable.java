class NumArray {

    SegmentTree st=null;
    public NumArray(int[] nums) {
        st=builtSegmentTree(nums,0,nums.length-1);
    }

    public SegmentTree builtSegmentTree(int[] arr,int l,int r){

        if(l==r){
            SegmentTree temp=new SegmentTree(l,r);
            temp.sum=arr[l];
            return temp;
        }
        
        SegmentTree node=new SegmentTree(l,r);
        int mid=(l+r)/2;
        SegmentTree left=builtSegmentTree(arr,l,mid);
        SegmentTree right=builtSegmentTree(arr,mid+1,r);
        node.sum=left.sum+right.sum;
        node.left=left;
        node.right=right;

        return node;

    }
    
    public void update(int index, int val) {
        updateTree(st,index,val);
    }

    public int updateTree(SegmentTree node,int index,int val){

    if(node.l==node.r){
        node.sum=val;
        return node.sum;
    }

    int a = 0, b = 0;

   
    if(index<=node.left.r){
        a=updateTree(node.left, index, val);
        b=node.right.sum;
    }else{
        b=updateTree(node.right, index, val);
        a=node.left.sum;   
    }

    node.sum=a+b;
    return node.sum;
}
    
    public int sumRange(int left, int right) {
        return sum(st,left,right);
    }

    public int sum(SegmentTree node,int left,int right){

        int l=node.l;
        int r=node.r;

        if(left<=l && right>=r){
            return node.sum;
        }else if(r<left ||  l>right){
            return 0;
        }else{
            return sum(node.left,left,right)+sum(node.right,left,right);
        }
    }
}

class SegmentTree{
    int l;
    int r;
    int sum;
    SegmentTree left;
    SegmentTree right;
    public SegmentTree(int l,int r){
        this.l=l;
        this.r=r;
        this.sum=0;
        this.left=null;
        this.right=null;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */