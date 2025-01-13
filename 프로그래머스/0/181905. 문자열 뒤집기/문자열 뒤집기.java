import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String str = my_string.substring(s,e+1);
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
        return my_string.replace(str,reverse);
    }
}