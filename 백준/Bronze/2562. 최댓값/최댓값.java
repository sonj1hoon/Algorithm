import java.io.*;
import java.util.StringTokenizer;
public class Main{
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	int[] A = new int[9];
    int max = -1000000;
    int count=0;
	
    for (int i = 0; i < 9; i++) {
    	int num = Integer.parseInt(br.readLine());
        A[i] = num;
        if (A[i] > max) {
            max = A[i];
            count=i+1;
        }
    }
    bw.write(max+"\n"+count);

    br.close();
    bw.close();
}
}