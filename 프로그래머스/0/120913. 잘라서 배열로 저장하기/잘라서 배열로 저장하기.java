class Solution {
    public String[] solution(String my_str, int n) {
        //길이 그대로면 남는 찌꺼기가 있으니 +n
        //n으로 나눈게맞아떨어지는 경우를 생각해 -1
        String[] answer = new String[(my_str.length()+n-1)/n];
        for(int i=0; i<answer.length; i++){
            int start = n*i;
            int end = 0;
            if(start+n>=my_str.length()){
                end = my_str.length();
            }else{
                end = start+n;
            }
            answer[i] = my_str.substring(start,end);
        }
        return answer;
    }
}