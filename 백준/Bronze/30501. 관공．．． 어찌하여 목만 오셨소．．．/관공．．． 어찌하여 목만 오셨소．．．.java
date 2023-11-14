import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			for(int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
				if(c=='S') {
					System.out.println(s);
					break;
				}
			}
		}
	}
}