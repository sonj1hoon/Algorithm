import java.io.*;
import java.util.*;

public class Main {
    static int blue=0, white=0;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        arr = new int[T][T];

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<T; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0, 0, T);

        sb.append(white).append("\n").append(blue);
        System.out.println(sb);
    }

    static void divide(int x, int y, int size){
        if(colorCheck(x,y,size)){ //파티션이 전부 같은 색일때
            if(arr[x][y]==0){ //전부 흰색이라면
                white++;
            }
            else{ //전부 파란색이라면
                blue++;
            }
            return;
        }

        int newSize = size/2;

        divide(x,y,newSize);
        divide(x+newSize,y,newSize);
        divide(x,y+newSize,newSize);
        divide(x+newSize,y+newSize,newSize);
    }

    static boolean colorCheck(int x, int y, int size){
        int color = arr[x][y]; //0,0에 해당하는 색 저장
        for(int i=x; i<x+size; i++){
            for(int j=y; j<y+size; j++){
                if(arr[i][j] != color){ //현재 파티션 0,0에 해당하는 색과 한개라도 다르다면
                    return false;
                }
            }
        }
        return true;
    }
}