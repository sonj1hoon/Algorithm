import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		if(a1*n+a0<=c*n && c>=a1) {
			bw.write("1");
		}else {
			bw.write("0");
		}
		br.close();
		bw.close();
	}
}