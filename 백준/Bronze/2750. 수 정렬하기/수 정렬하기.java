import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] M = new int[N];
        int swap = 0;
        
        for(int i=0; i<N; i++) {
        	M[i] =Integer.parseInt(br.readLine());
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
        for(int i=0; i<N; i++) {
        	System.out.println(M[i]);
        }
	}
}