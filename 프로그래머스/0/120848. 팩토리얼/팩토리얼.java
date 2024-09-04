class Solution {
    public int solution(int n) {
        int cnt = 0;
        while(n>0){
            cnt++;
            n/=cnt;
        } return cnt-1;
    }
}