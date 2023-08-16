import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			if(a==0&&b==0&&c==0) {
				break;
			}
			if(a==b&&b==c) {
				result.append("Equilateral"+"\n");
			}else if(a+b<=c||a+c<=b||b+c<=a) {
				result.append("Invalid"+"\n");
			}else if(a==b||b==c||a==c){
				result.append("Isosceles"+"\n");
			}else {
				result.append("Scalene"+"\n");
			}
		}System.out.println(result);
	}
}