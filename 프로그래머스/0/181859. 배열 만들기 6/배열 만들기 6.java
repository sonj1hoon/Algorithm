import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        stk.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(!stk.isEmpty()&&stk.get(stk.size()-1)==arr[i]){
                stk.remove(stk.size()-1);
            }
            else{
                stk.add(arr[i]);
            }
        }
        
        if(stk.isEmpty()){
            return new int[]{-1};
        }
        else{
            int[] answer = new int[stk.size()];
            for (int i = 0; i < stk.size(); i++) {
                answer[i] = stk.get(i);
            }
            return answer;
        }
    }
}