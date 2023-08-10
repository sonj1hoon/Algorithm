import java.io.*;
import java.util.StringTokenizer;
public class Main{
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	StringTokenizer st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	int M = Integer.parseInt(st.nextToken());
	
	int[] A = new int[N];
	int i,j,k;
	
    for (int c = 0; c < M; c++) {
    	StringTokenizer st1 = new StringTokenizer(br.readLine());
    	i=Integer.parseInt(st1.nextToken());
    	j=Integer.parseInt(st1.nextToken());
    	k=Integer.parseInt(st1.nextToken());
        for(int in=i-1; in<j; in++) {
        	A[in]=k;
        }
    }
    for(int c=0; c<N; c++) {
    	bw.write(A[c]+" ");
    }

    br.close();
    bw.close();
}
}