class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        // HashMap<String,Integer> map= new HashMap<>();
        HashSet<String> set= new HashSet<>();

        int count=0;

        for(String w:words){
            if(set.contains(reverse(w)))count++;

            set.add(w);
        }


        return count;

    }

    public String reverse(String word){

        String s="";

        for(int i=word.length()-1;i>=0;i--){
            s+=word.charAt(i);
        }

        System.out.println(s);

        return s;

    }
}