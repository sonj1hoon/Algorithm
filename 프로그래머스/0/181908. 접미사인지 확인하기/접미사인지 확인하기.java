class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.length()<is_suffix.length()){
            return 0;
        }
        else if(my_string.substring(my_string.length()-is_suffix.length()).equals(is_suffix)){
            return 1;
        }
        return 0;
    }
}