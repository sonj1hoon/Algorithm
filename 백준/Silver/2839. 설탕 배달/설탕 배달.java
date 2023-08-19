import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        if(N==4||N==7) {
        	N=-1;
        }else if(N%5==0) {
        	N/=5;
        }else if((N%5)==1||(N%5)==3) {
        	N=(N/5)+1;
        }else if((N%5)==2||(N%5)==4) {
        	N=(N/5)+2;
        }System.out.println(N);
	}
}