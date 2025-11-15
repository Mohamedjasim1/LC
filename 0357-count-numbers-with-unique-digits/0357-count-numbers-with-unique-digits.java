class Solution {
        // int[] num={1,2,3,4,5,6,7,8,9};
        int count=1;
    public int countNumbersWithUniqueDigits(int n) {

        if(n==0)return 1;
        boolean[] vis=new boolean[10];
        dfs(n,"",1,vis);
        return count;
    }

    public void dfs(int n,String s,int i,boolean[] vis){
        
        if(s.length()>0){
            // System.out.println(s);
            count++;
        }

        if(s.length()==n) return;

        for(int start=0;start<=9;start++){
            if(vis[start])continue;
            if (s.length() == 0 && start == 0) continue;
            
            vis[start]=true;
            dfs(n,s+start,start+1,vis);
            vis[start]=false;
        }
    }
}