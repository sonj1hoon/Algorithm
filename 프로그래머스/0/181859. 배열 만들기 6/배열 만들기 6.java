import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> dq = new ArrayDeque<>();
        
        dq.addLast(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!dq.isEmpty() && dq.peekLast() == arr[i]) {
                dq.removeLast();
            } else {
                dq.addLast(arr[i]);
            }
        }

        if (dq.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] answer = new int[dq.size()];
            int index = 0;
            while (!dq.isEmpty()) {
                answer[index++] = dq.pollFirst();
            }
            return answer;
        }
    }
}
