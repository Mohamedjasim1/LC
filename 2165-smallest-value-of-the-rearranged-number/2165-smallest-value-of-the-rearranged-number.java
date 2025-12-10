class Solution {
    public long smallestNumber(long num) {
        

        if(num==0)return 0;
        String n=num+"";




        int sign=(num>=0)?1:-1;

        int[] arr=new int[n.length()-((sign==1)?0:1)];

        int i=(sign==1)?0:1;
        int zeroes=0;
        int j=0;
        while(i<n.length()){
            arr[j++]=n.charAt(i)-'0';
            i++;
            // if(arr[i]==0)zeroes++;
        }

        Arrays.sort(arr);

        



        String res="";

        if(sign==1){
            int k=0;
            String zero="";
             res="";
            while(k<n.length() && arr[k]==0){
                zero+='0';
                k++;
            }

            if(k<n.length())res=arr[k]+zero;

            k++;

            while(k<n.length()){
                res+=arr[k];
                k++;
            }
            
            // // /System.out.println(1);
            // System.out.println(zero);

            // System.out.println(1);


        }else{
            int k=n.length()-2;
            while(k>=0){
                res+=arr[k];
                k--;
            }

        }

        return sign*Long.parseLong(res);

    }
}