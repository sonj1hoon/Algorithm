import java.io.*;
import java.util.*;
public class Main{
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int count=0;
	boolean[] A = new boolean[42];
	for(int i=0; i<10; i++) {
		int a=Integer.parseInt(br.readLine());
		int b=a%42;
		
		if(!A[b]) {
			A[b]=true;
		}
	}
	for(boolean c:A) {
		if(c) {
			count++;
		}
	}
	System.out.println(count);
    br.close();
    bw.close();
}
}
