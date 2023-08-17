import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[]c=new int[N];		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			c[i] = Integer.parseInt(st1.nextToken());
		}
		
		int result = 0;
		int compare = 0;
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					result = c[i]+c[j]+c[k];
					
					if(result==M) {
						System.out.println(result);
						i=N-3;
						j=N-2;
						break;
					}
					if(compare<result&&result<M) {
						compare=result;
					}
				}
			}
		}if(result!=M) {
			System.out.println(compare);
		}
	}
}