import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        //받은 문자열을 검사할 문자열s
		String s;
		
		while(true) {
            //무한반복의 종료 조건으로 s문자열에 받은 문자열이 "."하나로 끝이라면 종료되게 함
			s=br.readLine();
            //문자열 내용 비교 후 강제 종료
			if(s.equals(".")) {
				break;
			}
            //solve메서드에 문자열을 집어넣어 검사하고 나온 결과를 StringBuilder에 추가 후 줄 변경
			sb.append(solve(s)).append('\n');
		}
		System.out.println(sb);
	}
	
    //검사하는 메서드
	public static String solve(String s) {
        //char형으로 입력을 받을 수 있는 Stack정의 
		Stack<Character> stk = new Stack<>();
		
        //문자열 길이만큼 반복하며 하나씩 c에 넣음
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
            //(거나 [면 추가함(그 이외인 ),], 다른 문자들은 제외)
			if(c=='('||c=='[') {
				stk.push(c);
			}
            //)일 때 비어있거나 마지막으로 오는게 (가 아니라면([일수도 있음) "no" return.
			else if(c==')'){
				if(stk.empty()||stk.peek()!='(') {
					return "no";
				}
                //그 이외에는 pop으로 제거
				else {
					stk.pop();
				}
			}
            //]일 때 비어있거나 마지막으로 오는게 [가 아니라면((일수도 있음) "no" return.
			else if(c==']'){
				if(stk.empty()||stk.peek()!='[') {
					return "no";
				}
                //그 이외에는 pop으로 제거
				else {
					stk.pop();
				}
			}
		}
        //위의 조건을 모두 통과했다면 잔여 (나 [가 남아있거나 텅텅 비어있는 상태이므로 
        //비어있으면 "yes" return.
		if(stk.empty()) {
			return "yes";
		}
        //(나 [가 남아있으면 "no" return
		else {
			return "no";
		}
	}
}