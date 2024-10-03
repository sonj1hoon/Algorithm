import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        HashMap<String, String> numMap = new HashMap<>();
        numMap.put("zero", "0");
        numMap.put("one", "1");
        numMap.put("two", "2");
        numMap.put("three", "3");
        numMap.put("four", "4");
        numMap.put("five", "5");
        numMap.put("six", "6");
        numMap.put("seven", "7");
        numMap.put("eight", "8");
        numMap.put("nine", "9");

        for(String key : numMap.keySet())
            s=s.replaceAll(key, numMap.get(key));
        
        return Integer.parseInt(s);
    }
}