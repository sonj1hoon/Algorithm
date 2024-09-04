import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int le = emergency.length;
        int[] answer = new int[le];
        
        for(int i=0; i<le; i++){
            answer[i]=1;
            for(int j=0; j<le; j++){
                if(emergency[i]<emergency[j])
                    answer[i]++;
            }
        }
        return answer;
    }
}