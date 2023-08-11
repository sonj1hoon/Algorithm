import java.io.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        int[] coins = {25, 10, 5, 1};
        
        for(int i=0; i<T; i++) {
        	int N = Integer.parseInt(br.readLine());
        	for(int coin:coins) {
        		int out = N/coin;
        		N%=coin;
        		bw.write(out+" ");
        	}bw.write("\n");
        }bw.flush();
	}
}