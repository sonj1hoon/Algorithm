import java.io.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		char[][] array=new char[5][15];
		int max=-1;
		
		for(int i=0; i<5; i++) {
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				array[i][j]=str.charAt(j);
				if(max<str.length()) {
					max=str.length();
				}
			}
		}
		for(int j=0; j<max; j++) {
			for(int i=0; i<5; i++) {
				if(array[i][j]!=0) {
					System.out.print(array[i][j]);
				} continue;
			}
		}
	}
}