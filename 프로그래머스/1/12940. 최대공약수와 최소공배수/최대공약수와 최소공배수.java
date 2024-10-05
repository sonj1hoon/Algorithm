class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = getGCD(n,m);
        answer[0] = gcd;
        answer[1] = (n*m)/gcd;
        return answer;
    }
    private int getGCD(int a, int b){
        if(a%b==0){
            return b;
        }
        return getGCD(b, a%b);
    }
}