import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] sort = new int[10001];
		
		
		for(int i=0; i<N; i++) {
			sort[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<10001; i++) {
			while(sort[i]>0) {
				sb.append(i).append('\n');
				sort[i]--;
			}
		}System.out.println(sb);
	}
}