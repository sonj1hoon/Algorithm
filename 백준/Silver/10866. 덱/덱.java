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
        	case "push_front":
        		push_front(Integer.parseInt(st.nextToken()));
        		break;
        	case "push_back":
        		push_back(Integer.parseInt(st.nextToken()));
        		break;
        	case "pop_front":
        		sb.append(pop_front()).append("\n");
        		break;
        	case "pop_back":
        		sb.append(pop_back()).append("\n");
        		break;
        	case "size":
        		sb.append(size()).append("\n");
        		break;
        	case "empty":
        		sb.append(empty()).append("\n");
        		break;
        	case "front":
        		sb.append(front()).append("\n");
        		break;
        	case "back":
        		sb.append(back()).append("\n");
        		break;
        	}
        }
        System.out.println(sb);
	}
    public static void push_front(int n) {
    	if(size!=0) {
    		for(int r=size; r>=0; r--) {
    			Stack[r+1] = Stack[r];
    		}
    	}
    	Stack[0]=n;
		size++;
    }
    public static void push_back(int n) {
    	Stack[size]=n;
		size++;
    }
    public static int pop_front() {
    	if(size==0) {
    		return -1;
    	}else {
    		int i = Stack[0];
    		for(int r=1; r<=size; r++) {
    			Stack[r-1] = Stack[r];
    		}
    		Stack[size]=0;
    		size--;
    		return i;
    	}
    }
    public static int pop_back() {
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
    public static int front() {
    	if(size==0) {
    		return -1;
    	}else {
    		return Stack[0];
    	}
    }
    public static int back() {
    	if(size==0) {
    		return -1;
    	}else{
    		return Stack[size-1];
    	}
    }
}