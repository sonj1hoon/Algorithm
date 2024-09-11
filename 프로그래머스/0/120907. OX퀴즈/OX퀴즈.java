class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){ //한문제씩 처리
            String[] question = quiz[i].split(" "); //공백을 기준으로 분리하여 배열에 저장
            int answer = Integer.parseInt(question[0]); //첫번째는 반드시 문자.
            
            //두번째 문자열의 +/-여부에 따라 세번째 계산
            if(question[1].equals("+")) answer+=Integer.parseInt(question[2]);
            else answer-=Integer.parseInt(question[2]);
            
            //제시된 결과값과 비교하여 O또는 X 기입
            if(question[4].equals(answer+"")) result[i]="O";
            else result[i]="X";
        }
        return result;
    }
}