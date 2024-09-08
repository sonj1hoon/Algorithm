class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middle = total/num;
        if(num%2==1){
            answer[0]=middle - num/2;
        }else{
            answer[0]=middle - num/2+1;
        }
        for(int i=1; i<num; i++){
            answer[i] = answer[i-1]+1;
        }
        return answer;
    }
} 