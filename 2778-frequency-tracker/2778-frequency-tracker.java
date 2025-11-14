class FrequencyTracker {

    HashMap<Integer,Integer> map;
    HashMap<Integer,HashSet<Integer>> freq;

    public FrequencyTracker() {
        map=new HashMap<>();
        freq=new HashMap<>();
    }
    
    public void add(int number) {

        int old=map.getOrDefault(number,0);
        int neww =old+1;
        map.put(number,neww);
        // int val=map.get(number);
        
        if(old>0){
            freq.get(old).remove(number);
            
            if(freq.get(old).isEmpty()){
            freq.remove(old);
        }
        }
        
        
        // temp.remove();
        freq.putIfAbsent(neww,new HashSet<>());
        freq.get(neww).add(number);
    }
    
    public void deleteOne(int number) {
        if(!map.containsKey(number))return;

        int old=map.get(number);
        int now=old-1;
       
       
        freq.get(old).remove(number);
        if(freq.get(old).isEmpty())freq.remove(old);

        if(now==0){
            map.remove(number);
        }else{
        map.put(number,now);
        freq.putIfAbsent(now,new HashSet<>());
        freq.get(now).add(number);
        }
        
    }
    
    public boolean hasFrequency(int frequency) {
        
        // if(map.containsKey(frequency)){
        //     return map.get(frequency)
        // }

        return freq.containsKey(frequency);
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */