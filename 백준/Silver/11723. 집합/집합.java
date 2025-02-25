import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int binary = 0;
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operator = st.nextToken();
            int number = 0;
            if (!operator.equals("all") && !operator.equals("empty") && st.hasMoreTokens()) {
                number = Integer.parseInt(st.nextToken());
            }

            switch(operator){
                case "all":
                    binary |= (1<<21)-1;
                    break;
                case "empty":
                    binary = 0;
                    break;
                case "add":
                    binary |= (1<<number);
                    break;
                case "remove":
                    binary &= ~(1<<number);
                    break;
                case "check":
                    sb.append((binary & (1 << number)) != 0 ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    binary ^= (1<<number);
                    break;
            }
        }
        System.out.println(sb);
    }
}