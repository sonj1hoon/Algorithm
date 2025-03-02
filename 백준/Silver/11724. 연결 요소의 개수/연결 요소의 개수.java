import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] node;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        node = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i=1; i<=N; i++){
            node[i] = new ArrayList<>();
        }

        while(M --> 0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            node[a].add(b);
            node[b].add(a);
        }

        int cnt = 0;
        for(int i=1; i<=N; i++){
            if(!visited[i]){
                bfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int temp = q.poll();

            for(int i: node[temp]){
                if(!visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}