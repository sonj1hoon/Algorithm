import java.util.*;
class Solution {
    public int solution(String my_string) {
        String[] s = my_string.split(" ");
        int answer=Integer.parseInt(s[0]);
        
        for(int i=2; i<s.length; i+=2){
            if(s[i-1].equals("+")){
                answer+=Integer.parseInt(s[i]);
            }else{
                answer-=Integer.parseInt(s[i]);
            }
        }
        
        return answer;
    }
}