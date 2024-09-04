import java.util.*;
class Solution {
    public String solution(String letter) {
        HashMap<String, String> hMap = new HashMap<String, String>();
        StringBuilder sb = new StringBuilder();
        String[] morse = { 
    ".- a","-... b","-.-. c","-.. d",". e","..-. f",
    "--. g",".... h",".. i",".--- j","-.- k",".-.. l",
    "-- m","-. n","--- o",".--. p","--.- q",".-. r",
    "... s","- t","..- u","...- v",".-- w","-..- x",
    "-.-- y","--.. z"};
        
        for(String s : morse){
            String[] splitMorse = s.split(" ");
            hMap.put(splitMorse[0], splitMorse[1]);
        }
        for (String s : letter.split(" ")) {
            sb.append(hMap.get(s));
        }
        
        return sb.toString();
    }
}

//모스 배열은 키와 값으로 구분하는게 편해서 HashMap을 사용했다.
//기존 일반배열에서 집어넣기 위해 요소를 하나씩 뽑아내며 split을 이용.
//나눠진 것을 저장용 배열의 0과 1 index에 집어넣은 뒤 hashmap의 put을 이용.
//문자를 문자열 형태를 보존하며 하나씩 뽑아내기 위해 s:string.split("")를 사용. 마지막으로 print로 뽑아낸다면 sb.머시기를 쓰면 되지만 sb는 그대로는 뽑아낼 수 없어서