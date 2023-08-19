import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
		int[] M = new int[N];
        int swap = 0;
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
        	M[i] = Integer.parseInt(st1.nextToken());
        }
        for(int i=N-1; i>0; i--) {
        	for(int j=0; j<N-1; j++) {
            	if(M[j]>M[j+1]) {
            		swap=M[j];
            		M[j]=M[j+1];
            		M[j+1]=swap;
            	}
            }
        }
        System.out.println(M[N-k]);
	}
}