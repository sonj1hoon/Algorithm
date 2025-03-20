import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        HashMap<Character, Integer> map;

        for(int i=0; i<N; i++){
            char[] c = br.readLine().replace(" ","").toLowerCase().toCharArray();
            map = new HashMap<>();
            for (char value : c) {
                if(value>='a' && value<='z'){
                    map.put(value, map.getOrDefault(value, 0) + 1);
                }
            }
            StringBuilder answer= new StringBuilder("missing ");
            for(char k='a'; k<='z'; k++){
                if(map.get(k)==null){
                    answer.append(String.valueOf(k));
                }
            }
            if(answer.toString().equals("missing ")){
                sb.append("pangram");
            }
            else{
                sb.append(answer);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}