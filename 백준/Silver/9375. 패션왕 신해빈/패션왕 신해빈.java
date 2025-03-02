import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while(n --> 0) {
            int m = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            String[] s;

            while(m-->0) {
                s = br.readLine().split(" ");
                map.put(s[1], map.getOrDefault(s[1], 0)+1);
            }
            int answer = 1;
            for(int count : map.values()) {
                answer*=(count+1);
            }
            sb.append(answer-1).append("\n");
        }
        System.out.println(sb);
    }
}