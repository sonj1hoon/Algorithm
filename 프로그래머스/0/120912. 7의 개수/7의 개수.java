class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i:array){
            String numStr = String.valueOf(i);
            for(char c : numStr.toCharArray()){
                if(c=='7') answer++;
            }
        }
        return answer;
    }
}