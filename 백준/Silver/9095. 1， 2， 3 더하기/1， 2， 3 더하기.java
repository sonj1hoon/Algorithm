import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[11];
            dp[0] = 1;
            dp[1] = 2;
            dp[2] = 4;

            for(int i=3; i<n; i++){
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
            sb.append(dp[n-1]).append("\n");
        }
        System.out.print(sb);
    }
}