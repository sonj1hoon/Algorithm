class Solution {
    public int solution(int coupon) {
        int answer = 0;
        
        while(coupon>=10){
            int freechicken = coupon/10; 
            answer+=freechicken;
            coupon = freechicken+coupon%10;
        }
        return answer;
    }
}
