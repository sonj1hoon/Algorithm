class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            int payBack = n/a*b;
            answer+=payBack;
            n=payBack+n%a;
        }
        return answer;
    }
}