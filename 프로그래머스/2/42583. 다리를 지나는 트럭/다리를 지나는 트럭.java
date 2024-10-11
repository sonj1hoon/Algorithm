import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> waitingT = new LinkedList<>();
        Queue<Integer> crossingT = new LinkedList<>();
        Queue<Integer> crossingTimes = new LinkedList<>();
        int time = 0;
        int totalCrossingWeight = 0;
        
        
        //queue에 대기트럭 저장
        for(int i:truck_weights){waitingT.add(i);}
        
        //대기하는 트럭이 없을 때 까지 반복
        while(!crossingT.isEmpty() || !waitingT.isEmpty()){
            time++;
            
            //건너는 트럭이 다리를 다 건널시간에 무게를 차감
            if(!crossingTimes.isEmpty() && crossingTimes.peek()==time){
                crossingTimes.poll();
                crossingT.poll();
            }
            
            //다음 대기 트럭+현재 건너는 트럭 무게가 한도를 넘지 않는다면
            if(!waitingT.isEmpty() && totalWeight(crossingT)+waitingT.peek()<=weight){
                int nextTruck = waitingT.poll();
                crossingT.add(nextTruck);
                crossingTimes.add(time + bridge_length); 
            }
        }return time;
    }
    
    private int totalWeight(Queue<Integer> queue){
        int total=0;
        for(Integer weight:queue){
            total+=weight;
        }return total;
    }
}
/*
모든 트럭이 다리를 건너려할때 걸리는 '최소 시간'구하기
bridge_length : 다리에 올라갈 수 있는 '트럭의 수'
weight : 다리가 견딜 수 있는 '무게'
시간경과 기준은 1. 다리에 올라갈때+다리에서 이동할때(1당 1초) 2. 다리에서 내려갈 때
최종 경과 시간은 다리에 올라온 모든 차가 내려갔을 때

동시에 진행불가.
트럭의 목록은 Queue.
*/