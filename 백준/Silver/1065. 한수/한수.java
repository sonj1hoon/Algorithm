import java.io.*;

public class Main {
	public static int cnt=99;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		System.out.println(cal(N));
	}
	public static int cal(int N) {
		if(N<100) {
			return N;
		}
		else {
			for(int i=100; i<=N; i++) {
				int a=i/100;
				int b=i%100/10;
				int c=i%10;
				if(a-b==b-c) {
					cnt++;
				}
			}return cnt;
		}
	}
}