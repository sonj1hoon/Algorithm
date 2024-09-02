import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=n; i++)
            if(n%i==0) list.add(i);
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);  // 각 요소를 배열로 복사
        }
        return result;
    }
}