import java.util.*;
class Solution {
    public int solution(int[] array) {
        int[] frequent = new int[1000];
        int max = 0;
        int answer = 0;
        
        for(int i=0; i<array.length; i++){
            frequent[array[i]]++;
            
            if(max < frequent[array[i]]){
                max = frequent[array[i]];
                answer = array[i];
            }else if(max == frequent[array[i]]){
                answer = -1;
            }
        }
        
        return answer;
    }
}