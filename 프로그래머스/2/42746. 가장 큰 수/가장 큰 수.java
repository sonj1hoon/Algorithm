import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] numToStr = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            numToStr[i]=Integer.toString(numbers[i]);        
        }
        
        Arrays.sort(numToStr, (o1, o2) -> -(o1+o2).compareTo(o2+o1));
        
        for(String i:numToStr){
            answer+=i;
        }
        
        answer = answer.replaceAll("^0+", "");
        if(answer.length()==0) answer="0";
        return answer;
    }
}