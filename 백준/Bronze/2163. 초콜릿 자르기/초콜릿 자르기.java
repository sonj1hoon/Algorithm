import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int W = Integer.parseInt(s[0]);
        int H = Integer.parseInt(s[1]);

        System.out.println((W-1)+(H-1)*W);
    }
}