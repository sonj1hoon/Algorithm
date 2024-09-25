class Solution {
    public int solution(int a, int b) {
        int gcd = getGCD(a,b);
        b/=gcd;
        
        while(b!=1){
            if(b%2==0){
                b/=2;
            }
            else if(b%5==0){
                b/=5;
            }
            else{
                return 2;
            }
        }return 1;
    }
    public static int getGCD(int a, int b){
        if(a%b==0){
            return b;
        }return getGCD(b, a%b);
    }
}
/*
1. a와 b의 공약수가 1이외엔 없어야하니 최대 공약수로 약분 해야한다.
2. 분모의 소인수가 2또는 5만 존재해야함
*/