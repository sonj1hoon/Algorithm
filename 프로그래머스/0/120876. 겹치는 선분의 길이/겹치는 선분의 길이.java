class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] cnt = new int[200];
        
        for(int[] i : lines){
            int start = i[0]+100;
            int end = i[1]+100;
            for(int k=start; k<end; k++){
                cnt[k] +=1;
            }
        }
        
        for(int i:cnt){
            if(i>1) answer++;
        }
        return answer;
    }
}