import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int[] moveX = new int[]{0,1,0,-1};
    static int[] moveY = new int[]{1,0,-1,0};
    static int N, M, targetX, targetY;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1][M+1];
        visited = new boolean[N+1][M+1];

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 2){
                    targetY = i;
                    targetX = j;
                    arr[i][j] = 0;
                }
            }
        }
        bfs(targetY, targetX);

        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                if(arr[i][j] == 1 && !visited[i][j]){ //1이지만(방문예정) 방문한적 없음 = 도달할 수 없는 곳
                    sb.append(-1).append(" ");
                }
                else{
                    sb.append(arr[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void bfs(int y, int x){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y,x});

        while(!q.isEmpty()){
            int[] location = q.poll(); // 이동할 곳의 위치
            for(int i=0; i<4; i++){
                int movedY = location[0]+moveY[i];
                int movedX = location[1]+moveX[i];
                if((movedY>=1 && movedY<=N) && (movedX>=1 && movedX<=M) && arr[movedY][movedX]==1 && !visited[movedY][movedX]){
                    arr[movedY][movedX] = arr[location[0]][location[1]] + 1;
                    q.add(new int[]{movedY,movedX});
                    visited[movedY][movedX] = true;
                }
            }
        }
    }
}