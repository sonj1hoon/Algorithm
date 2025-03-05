import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            if(n==0 && !pq.isEmpty()){
                sb.append(pq.poll()).append("\n");
            }
            else if(n==0 && pq.isEmpty()){
                sb.append(0).append("\n");
            }
            else{
                pq.add(n);
            }
        }
        System.out.println(sb);
    }
}