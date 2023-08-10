import java.io.*;
import java.util.StringTokenizer;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int temp;
		int[] A = new int[N];
		for(int c=0;c<N;c++) {
			A[c]=c+1;
		}
	
		for (int c = 0; c < M; c++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int i=Integer.parseInt(st1.nextToken())-1;
			int j=Integer.parseInt(st1.nextToken())-1;
			while(i<j) {
				temp=A[i];
				A[i]=A[j];
				A[j]=temp;
				i++;
				j--;
			}
		}
		for(int c=0; c<N; c++) {
			bw.write(A[c]+" ");
		}

		br.close();
		bw.close();
	}
}