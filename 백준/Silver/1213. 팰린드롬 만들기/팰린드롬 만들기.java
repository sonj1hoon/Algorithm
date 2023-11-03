import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int[] arr = new int[26];
		
		//어떤 알파벳이 몇개 들어갔는지 저장하는 반복문
		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i)-'A']++;
		}
		int cnt=0;
		int middle = 0;
		//팰린드롬 여부확인 반복문
		for(int i=0; i<arr.length; i++) {
			//해당 분자의 갯수가 홀수일때
			if(arr[i]%2!=0) {
				cnt++;
				middle=i;
			}if(cnt>=2) {
				System.out.println("I'm Sorry Hansoo");
				return;
			}
		}
		//위에서 팰린드롬인것을 확인했다면 알파벳의 위치마다 저장된 숫자의 갯수만큼 append해준다.
		// arr[1]=2 라면 AA이런식으로
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i]/2; j++) {
				sb.append((char)(i+'A'));
			}
		}String result =  sb.toString();
		if(cnt==1) {
			result += (char)(middle+'A');
		}
		result+=sb.reverse().toString();
		System.out.println(result);
	}
}