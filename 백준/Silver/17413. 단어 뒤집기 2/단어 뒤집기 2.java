import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='<'){
                while(s.charAt(i)!='>'){
                    sb.append(s.charAt(i));
                    i++;
                }sb.append('>');
            }
            else if(s.charAt(i)==' '){
                sb.append(" ");
            }
			else{
                while(i<s.length() && s.charAt(i) != ' ' && s.charAt(i) != '<'){
                    stack.push(s.charAt(i));
                    i++;
                }
                while(stack.empty()==false) {
                	sb.append(stack.pop());
                }
                i--;
            }
		}
		System.out.println(sb.toString());
	}
}