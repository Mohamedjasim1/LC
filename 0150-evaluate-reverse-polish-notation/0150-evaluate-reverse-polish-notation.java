class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();

        for(String s:tokens){
            if(s.matches("-?\\d+")){
                stack.push(Integer.parseInt(s));
            }
            else{
                if(s.equals("+")){
            // System.out.println(stack);

                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(a+b);
            // System.out.println(stack);

                }
                else if(s.equals("-")){
                    int b=stack.pop();
                    int a=stack.pop();
                    
                    stack.push(a-b);
                }
                else if(s.equals("/")){
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a/b);
                }
                else{
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(a*b);
                }
            }
            // System.out.println(stack);

        }
        return stack.pop();
    }
}