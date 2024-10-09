import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<want.length; i++){
            map.put(want[i], number[i]);
        }
        
        for(int i=0; i<discount.length-9; i++){
            HashMap<String, Integer> dMap = new HashMap<>();
            for(int j=0; j<10; j++){
                dMap.put(discount[i+j], dMap.getOrDefault(discount[i+j],0)+1);
            }
            Boolean match=true; 
            for(String key:map.keySet()){
                if(map.get(key)!=dMap.get(key)){
                    match=false;
                    break;
                }
            }
            if(match) count++;
        }
        return count;
    }
}