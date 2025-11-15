class Solution {
    public String fractionAddition(String expression) {
        List<String> exp=new ArrayList<>();

        String temp="";
        int i=0;
        if(expression.charAt(0)=='-'){
            i++;
            temp="-";
        }

        while(i<expression.length()){
            while(i<expression.length() && expression.charAt(i)!='-' && expression.charAt(i)!='+'){
                temp+=expression.charAt(i);
                i++;
            }
            exp.add(temp);
            if(i>expression.length()-1)break;
            temp=expression.charAt(i)=='-'?"-":"";
            i++;
        }


        // double sum=0;
        int n=0;
        int d=1;
        for(String s:exp){
            String[] str=s.split("/");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);

            n=n*b+d*a;
            d=d*b;

            int gcd=GCD(n,d);
            n/=gcd;
            d/=gcd;
        }

        if(d<0){
            d=-1*d;
            n*=-1;
        }

        return n+"/"+d;

    }

    //     System.out.println(sum);

    //     if(sum==0)return "0/1";

    //     boolean sign=false;
    //     if(sum<0){
    //         sum=-1*sum;
    //         sign=true;
    //     }

    //     int num=(int)sum;
    //     double point=sum-num;

    //     if(point==0){
    //         return num+"/1";
    //     }

    //     temp=point+"";

    //     char deno=temp.charAt(temp.length()/2);
    //     String res="1/"+deno;

    //     if(num!=0){
    //         int x=(deno-'0')*num+1;
    //         res=x+"/"+deno;
    //     }
        
    //     if(sign)return "-"+res;

    //     return res;
    // }

    // public double solve(String s){

    //     String[] str=s.split("/");

    //     double val=Double.parseDouble(str[0])/Double.parseDouble(str[1]);

    //     // System.out.println(val);
    //     return val;
    // }

    public int GCD(int a,int b){
        if(b==0)return a;

        return GCD(b,a%b);
    }
    
}