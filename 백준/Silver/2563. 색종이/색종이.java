import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		boolean[][] array=new boolean[100][100];
		int ex = 0;
		
		for(int c=0; c<N; c++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
	        int x = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());
	        for(int i=x; i<x+10; i++) {
	        	for(int j=y; j<y+10; j++) {
	        		if(array[i][j]== false) {
	        			array[i][j] = true;
	        			ex++;
	        		}
	        	}
	        }
		}
		System.out.println(ex);
	}
}