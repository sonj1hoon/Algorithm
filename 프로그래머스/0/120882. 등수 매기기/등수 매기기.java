class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] answer = new int[len];
        Double[] avg = new Double[len];
        
        for(int i=0; i<len; i++){
            avg[i] = (score[i][0]+score[i][1])/2.0; 
        }
        for(int i=0; i<len; i++){
            answer[i]=1;
            for(int j=0; j<len; j++){
                if(avg[i]<avg[j]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}