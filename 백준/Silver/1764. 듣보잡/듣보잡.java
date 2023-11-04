import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1=Integer.parseInt(st.nextToken()); 
		int n2=Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<>();
		HashSet<String> result = new HashSet<>();
		
		
		for(int i=0; i<n1; i++) {
			set.add(br.readLine());
		}
		for(int j=0; j<n2; j++) {
			String s = br.readLine();
			if(set.contains(s)) {
				result.add(s);
			}
		}
		ArrayList<String> lastresult = new ArrayList<>(result);
		Collections.sort(lastresult);
		
		System.out.println(result.size());
		for(String s: lastresult) {
			System.out.println(s);
		}
	}
}