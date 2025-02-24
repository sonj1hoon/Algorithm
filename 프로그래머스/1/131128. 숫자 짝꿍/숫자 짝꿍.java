class Solution {
    public String solution(String X, String Y) {        
        int[] intX = new int[10];
        int[] intY = new int[10];
        
        for (char c : X.toCharArray()) {
            intX[c - '0']++;
        }

        for (char c : Y.toCharArray()) {
            intY[c - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int pairCount = Math.min(intX[i], intY[i]);
            for (int j = 0; j < pairCount; j++) {
                sb.append(i);
            }
        }
        
        if (sb.length() == 0) return "-1";
        if (sb.toString().charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}