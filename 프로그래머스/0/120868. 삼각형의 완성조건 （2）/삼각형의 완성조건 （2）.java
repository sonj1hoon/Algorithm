import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        int lowLimit = sides[1] - sides[0] + 1;
        int highLimit = sides[1] + sides[0];
        
        return highLimit - lowLimit;
    }
}