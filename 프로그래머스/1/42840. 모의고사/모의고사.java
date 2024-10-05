import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = new int[]{1,2,3,4,5};
        int[] supo2 = new int[]{2,1,2,3,2,4,2,5};
        int[] supo3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(supo1[i%5]==answers[i]) score[0]++;
            if(supo2[i%8]==answers[i]) score[1]++;
            if(supo3[i%10]==answers[i]) score[2]++;
        }
        
        int maxScore = Math.max(score[0],Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<score.length; i++)
            if(score[i]==maxScore) list.add(i+1);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        return answer;
    }
}