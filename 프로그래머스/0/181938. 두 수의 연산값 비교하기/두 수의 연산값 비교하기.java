class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int abSum = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int abMul = 2*a*b;
        if(abSum > abMul){
            return abSum;
        }
        return abMul;
    }
}