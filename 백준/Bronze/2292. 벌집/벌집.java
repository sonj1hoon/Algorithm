import java.io.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int D=2, C=1;
        while(D<=N) {
        	D=D+6*C;
        	C++;
        }
        System.out.println(C);
	}
}