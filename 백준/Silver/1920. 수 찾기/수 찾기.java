import java.io.*;
import java.util.*;

public class Main {
	public static int[] Array;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		//N을 입력 받습니다.
		int N = Integer.parseInt(br.readLine());
		//문자열 타입으로 N의 크기를 가진 배열이 생성 됩니다.
		Array = new int[N];
		//공백을 구분기준으로 분리하는 st입니다. st.nextToken()으로 사용합니다.
		st = new StringTokenizer(br.readLine()," ");
		//Array[0]부터 Array[N]까지 st1으로 나눠 받은 값들을 저장합니다.
		for(int i=0; i<N; i++) {
			Array[i] = Integer.parseInt(st.nextToken());
		}
		//배열 정렬
		Arrays.sort(Array);
		
		//M을 입력 받습니다.
		int M = Integer.parseInt(br.readLine());
		//st.nextToken();으로 공백을 구분기준 삼아 분리힙니다.
		st = new StringTokenizer(br.readLine()," ");
		
		//출력하는 줄의 수
		for(int i=0; i<M; i++) {
			//binarySearch에 반복 한번에 st 하나씩 집어넣는다.
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append('\n'); //찾고자 하는 값이 있으면 1
			}
			else {
				sb.append(0).append('\n'); //찾고자 하는 값이 없으면 0
			}
		}System.out.println(sb);
	}
	public static int binarySearch(int key) {
		int lo = 0;
		int hi = Array.length-1; //길이 곧대로 쓰면 예외 나옴... 배열에 없는 값 찾는다고.
		
		//**반복하며 범위를 좁혀야한다.**
		//Array[key]값이 lo와 hi의 절반보다 큰지 작은지 판단해야한다.
		while(lo<=hi) {
	
			int mid = (lo+hi)/2; //mid는 배열의 중간 위치를 찾는다.
			
			if(Array[mid] > key) { //찾고자하는 값이 배열의 중간보다 작으면 오른쪽 끝의 범위를 중간으로 줄인다.
				hi=mid-1;
			}else if(Array[mid] < key){ //찾고자하는 값이 배열의 중간보다 크면 왼쪽 끝의 범위를 중간으로 늘린다.
				lo=mid+1;
			}else {
				return mid; //계속 좁히다가 마지막엔 key값이 있는 배열의 위치를 출력하게 된다.
			}
		}
		return -1; //배열 내에 key값과 일치하는 값이 없다면 -1를 반환한다.
	}
}