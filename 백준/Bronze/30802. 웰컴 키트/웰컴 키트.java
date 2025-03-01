import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<6; i++)  {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()); // 티셔츠 최소 주문 갯수
        int P = Integer.parseInt(st.nextToken()); // 펜 최소 주문 갯수

        int t = 0;
        for(int i:arr) {
            t += (i+T-1)/T;;
        }
        sb.append(t).append("\n");
        sb.append(N/P).append(" ").append(N%P);
        System.out.println(sb);
    }
}