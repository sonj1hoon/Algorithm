class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        int idx = 0;

        // 문자열에서 한글자씩 뽑아냄
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i); // i 인덱스에 해당하는 char

            // 숫자일 때
            if (Character.isDigit(c)) {
                // 두 자리가 숫자일 경우 10을 처리
                if (dartResult.charAt(i + 1) == '0') {
                    score[idx] = 10;
                    i++; // '0'을 건너뛰도록 인덱스 증가
                } else {
                    score[idx] = c - '0'; // 한 자리 숫자일 경우
                }
                idx++;
            }
            // 문자일 때
            else {
                switch (c) {
                    case 'D':
                        // 제곱
                        score[idx-1] = (int) Math.pow(score[idx-1], 2);
                        break;
                    case 'T':
                        // 세제곱
                        score[idx-1] = (int) Math.pow(score[idx-1], 3);
                        break;
                    case '*':
                        if (idx-1 > 0) score[idx-2] *= 2; // 이전 점수 2배
                        score[idx-1] *= 2; // 현재 점수 2배
                        break;
                    case '#':
                        score[idx-1] *= -1; // 현재 점수 반전
                        break;
                }
            }
        }
        for (int s : score) {
            answer += s;
        }
        return answer;
    }
}