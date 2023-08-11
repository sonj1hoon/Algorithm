import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        char[] array=new char[B];
        for(char i=0; i<B; i++) {
        	if(i<10) {
        		array[i]=(char)(48+i);
        	}else {
        		array[i]=(char)(55+i);
        	}
        }
        StringBuilder result = new StringBuilder();
        while(N>0) {
        	int A=N%B;
        	result.insert(0, array[A]);
        	N/=B;
        }
        System.out.println(result);
	}
}