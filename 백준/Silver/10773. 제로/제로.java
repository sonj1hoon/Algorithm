import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		int K = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<K; i++)	{
			int a = sc.nextInt();
			if(a==0) {
				list.removeLast();
			}else {
				list.add(a);
			}
		}
		sc.close();
		for(int data: list) {
			sum+=data;
		}
		System.out.println(sum);
	}
}