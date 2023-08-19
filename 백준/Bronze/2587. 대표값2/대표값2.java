import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] M = new int[5];
        int swap = 0;
        int sum = 0;
        
        for(int i=0; i<5; i++) {
        	M[i] =Integer.parseInt(br.readLine());
        	sum+=M[i];
        }
        for(int i=4; i>0; i--) {
        	for(int j=0; j<4; j++) {
            	if(M[j]>M[j+1]) {
            		swap=M[j];
            		M[j]=M[j+1];
            		M[j+1]=swap;
            	}
            }
        }
        System.out.println(sum/5);
        System.out.println(M[2]);
	}
}