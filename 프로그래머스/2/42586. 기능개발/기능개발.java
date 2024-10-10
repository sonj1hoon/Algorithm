import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++){
            if((100-progresses[i])%speeds[i]==0){
                queue.add((100-progresses[i])/speeds[i]);
            }else{
                queue.add((100-progresses[i])/speeds[i]+1);
            }
        }
        
        int done = queue.poll();
        int count = 1;
        while(!queue.isEmpty()){
            if(done>=queue.peek()){
                count++;
                queue.poll();
            }else{
                list.add(count);
                count=1;
                done = queue.poll();
            }
        }list.add(count);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}