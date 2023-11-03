import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
        //괄호나 ' '가 아닌 단어를 저장할 Stack 정의
		Stack<Character> stack = new Stack<>();
		
        //길이만큼 반복
		for(int i=0; i<s.length(); i++) {
            //<라면 >가 나올때까지 <부터 StringBuilder에 append해준뒤 >따로 추가
			if(s.charAt(i)=='<'){
                while(s.charAt(i)!='>'){
                    sb.append(s.charAt(i));
                    i++;
                }sb.append('>');
            }
            // ' '이라면 " "문자열을 append
            else if(s.charAt(i)==' '){
                sb.append(" ");
            }
            //단어인지 판단하는 기준은 위에서 걸러냈고 이 아래의 조건은 글자를 하나씩
            //stack에 집어넣을때 < 나 ' '을 집어넣는 것을 방지하기 위해서 넣은 것이다.
            //추가로 s.length()는 <나 ' '가 안온다면 while문은 무한 반복하므로 입력한
            //문자열의 길이까지만 반복하는 추가 조건이다.
			else{
                while(i<s.length() && s.charAt(i) != ' ' && s.charAt(i) != '<'){
                    //stack은 FILO이므로 먼저 넣은 것이 나중에 나온다. 단어가 뒤집힌다는 것.
                    stack.push(s.charAt(i));
                    i++;
                }
                while(stack.empty()==false) {
                	sb.append(stack.pop());
                }
                //위에서 push를 한 뒤에 i++를 했으므로 단어 뒤의 <나 ' ', 없는 값이 들어가게 될 수도 있다.
                //Exception이 발생하므로 다시 1 줄여준다...
                i--;
            }
		}
		System.out.println(sb.toString());
	}
}