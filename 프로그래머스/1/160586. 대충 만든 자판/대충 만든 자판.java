import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];
        
        for(int i=0; i<targets.length; i++){
            String target = targets[i];
            
            for(String s:target.split("")){
                int min = Integer.MAX_VALUE;
                
                for(String k:keymap){
                    int idx = k.indexOf(s);
                    if(idx!=-1&&min>idx){
                        min=idx;
                    }
                }
                
                if(min<Integer.MAX_VALUE && result[i] != -1){
                    result[i] += min + 1;
                }else{
                    result[i] = -1;
                }
            }
            
        }
        return result;
    }
}