class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        numer1*=denom2;
        numer2*=denom1;
        answer[0] = numer1+numer2;
        answer[1] = denom1*denom2;
        
        int div = gcd(answer[0], answer[1]);
        answer[0]/=div;
        answer[1]/=div;
        
        return answer;
    }
    public static int gcd(int p, int q){
        if(q==0) return p;
        return gcd(q, p%q);
    }
}