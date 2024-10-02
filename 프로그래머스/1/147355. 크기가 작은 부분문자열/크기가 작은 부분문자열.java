class Solution {
    public int solution(String t, String p1) {
        int answer = 0;
        int len = p1.length();
        for(int i=0; i<t.length()-len+1; i++){
            String p2 = t.substring(i,i+len);
            if(p2.compareTo(p1) <= 0){
                answer++;
            }
        }
        return answer;
    }
}