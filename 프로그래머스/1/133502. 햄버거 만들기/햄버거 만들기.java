import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stk = new Stack<Integer>();  
        for(int i:ingredient){
            stk.push(i);
            if(stk.size()>=4){
                if(stk.get(stk.size()-4)==1 
                   && stk.get(stk.size()-3)==2 
                   && stk.get(stk.size()-2)==3 
                   && stk.get(stk.size()-1)==1){
                    answer++;
                    stk.pop();
                    stk.pop();
                    stk.pop();
                    stk.pop();
                }   
            }
        }
        return answer;
    }
}