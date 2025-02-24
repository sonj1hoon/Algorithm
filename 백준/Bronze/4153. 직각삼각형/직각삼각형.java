import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");

        while(!s[0].equals("0") && !s[1].equals("0") && !s[2].equals("0")){
            int line1 = (int)Math.pow(Integer.parseInt(s[0]),2);
            int line2 = (int)Math.pow(Integer.parseInt(s[1]),2);
            int line3 = (int)Math.pow(Integer.parseInt(s[2]),2);
            if (line3 == line1 + line2) {
                sb.append("right\n");
            }else if(line2 == line1 + line3){
                sb.append("right\n");
            }else if(line1 == line2 + line3){
                sb.append("right\n");
            }else {
                sb.append("wrong\n");
            }
            s = br.readLine().split(" ");
        }
        System.out.println(sb);
    }
}