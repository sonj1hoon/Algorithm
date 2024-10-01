class Solution {
    public long solution(long n) {
        long answer = 0;
        if(Math.sqrt(n)%1!=0){
            return -1;
        }else{
            long nextSquare = (long) Math.sqrt(n) + 1;
            return nextSquare * nextSquare;
            //return (int)Math.pow(Math.sqrt(n)+1,2);
        }
    }
}