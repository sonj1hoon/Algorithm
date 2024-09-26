class Solution {
    static int cnt = 0;
    public int solution(int num) {
        cnt = 0;
        return collatz((long)num);
    }
    public int collatz(long n){
        if(cnt==500) return -1;
        if(n==1) return cnt;
        cnt++;
        if(n%2==0)
            n/=2;
        else
            n=n*3+1;
        return collatz(n);
    }
}