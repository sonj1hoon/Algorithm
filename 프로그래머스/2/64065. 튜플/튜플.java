import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(2,s.length()-2);
        String[] str = s.split("},\\{");
        int[] answer = new int[str.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String o1, String o2){
                return Integer.compare(o1.length(),o2.length());
            }
        });
        
        int idx = 0;
        for(String x:str){
            String[] temp = x.split(",");
            for(int i=0; i<temp.length; i++){
                int n = Integer.parseInt(temp[i]);
                if(!list.contains(n)) {
                    answer[idx++] = n;
                    list.add(n);
                }
            }
        }return answer;
    }
}