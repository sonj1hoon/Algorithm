import java.util.*;
class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        String[] n1 = bin1.split("");
        String[] n2 = bin2.split("");
        int result = 0;
        int power = 1;

        for(int i = n1.length - 1; i >= 0; i--) {
            result += Integer.parseInt(n1[i]) * power;
            power *= 2;
        }
        
        power = 1; 
        for(int i = n2.length - 1; i >= 0; i--) {
            result += Integer.parseInt(n2[i]) * power;
            power *= 2;
        }

        while(result > 0) {
            answer = (result % 2) + answer; 
            result /= 2;
        }

        return answer.equals("") ? "0" : answer;
    }
}
