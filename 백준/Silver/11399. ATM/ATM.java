import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<T; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int temp = 0;
        int answer = 0;
        for(int i=0; i<T; i++){
            temp += arr[i];
            answer += temp;
        }
        System.out.print(answer);
    }
}