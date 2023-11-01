import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int price=sc.nextInt();
		for(int i=0; i<9; i++) {
			sum+=sc.nextInt();
		}sc.close();
		System.out.println(price-sum);
	}
}