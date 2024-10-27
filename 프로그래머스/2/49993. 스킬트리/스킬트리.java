class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String s:skill_trees){
            s=s.replaceAll("[^"+skill+"]","");
            
            int skillIdx=0;
            boolean isValid = true;
            for(char c:s.toCharArray()){
                int idx=skill.indexOf(c);
                if(idx!=skillIdx) {
                    isValid=false;
                    break;
                }else skillIdx++;
            }if(isValid) answer++;
        }return answer;
    }
}
/*
c b d
선행스킬트리 순서만 지켜주면 좋습니다.

1. skill_trees를 돌며 skill목록에 없는 문자열은 전부 제거한다.
2. indexOf로 검사하여 인덱시 미일치 시 isValid = false
*/