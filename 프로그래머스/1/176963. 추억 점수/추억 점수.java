import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        //각 이름별 추억점수
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        
        //그룹별 점수 저장공간
        int[] answer = new int[photo.length];
        for(int i=0; i<photo.length; i++){
            int score = 0;
            for(String s : photo[i]){
                if(map.containsKey(s)){
                    score += map.get(s);
                }
            }
            answer[i] += score;
        }
        return answer;
    }
}