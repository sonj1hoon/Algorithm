import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer>set = new HashSet<>();
    
        for(int i:nums) set.add(i);
        if(nums.length/2<set.size()) return nums.length/2;
        else return set.size();
    }
}


//기본 길이/2<set길이 충족하면 기본길이/2 아니면 set길이