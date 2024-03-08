import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int sum=0;
			int day=1;
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<6; j++) {
				sum+=Integer.parseInt(st.nextToken());
			}
			while(sum<=N) {
				sum*=4;
				day++;
			}
			System.out.println(day);
		}	
	}
}