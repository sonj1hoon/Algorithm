import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int S = Integer.parseInt(br.readLine());
		for(int i=0; i<S; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
	        int I = Integer.parseInt(st.nextToken());
	        String B=st.nextToken();
	        char[] array = B.toCharArray();
	        for(int j=0; j<B.length(); j++) {
	        	for(int k=0; k<I; k++) {
	        		sb.append(array[j]);
	        	}
	        }sb.append("\n");
		}
		System.out.println(sb.toString());
		br.close();
		bw.close();
	}
}