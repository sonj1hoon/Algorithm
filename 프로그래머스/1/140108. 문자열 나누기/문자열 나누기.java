class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        char x = s.charAt(0);
    
        for(int i=0; i<s.length(); i++){
            if(x==s.charAt(i)){ 
                count++;
            }else{ 
                count--;
            }
            if(count==0){
                answer++;
                if(i+1<s.length()){
                    x=s.charAt(i+1);
                }
            }
        }
        if(count!=0){
            answer++;
        }
        return answer;
    }
}