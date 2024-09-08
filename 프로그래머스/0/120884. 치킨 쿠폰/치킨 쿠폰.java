class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        
        while(coupon>=10){
            int freechicken = coupon/10; 
            answer+=freechicken;
            coupon = freechicken+coupon%10;
        }
        return answer;
    }
}
