import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int[][] arrayA=new int[N][M];
		int[][] arrayB=new int[N][M];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				int input=Integer.parseInt(st1.nextToken());
				arrayA[i][j]=input;
			}
		}
		for(int i=0; i<N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				int input=Integer.parseInt(st1.nextToken());
				arrayB[i][j]=input;
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				int sum=arrayA[i][j]+arrayB[i][j];
				System.out.print(sum+" ");
			}System.out.println();
		}
	}
}