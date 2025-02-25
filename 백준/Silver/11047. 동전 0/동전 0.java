import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;

        int[] coin = new int[T];
        for(int i=0; i<T; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        for(int i=T-1; i>=0; i--){
            if(M==0) break;
            answer+=M/coin[i];
            M%=coin[i];
        }
        System.out.println(answer);
    }
}