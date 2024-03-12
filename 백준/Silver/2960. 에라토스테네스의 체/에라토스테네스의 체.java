import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N= Integer.parseInt(st.nextToken());
		int K= Integer.parseInt(st.nextToken());
		int cnt=0;
		
		int[] arr = new int[N+1];
		for(int i=2; i<=N; i++) {
			arr[i]=i;
		}
		for(int i=2; i<=N; i++) {
			if(arr[i]==0) continue;
			
			for(int j=i; j<=N; j+=i) {
				if(arr[j]!=0) {
					cnt++;
					if(cnt==K) {
						System.out.println(j);
						break;
					}
				}arr[j]=0;
			}
		}
	}
}