class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        if(gradient(dots[1], dots[0]) == gradient(dots[3], dots[2])) return 1;
        else if(gradient(dots[3], dots[0]) == gradient(dots[1], dots[2])) return 1;
        else if(gradient(dots[2], dots[0]) == gradient(dots[1], dots[3])) return 1;
        else return 0;
    }
    private double gradient(int[] dot1, int[] dot2){
        return (double)(dot2[1]-dot1[1])/(dot2[0]-dot1[0]);
    }
}