import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String[] s:clothes){
            List<String> list = map.getOrDefault(s[1], new ArrayList<>());
            list.add(s[0]);
            map.put(s[1], list);
        }
        
        int answer = 1;
        for (List<String> clothesList : map.values()) {
            answer *= (clothesList.size() + 1); // 종류2개+안입는다1개
        }
        
        return answer-1; //전부 안입는 경우 제외
    }
}
//최소 한개의 의상 -> 얼굴 제외 전신 탈의 가능? 
//코니 이 새@끼... 미친놈 아님?