import java.util.*;
class Solution { 
    public int solution(int k, int[] tangerine) {
        int sum = 0;
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>( );
        for(int i:tangerine){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList, Collections.reverseOrder());
        for(int v:valueList){
            cnt++;
            sum+=v;
            if(sum>=k) break;
        }return cnt;
    }
}