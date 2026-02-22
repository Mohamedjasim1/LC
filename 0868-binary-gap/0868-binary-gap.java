class Solution {
    public int binaryGap(int n) {

        int max=0;
        boolean flag=false;
        while(n>0){
            int count=1;
            int bit=n%2;
            n/=2;
            System.out.println(bit);
            if(bit==1){
                if(n%2==1){
                    flag=true;
                    // count++;
                }
                while(n%2!=1 && n>0){
                    n/=2;
                    count++;
                    flag=true;
                }
            }
            max=Math.max(max,count);
            
        }

        return flag?max:0;
    }
}

// 110