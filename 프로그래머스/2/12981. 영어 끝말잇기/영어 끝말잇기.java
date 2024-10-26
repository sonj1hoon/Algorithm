import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2]; // answer[0]:사람번호, answer[1]:돌았는 바퀴 수
        List<String> list = new ArrayList<>(); //가장 최근에 말했던 단어 
        list.add(words[0]); //초기값 설정
        
        for(int i=1; i<words.length; i++){ // 0번째는 미리 넣어놨으니 1번째 부터
            if(checkWord(list.get(list.size()-1), words[i]) || list.contains(words[i])){
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            }
            list.add(words[i]);
        }
        return answer;
    }
    private boolean checkWord(String latestWord, String word){
        if(latestWord.charAt(latestWord.length()-1) == word.charAt(0)){
            return false; //끝말잇기 성립 안됨
        }
        return true; //끝말잇기 성립됨
    }
}
//중간에 끝말잇기 탈락자 발생시
//answer[0]에 몇번 사람인지. answer[1]에 몇 바뀌째 돌았었는지 출력하고
//탈락자 없으면 그냥 int배열 초기값 0,0 출력하기