import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    static boolean[][] visited;
    static int M, N;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            arr = new int[M][N];
            visited = new boolean[M][N];
            int count = 0;

            for(int i=0; i<K; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = 1;
            }

            for(int i=0; i< M; i++){
                for(int j=0; j<N; j++){
                    if(!visited[i][j] && arr[i][j]==1){ //아직 미방문, 배추가 심어진 좌표 맞는지 확인
                        bfs(i,j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        while(!q.isEmpty()){
            x=q.peek()[0];
            y=q.peek()[1];
            visited[x][y] = true;
            q.poll();
            for(int i=0; i<4; i++){
                int cx = x + dirX[i];
                int cy = y + dirY[i];

                if(cx>=0 && cy>=0 && cx<M && cy<N){
                    if(!visited[cx][cy] && arr[cx][cy] == 1){
                        q.add(new int[]{cx,cy});
                        visited[cx][cy]=true;
                    }
                }
            }
        }
    }
}