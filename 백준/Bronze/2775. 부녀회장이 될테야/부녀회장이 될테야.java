import java.io.*;
public class Main {
	//public static으로 정의함으로서 Main 클래스 내의 어떠한 클래스에서도 사용이 가능하게 됨
	public static int[][] APT = new int[15][15];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//아파트 호수마다 거주중인 인원 수 이중배열 입력 메서드
		make_APT();
		
		//받는 층과 호수의 갯수
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			//입력을 T하나당 2개 받는다... 한줄씩
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(APT[k][n]).append("\n");
		}
		System.out.println(sb);
	}
	//호수마다 거주중인 인원 넣는 메서드
	public static void make_APT() {
		for(int i=1; i<15; i++) {
			//각 층의 1호실은 전부 1명
			APT[i][1]=1;
			//0층의 모든 호실번호와 인원수는 같다.
			APT[0][i]=i;
		}
		//1층부터 14층까지
		for(int i=1; i<15; i++) {
			//2호부터 14호까지 (1호는 위에서 1로 다 채웠음)
			for(int j=2; j<15; j++) {
				//아래층의 n호실까지의 합은 k층의 n-1과 같다. 그러므로 (k층의 n-1호실)+(k-1층의 n호실)을 합한다.
				APT[i][j]=APT[i][j-1]+APT[i-1][j];
			}
		}
	}
}