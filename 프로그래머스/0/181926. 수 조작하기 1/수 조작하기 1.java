class Solution {
    public int solution(int n, String control) {
        n+=control.length()-control.replace("w","").length();
        n-=control.length()-control.replace("s","").length();
        n+=10*(control.length()-control.replace("d","").length());
        n-=10*(control.length()-control.replace("a","").length());
        return n;
    }
}