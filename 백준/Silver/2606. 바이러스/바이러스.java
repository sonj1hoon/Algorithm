import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] node;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Com = Integer.parseInt(br.readLine()); // 숙주를 포함한 컴퓨터 수
        int Pair = Integer.parseInt(br.readLine()); // 연결된 컴퓨터 쌍의 수

        node = new ArrayList[Com+1];
        visited = new boolean[Com+1];

        for(int i=0; i<=Com; i++) {
            node[i] = new ArrayList<>();
        }

        while(Pair-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            node[a].add(b);
            node[b].add(a);
        }
        System.out.println(bfs(1));
    }

    public static int bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int temp = queue.poll();

            for(int next:node[temp]){
                if(!visited[next]){ //해당 컴퓨터가 false일때
                    visited[next] = true;
                    cnt++; //감염된 컴퓨터 증가
                    queue.add(next);
                }
            }
        }
        return cnt;
    }
}