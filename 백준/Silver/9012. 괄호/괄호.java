import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			sb.append(solve(br.readLine())).append('\n');
		}
		System.out.println(sb);
	}
	
	public static String solve(String s) {
		Stack<Character> stk = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c=='(') {
				stk.push(c);
			}
			else if(stk.empty()) {
				return "NO";
			}
			else {
				stk.pop();
			}
		}
		if(stk.empty()) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
}