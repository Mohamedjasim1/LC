class Solution {
    public int countOdds(int low, int high) {
        
        int count=0;
        if(low%2==1){
            low++;
            count++;
        }

        if(high%2==1){
            low++;
            count++;
        }

        count+=(high-low)/2;

        return count;

    }
}