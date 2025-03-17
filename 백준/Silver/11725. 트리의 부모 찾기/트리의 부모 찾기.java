import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int[] parent;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new ArrayList[N+1];
        visited = new boolean[N+1];
        parent = new int[N+1];

        for(int i=1; i<=N; i++){
            arr[i] = new ArrayList<>();
        }

        for(int i=0; i<N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a].add(b);
            arr[b].add(a);
        }

        bfs(1);

        for(int i=2; i<=N; i++){
            System.out.println(parent[i]);
        }
    }

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int n = q.poll();

            for(int i:arr[n]){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                    parent[i] = n;
                }
            }
        }
    }
}