class Solution {
    public String solution(int age) {
        String answer = "";
        String sAge = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");
        
        for(int i=0; i<ageArr.length; i++){
            answer+=sAge.charAt(Integer.valueOf(ageArr[i]));
        }
        return answer;
    }
}