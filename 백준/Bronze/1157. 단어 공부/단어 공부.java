import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s=br.readLine();
		int[] arr = new int[26];
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				arr[s.charAt(i)-'A']++;
			}else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				arr[s.charAt(i)-'a']++;
			}
        }
		int max=0;
		char ch=0;
		for(int i=0; i<26; i++) {
			if(arr[i]>max) {
				max=arr[i];
				ch=(char)(i+'A');
			}else if(arr[i]==max) {
				ch='?';
			}
		}
		System.out.print(ch);
		br.close();
		bw.close();
	}
}