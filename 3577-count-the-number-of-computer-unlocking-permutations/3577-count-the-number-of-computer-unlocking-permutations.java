class Solution {
    public int countPermutations(int[] com) {
        // return 0;

        int val=com[0];
        long res=1;
        for(int i=1;i<com.length;i++){
            if(val>=com[i])return 0;
            res=(res*i)%1000000007;
        }

        

        return ((int)res%1000000007);
    }
}

// 3=2
// 4=6
// 5=24
// 6=120