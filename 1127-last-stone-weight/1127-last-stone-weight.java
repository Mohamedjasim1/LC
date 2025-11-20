class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());

        for(int i:stones){
            q.add(i);
        }

        while(q.size()>1){
            int a=q.poll();
         
            int b=q.poll();

            if(a!=b){
                q.add(a-b);
            }

        }

        return q.isEmpty()?0:q.poll();

        


    }
}