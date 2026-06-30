class Solution {
        public int numberOfSubstrings(String s) {
                char[] ar=s.toCharArray();

        int l=0;
        int[] freq=new int[3];
                int res=0;
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'a']++;

            while(size(freq)==3){
                res+=s.length()-r;
            freq[s.charAt(l)-'a']--;
               l++;                                                                                                                         }}  
               return res; }

        public int size(int[] arr){
            int s=0;
            for(int i:arr){
                if(i>0){
                    s++;
                }else{
                    return 0;
                }
                
            }
            return s;
        }

}

                                                                                                                                                                                        
                                                             