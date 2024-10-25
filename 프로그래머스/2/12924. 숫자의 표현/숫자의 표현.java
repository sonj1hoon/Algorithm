class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i+=2){
            if(n%i==0) answer++;
        }
        return answer;
    }
}
/*
정수론 정리
주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 홀수 약수의 개수와 같다.
*/