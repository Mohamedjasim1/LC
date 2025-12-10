class Solution {
    public int clumsy(int n) {
        
        int i=0;
        Stack<Integer> stack=new Stack<>();

        int res=0;
        for(int j=n;j>0;j--){

            if(stack.isEmpty()){
                stack.add(j);
            }else if(i==0){
                int val=stack.pop(); //4
                stack.add(val*j);
                i++;

            }else if(i==1){
                int val=stack.pop(); //4
                stack.add(val/j);
                i++;

            }else if(i==2){
                int val=stack.pop(); //4
                stack.add(val+j);
                i++;

            }else{

                int temp=stack.pop();

                // System.out.println(temp);
                if(res==0)res=temp;
                else res+=temp;
                stack.add(-1*j);
                i=0;

            }
            

        }

        // System.out.println(stack);
            if(!stack.isEmpty())res+=stack.pop();
        
        return res;


    }
}