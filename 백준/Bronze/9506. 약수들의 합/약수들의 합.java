import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int div;
    	
        while(N!=-1) {
        	div=1;
        	sb.setLength(0);
        	sb.append(N+" = 1");
        	for(int i=2; i<N; i++) {
        		if(N%i==0) {
        			sb.append(" + " + i);
        			div+=i;
        		}
        	}
    		if(div==N) {
    			System.out.println(sb);
    		}else {
    			System.out.println(N+" "+"is NOT perfect.");
    		}
    		N = Integer.parseInt(br.readLine());
        }
	}
}