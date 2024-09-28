import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int sum=0;
        int prod=1;
        for(int i:num_list){
            sum+=i;
            prod*=i;
        }
        if(Math.pow(sum,2)>prod) return 1;
        return 0;
    }
}