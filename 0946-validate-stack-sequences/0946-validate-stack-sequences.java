class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        

        Stack<Integer> stack=new Stack<>();

        int j=0;
        for(int i=0;i<pushed.length;i++){
            if(popped[j]==pushed[i]){
                j++;
                while(!stack.isEmpty() && stack.peek()==popped[j]){
                    stack.pop();
                    j++;
                }
            }else{
                stack.add(pushed[i]);
            }
        }

        while(!stack.isEmpty()){
            if(stack.pop()!=popped[j++]){
                return false;
            }
        }

        return true;

    }
}