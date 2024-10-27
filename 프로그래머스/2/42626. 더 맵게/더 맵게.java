import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:scoville) pq.add(i);
    
        int min = pq.peek();
        while(min<K){
            if(pq.size()>=2){
                pq.add(pq.poll()+(pq.poll()*2));
                min=pq.peek();
                answer++;
            }       
            else{
                return -1;
            }
        }
        return answer;
    }
}
/*
우선순위 큐 사용
무조건 가장 작은수+2번째 작은수*2하는게 더 좋음
*/