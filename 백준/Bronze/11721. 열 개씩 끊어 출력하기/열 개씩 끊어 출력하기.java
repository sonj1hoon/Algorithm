import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			cnt++;
			if(cnt==10) {
				System.out.println();
				cnt=0;
			}
		}
	}
}