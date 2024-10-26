class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = game(a, b, 1);
        return answer;
    }
    private int game(int a, int b, int round){
        a=(a+1)/2;
        b=(b+1)/2;
        if(a==b){
            return round;
        }
        return game(a, b, round+1);
    }
}
//1~N참가자들끼리 토너먼트로 게임 진행.
//승리자는 1~N/2번 번호 배정
// A와 B참가자는 '반드시 승리한다'
//1  2  3  4  5  6  7  8
//  2     4     6     7
//     4           7
// 3라운드에서 만났음
//총 N/2라운드 까지 있음