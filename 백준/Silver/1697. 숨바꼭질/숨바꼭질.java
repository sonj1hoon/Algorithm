import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    static int[] visited = new int[100001];
    static int N, K, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs(N);
        System.out.println(answer);

    }

    static void bfs(int x){
        Queue<Integer> q = new LinkedList<>();
        q.add(x);

        while(!q.isEmpty()){ // queue가 전부 빌때까지(더이상 연결된 노드가 없을때까지
            x=q.poll();

            if(x==K){
                answer = visited[x];
                break;
            }
            if(x-1>=0 && visited[x-1]==0){
                visited[x-1] = visited[x]+1;
                q.add(x-1);
            }
            if(x+1<=100000 && visited[x+1]==0){
                visited[x+1] = visited[x]+1;
                q.add(x+1);
            }
            if(x*2<=100000 && visited[x*2]==0){
                visited[x*2] = visited[x]+1;
                q.add(x*2);
            }
        }
    }
}