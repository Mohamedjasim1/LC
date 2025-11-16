class Solution {
    public String pushDominoes(String dominoes) {
        Stack<Character> stack=new Stack<>();

        String res="";
        int count=0;
        for(int i=0;i<dominoes.length();i++){
            char c=dominoes.charAt(i);
            if(c=='R'){

                while(!stack.isEmpty()  && stack.peek()=='R'){
                    res+=stack.pop();
                    count--;
                    // continue;
                }

                // if(!stack.isEmpty()){
                //     // res+='R';
                //     continue;
                // }
                while(!stack.isEmpty() && stack.peek()=='.'){
                    res+='.';
                    stack.pop();
                }
                stack.add(c);
                count++;
            }else if(c=='.' && stack.isEmpty()){
                stack.add(c);
            }else if(c=='.' && stack.peek()=='R'){
                stack.add('R');
                count++;
            }else if(c=='.'){
                stack.add(c);
            }else{

                if(count!=0){
                    count++;
                    int lr=count/2;
                    int dot=count%2;
                    String left="";
                    String right="";
                    stack.clear();
                    for(int j=0;j<lr;j++){
                        left+='L';
                        right+='R';
                    }
                    res+=right+(dot==1?".":"")+left;

                }else{
                    res+='L';
                    while(!stack.isEmpty()){
                    res+='L';
                    stack.pop();
                    }
                }
                count=0;
            }
        }

        for(char c:stack){
            res+=c;
        }
        return res;
    }
}