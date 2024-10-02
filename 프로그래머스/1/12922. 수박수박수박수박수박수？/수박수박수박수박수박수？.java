class Solution {
    public String solution(int n) {
        String[] waterMelon = {"수", "박"};
        String answer = "";
        
        for(int i=0; i<n; i++){
            answer+=waterMelon[i%2];
        }return answer;
    }
}