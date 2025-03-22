import java.io.*;
import java.util.*;

public class Main {
    public static long C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        System.out.println(pow(A,B));
    }

    private static long pow(long A, long B){
        if(B==1){
            return A%C;
        }

        long temp = pow(A, B/2);

        if(B%2==1){
            return (temp*temp%C) * A % C;
        }
        return temp*temp%C;

    }
}