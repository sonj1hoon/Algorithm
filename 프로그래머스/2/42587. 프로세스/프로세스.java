import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        //queue에 [우선순위, 현인덱스] 형태로 삽입
        for(int i=0; i<priorities.length; i++){
            queue.add(new int[]{priorities[i], i});
        }
        
        int answer = 0;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            boolean higherPriority = false;
            
            //poll()에 있는 것보다 높은 우선순위 탐색
            for(int[] process:queue){
                if(process[0]>current[0]){
                    higherPriority = true;
                    break;
                }
            }
            
            //더 높은 우선순위가 있다면 뒤로 넘겨주기
            if(higherPriority){
                queue.add(current);
            }else{ //가장 높은 우선순위라면
                answer++; 
                if(current[1]==location){ //기존 index와 location일치 시
                    return answer; //answer번째 출력
                }
            }
        }return answer;
    }
}