import java.io.*;
import java.util.*;

public class Main {
	public static int[] Stack;
	public static int size=0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Stack = new int[N];
        
        for(int i=0; i<N; i++) {
        	st = new StringTokenizer(br.readLine()," ");
        	
        	switch(st.nextToken()) {
        	case "push":
        		push(Integer.parseInt(st.nextToken()));
        		break;
        	case "pop":
        		sb.append(pop()).append("\n");
        		break;
        	case "size":
        		sb.append(size()).append("\n");
        		break;
        	case "empty":
        		sb.append(empty()).append("\n");
        		break;
        	case "top":
        		sb.append(top()).append("\n");
        		break;
        	}
        }
        System.out.println(sb);
	}
	public static void push(int n) {
    	Stack[size]=n;
		size++;
    }
    public static int pop() {
    	if(size==0) {
    		return -1;
    	}else {
    		int i = Stack[size-1];
    		Stack[size-1]=0;
    		size--;
    		return i;
    	}
    }
    public static int size() {
    	return size;
    }
    public static int empty() {
    	if(size==0) {
    		return 1;
    	}else {
    		return 0;
    	}
    }
    public static int top() {
    	if(size==0) {
    		return -1;
    	}else{
    		return Stack[size-1];
    	}
    }
}