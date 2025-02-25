import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //문서 갯수
            int M = Integer.parseInt(st.nextToken()); //원하는 문서의 인덱스

            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){ // list[0]=인덱스, list[1]=우선순위
                q.offer(new int[]{j,Integer.parseInt(st.nextToken())});
            }
            int count = 0;
            while(!q.isEmpty()){
                int[] front = q.poll();
                boolean isMax = true;

                for(int j=0; j<q.size(); j++){
                    if(front[1]<q.get(j)[1]){
                        q.offer(front);
                        for(int k=0; k<j; k++){
                            q.offer(q.poll());
                        }
                        isMax = false;
                        break;
                    }
                }
                if(!isMax) {
                    continue;
                }

                count++;
                if(front[0]==M){
                    sb.append(count).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}