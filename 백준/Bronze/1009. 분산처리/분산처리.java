import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		for(int i=0; i<cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int num=Integer.parseInt(st.nextToken());
			int pow=Integer.parseInt(st.nextToken());
			
			if(num%10==0) {
				num=10;
			}else {
				num%=10;
			}
			
			if(num==1||num==5||num==6||num==10) {
				System.out.println(num);
			}else if(num== 4 || num== 9) {
				if (pow%2==0) {
					System.out.println((int)((num*num)%10));
				}else {
					System.out.println(num);
				}
			}else {
				pow%=4;
				if (pow==0) {
					pow=4;
				}System.out.println((int)(Math.pow(num, pow)%10));
			}
		}
	}
}