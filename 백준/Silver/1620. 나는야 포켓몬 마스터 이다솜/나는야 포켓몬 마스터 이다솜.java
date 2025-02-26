import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> imap = new HashMap<>();
        HashMap<String, Integer> smap = new HashMap<>();


        for(int i=0; i<n; i++){
            String s = br.readLine();
            imap.put(i, s);
            smap.put(s, i+1);
        }
        for(int i=0; i<m; i++){
            String question = br.readLine();
            if(!Character.isDigit(question.charAt(0))){
                sb.append(smap.get(question)).append('\n');
            }
            else{
                sb.append(imap.get(Integer.parseInt(question)-1)).append('\n');
            }
        }
        System.out.print(sb);
    }
}