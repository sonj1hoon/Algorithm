class Solution {
    public int solution(int n) {
        int cnt1 = Integer.bitCount(n);
        
        while(true){
            n++;
            int cnt2 = Integer.bitCount(n);
            if(cnt1 == cnt2) break;
        }return n;
    }
}