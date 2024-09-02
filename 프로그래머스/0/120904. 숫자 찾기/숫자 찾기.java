class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        int answer = numStr.indexOf(kStr)+1;
        if(answer!=0){
           return answer; 
        }else{
            return -1;
        }
    }
}