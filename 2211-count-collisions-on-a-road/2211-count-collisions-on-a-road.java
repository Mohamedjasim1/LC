class Solution {
    public int countCollisions(String d) {
        
        int count=0;
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<d.length();i++){
            if(stack.isEmpty()){
                stack.add(d.charAt(i));
            }else if(d.charAt(i)=='L' && stack.peek()=='R'){
                stack.pop();
                stack.add('S');
                count+=2;
            }else if(d.charAt(i)=='L' && stack.peek()=='S'){
                count++;
            }else if(d.charAt(i)=='S' && stack.peek()=='R'){
                stack.pop();
                stack.add('S');
                count++;
            }else{
                stack.add(d.charAt(i));
            }
        }

        boolean flag=false;

        // System.out.println(stack);

        while(!stack.isEmpty()){

            char c=stack.pop();
            if(c=='S'){
                flag=true;
            }else if(flag && c=='R'){
                count++;
            }

        }
        
        return count;

    }
}