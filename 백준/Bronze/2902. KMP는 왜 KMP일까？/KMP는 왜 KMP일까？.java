import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] sArr = br.readLine().split("-");
        for(String s:sArr){
            sb.append(s.charAt(0));
        }
        System.out.println(sb.toString());
    }
}