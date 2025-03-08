import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static int min=256, max=0, N, M, B;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //y
        M = Integer.parseInt(st.nextToken()); //x
        B = Integer.parseInt(st.nextToken()); //작업 시작할 때 인벤 블럭 개수

        arr =new int[N][M]; // 집터 크기
        for(int i=0; i<N; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int k = Integer.parseInt(st1.nextToken());
                arr[i][j]=k;
                max = Math.max(max, arr[i][j]);
                min = Math.min(min, arr[i][j]);
            }
        }
        brute_force();
        System.out.println(sb);
    }
    private static void brute_force(){
        int time = Integer.MAX_VALUE;
        int height = 0;
        for(int i = min; i <=max; i++){
            int count = 0; int block = B;
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(i < arr[j][k]){
                        count += (arr[j][k]-i)*2;
                        block += (arr[j][k]-i);
                    }
                    else{
                        count += (i-arr[j][k]);
                        block -= (i-arr[j][k]);
                    }
                }
            }
            if(block<0) break;

            if(count<=time){
                time = count;
                height = i;
            }
        }
        sb.append(time).append(" ").append(height);
    }
}