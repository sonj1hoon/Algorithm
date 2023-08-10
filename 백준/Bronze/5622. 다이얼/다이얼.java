import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int t=0;
		for(int j=0; j<s.length(); j++) {
			char c = s.charAt(j);
			int index = c-'A';
			if(index==0||index==1||index==2) {
				t+=3;
			}else if(index==3||index==4||index==5){
				t+=4;
			}else if(index==6||index==7||index==8){
				t+=5;
			}else if(index==9||index==10||index==11){
				t+=6;
			}else if(index==12||index==13||index==14){
				t+=7;
			}else if(index==15||index==16||index==17||index==18){
				t+=8;
			}else if(index==19||index==20||index==21){
				t+=9;
			}else if(index==22||index==23||index==24||index==25){
				t+=10;
			}
		}
		System.out.println(t);
		br.close();
	}
}