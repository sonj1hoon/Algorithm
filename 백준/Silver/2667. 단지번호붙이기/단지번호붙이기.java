import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int[] xMove = new int[]{1,0,-1,0};
    static int[] yMove = new int[]{0,-1,0,1};
    static List<Integer> list = new ArrayList<>();
    static int cnt, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<N; j++){
                arr[i][j] = s.charAt(j)-'0';
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j]==1 && !visited[i][j]){
                    cnt=1;
                    dfs(i,j);
                    list.add(cnt);
                }
            }
        }
        Collections.sort(list);

        sb.append(list.size()).append("\n");
        for(int i:list){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x+xMove[i];
            int ny = y+yMove[i];
            if(nx>=0&&nx<N && ny>=0&&ny<N && !visited[nx][ny] && arr[nx][ny]==1){
                cnt++;
                dfs(nx,ny);
            }
        }
    }
}