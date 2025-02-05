import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = in.nextInt(); // 응시자 수
        }

        int B = in.nextInt();
        int C = in.nextInt();

        long total = 0; // 필요한 총 감독 수
        for(int i = 0; i < N; i++) {
            total++;
            A[i]-=B;

            if (A[i] > 0) {
                total += (A[i] / C);
                if (A[i] % C != 0) { // 나머지가 있다면 부감독관 1명 추가
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}