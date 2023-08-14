import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
        	if(A==0&&B==0) break;
        	if(B%A==0) {
        		sb.append("factor\n");
        	}else if(A%B==0){
        		sb.append("multiple\n");
        	}else {
        		sb.append("neither\n");
        	}
        }
        System.out.println(sb);
	}
}