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
	int[] swap = new int[1];
	int i,j;
	
	for(int c=0; c<N; c++) {
		A[c]=c+1;
	}
    for (int c = 0; c < M; c++) {
    	StringTokenizer st1 = new StringTokenizer(br.readLine());
    	i=Integer.parseInt(st1.nextToken())-1;
    	j=Integer.parseInt(st1.nextToken())-1;
    	swap[0] = A[i];
    	A[i]=A[j];
    	A[j]=swap[0];
    }
    for(int c=0; c<N; c++) {
    	bw.write(A[c]+" ");
    }
    br.close();
    bw.close();
}
}