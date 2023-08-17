import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a= new int[3];
		a[0] = Integer.parseInt(st.nextToken());
		a[1] = Integer.parseInt(st.nextToken());
		a[2] = Integer.parseInt(st.nextToken());
		Arrays.sort(a);
		if(a[0]+a[1]>a[2]) {
			System.out.println(a[0]+a[1]+a[2]);
		}else {
			System.out.println((a[0]+a[1])*2-1);
		}	
	}
}