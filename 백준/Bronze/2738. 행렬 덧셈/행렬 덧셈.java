import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int[][] array=new int[N*2][M];
		
		for(int i=0; i<N*2; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				int input=Integer.parseInt(st1.nextToken());
				array[i][j]=input;
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				array[i][j]+=array[i+N][j];
				System.out.print(array[i][j]+" ");
			}System.out.println();
		}
	}
}