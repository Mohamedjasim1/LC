class Solution {
    public int captureForts(int[] forts) {
        
        int count=0;
        int sum=0;
        int i=0;
        while(i<forts.length && forts[i]==0){
            i++;
        }

        while(i<forts.length){
            if(forts[i]==1){
                while(i<forts.length && forts[i]==1){
                    i++;
                }
                // i++;
                while(i<forts.length && forts[i]!=-1){
                    i++;
                    if(i>forts.length-1 || forts[i]==1){
                        count=0;
                        break;
                    }
                    count++;
                    
                }
            }else if(forts[i]==-1){
                while(i<forts.length && forts[i]==-1){
                    i++;
                }
                // i++;
                while(i<forts.length && forts[i]!=1){
                    i++;
                    
                    if(i>forts.length-1 || forts[i]==-1){
                        count=0;
                        break;
                    }
                    count++;
                }
            }
            sum=Math.max(sum,count);
            count=0;
        }
        return sum;
    }
}