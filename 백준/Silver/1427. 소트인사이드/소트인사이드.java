import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		char[] sort=new char[N.length()];
		
		for(int i=0; i<N.length(); i++) {
			sort[i]=N.charAt(i);
		}
		Arrays.sort(sort);
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=N.length()-1; i>=0; i--) {
			sb.append(sort[i]);
		}System.out.println(sb);
	}
}