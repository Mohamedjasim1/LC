class Solution {
    Map<Integer,ArrayList<Integer>> map=new HashMap<>();
    Map<Integer,Integer> store=new HashMap<>();
    Set<Integer> set=new HashSet<>();

    public int countGoodNodes(int[][] edges) {
        
        for(int[] e:edges){
            map.putIfAbsent(e[0],new ArrayList<>());
            map.putIfAbsent(e[1],new ArrayList<>());

            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }

        dfs(0);
        set.clear();
        int count=0;
        for(int i=0;i<map.size();i++){
            set.add(i);
            // if(store.get())
            int prev=-1;
            boolean flag=true;
            for(int k:map.get(i)){
                
                if(store.get(k)>store.get(i)) continue;

                int sub=store.get(k);

                if (prev==-1)prev=sub;
                else if(prev!=sub)flag=false;
            }
            if(flag)count++;
        }
        
        // helper(0);


        // System.out.println(store);

        return count;
        
    }

    public int dfs(int i){

        if(set.contains(i))return 0;
        set.add(i);
        int count=0;

        for(int n:map.get(i)){
            if(set.contains(n))continue;
            count+=dfs(n);
        }


        store.put(i,count+1);

        return count+1;


    }
    // public int helper(int i){

   

    //     for(int n:map.get(i)){
    //         if(set.contains(n))continue;
    //         count+=dfs(n);
    //     }


    //     store.put(i,count);

    //     return count+1;


    // }
}