import java.io.*;
import java.util.*;

public class Main{
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int N = Integer.parseInt(br.readLine());
	int[] A = new int[N];
    int max = -1000000, min = 1000000;
    StringTokenizer st = new StringTokenizer(br.readLine());
	
    for (int i = 0; i < N; i++) {
        A[i] = Integer.parseInt(st.nextToken());
        if (A[i] > max) {
            max = A[i];
        }
        if (A[i] < min) {
            min = A[i];
        }
    }
    bw.write(min + " " + max + "\n");

    br.close();
    bw.close();
}
}