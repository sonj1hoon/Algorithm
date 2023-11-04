import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		StringTokenizer st1 = new StringTokenizer(s, "0");
		StringTokenizer st2 = new StringTokenizer(s, "1");
		System.out.println(Math.min(st1.countTokens(),st2.countTokens()));
			
	}
}