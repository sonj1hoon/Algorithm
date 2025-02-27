import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    static boolean[] visited;
    static int node, line, start;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];
        visited = new boolean[node+1];

        while(line-->0){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            arr[a][b] = arr[b][a] = 1; //연결 여부 확인
        }

        dfs(start);
        sb.append("\n");
        visited = new boolean[node+1];
        bfs(start);

        System.out.println(sb);
    }

    public static void dfs(int start){
        visited[start] = true;
        sb.append(start).append(" ");

        for(int i=1; i<=node; i++){
            if(arr[start][i]==1 && !visited[i]){
                dfs(i);
            }
        }
    }
    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            start = q.poll();
            sb.append(start).append(" ");

            for(int i=1; i<=node; i++){
                if(arr[start][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }

        }
    }
}