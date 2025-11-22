class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> Stack=new ArrayList<>();
        int j=0;
        int c=0;
        for(int i=1;i<=n;i++){

            
            if(c==target[target.length-1]){
                break;
            }

            if(target[j]==i){
                Stack.add("Push");
                j++;
                c++;
            }else if(target[j]!=i){
                Stack.add("Push");
                Stack.add("Pop");
                c++;
            }
           
        }
        return Stack;
    }
}