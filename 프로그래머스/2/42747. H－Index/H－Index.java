import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        
        for(int i=0; i<len; i++){
            int hIndex = len-i;
            if(citations[i]>=hIndex){
                return hIndex;
            }
        }return 0;
    }
}