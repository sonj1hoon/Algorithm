import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		String S = br.readLine();
		int[]A = new int[26];
		for(int i=0; i<26; i++) {
			A[i]=-1;
		}
		for(int i=0; i<S.length(); i++) {
			char c= S.charAt(i);
			int index = c-'a';
			if(A[index]==-1) {
				A[index]=i;
			}
		}
		for(int j=0; j<26; j++) {
			System.out.print(A[j]+" ");
		}
        br.close();
        bw.close();
	}
}