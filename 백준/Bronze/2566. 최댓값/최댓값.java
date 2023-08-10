import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int[][] array=new int[9][9];
		int max=-1, x=0, y=0;
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				int input=Integer.parseInt(st.nextToken());
				array[i][j]=input;
				if(max<input) {
					max=input;
					x=i+1;
					y=j+1;
				}
			}
		}
		System.out.println(max+"\n"+x+" "+y);
		br.close();
	}
}