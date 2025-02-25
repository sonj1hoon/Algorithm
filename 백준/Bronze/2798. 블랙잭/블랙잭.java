import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[] arr = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        System.out.println(cal(arr,N,M));
    }
    static int cal(int[] arr, int N, int M){
        int compare=0;
        for(int i=0; i<N-2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int result = arr[i] + arr[j] + arr[k];

                    if (result == M) {
                        return result;
                    }
                    if (result < M && result > compare) {
                        compare = result;
                    }
                }
            }
        }return compare;
    }
}