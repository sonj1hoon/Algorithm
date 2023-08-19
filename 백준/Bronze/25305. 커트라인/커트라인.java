import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
		int[] M = new int[N];
        int swap = 0;
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
        	M[i] = Integer.parseInt(st1.nextToken());
        }Arrays.sort(M);
        System.out.println(M[N-k]);
	}
}