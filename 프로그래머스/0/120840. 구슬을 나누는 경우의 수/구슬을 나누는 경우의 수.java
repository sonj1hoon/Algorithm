import java.util.*;
class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        int ballShare = 1;
        for(int i=share+1; i<=balls; i++){
            answer*=i;
            answer/=ballShare;
            ballShare++;
        }
        return (int)answer;
    }
}