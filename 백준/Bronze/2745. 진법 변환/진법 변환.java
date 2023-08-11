import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int N1=0;
        int B = Integer.parseInt(st.nextToken());
        char[] array=new char[B];
        for(int i=0; i<B; i++) {
        	if(i<10) {
        		array[i]=(char)(48+i);
        	}else {
        		array[i]=(char)(55+i);
        	}
        }
        for(int i=0; i<N.length(); i++) {
        	for(int j=0; j<B; j++) {
        		if(array[j]==N.charAt(i)) {
        			N1 += j*(int)Math.pow(B,N.length()-1-i);
            	}
        	}
        }System.out.print(N1);
	}
}