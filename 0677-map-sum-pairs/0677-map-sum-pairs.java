class Trie{
    Trie[] children;
    int score;
    Trie(){
        children=new Trie[26];
        score=0;
    }

    public void insert(String word,int score,boolean check,int val){
        Trie node=this;

        for(char c:word.toCharArray()){
            if(node.children[c-'a']==null){
                node.children[c-'a']=new Trie();
            }
            node=node.children[c-'a'];
            if(!check){
                node.score+=score;
            }else{
                node.score+=score-val;
            }
        }
    }

    public int sum(String word){
        Trie node=this;
        int count=0;
        for(char c:word.toCharArray()){
            if(node.children[c-'a']==null){
                node.children[c-'a']=new Trie();
            }
            node=node.children[c-'a'];
            count=node.score;
        }
        return count;
    }
}

class MapSum {

    Trie trie;
    Map<String,Integer> set=new HashMap<>();
    public MapSum() {
        trie=new Trie();
    }
    
    public void insert(String key, int val){
        boolean flag=false;
        if(set.containsKey(key)){
            flag=true;
            trie.insert(key,val,flag,set.get(key));
        }else{
            trie.insert(key,val,flag,0);
        }
        set.put(key,val);
    }
    
    public int sum(String prefix) {
        return trie.sum(prefix);
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */