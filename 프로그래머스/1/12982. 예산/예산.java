import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer=0;
        int cnt=0;
        Arrays.sort(d);
        for(int i:d){
            if(answer+i<=budget){
                answer+=i;
                cnt++;
            }else break;
        }return cnt;
    }
}