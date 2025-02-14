import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies){ 
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // HashMap에 약관명을 key로, 기간을 value로 해서 집어넣기
        for(int i=0; i<terms.length; i++){ 
            String[] arr = terms[i].split(" ");
            map.put(arr[0], Integer.parseInt(arr[1]));
        }
        
        // 개인정보
        for(int i=0; i<privacies.length; i++){
            String[] arr = privacies[i].split(" ");
            //유효기간 만료날짜
            Integer expire = period(arr[0])+map.get(arr[1]) * 28 - 1;
            //오늘 날짜
            Integer todaysum = period(today);
            
            if(todaysum>expire){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    
    // 총 일수의 합
    private Integer period(String s1){
        String[] arr = s1.split("\\.");
        Integer year = Integer.parseInt(arr[0])*12*28;
        Integer month = Integer.parseInt(arr[1])*28;
        Integer day = Integer.parseInt(arr[2]);
        return year+month+day;
    }
}