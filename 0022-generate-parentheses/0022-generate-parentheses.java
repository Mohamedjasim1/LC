class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();


        backtrack(0,0,res,"",n);
        return res;
    }

    public void backtrack(int a,int b,List<String> res,String str,int n){

        if(a==b && str.length()==n*2){
            res.add(str);
            return;
        }

        if(a<n){
             backtrack(a+1,b,res,str+"(",n);
        }
        
        if(b<a){
             backtrack(a,b+1,res,str+")",n);
        }
      
       
       

    }
}
