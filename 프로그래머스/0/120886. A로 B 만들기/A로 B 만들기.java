import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        if(Arrays.equals(a,b)){
            return 1;
        }
        return 0;
    }
}