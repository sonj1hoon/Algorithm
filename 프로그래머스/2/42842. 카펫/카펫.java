class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        
        for(int w=3; w<sum; w++){
            if(sum%w!=0) continue;
            int h=sum/w;
            int in = (w-2)*(h-2);
            int out = sum-in;
            if(in==yellow && out==brown){
                answer[0]=h;
                answer[1]=w;
                break;
            }
        }return answer;
    }
}