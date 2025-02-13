import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        LinkedList<String> list = new LinkedList<String>();


        for(int i=1; i<len-2; i++) {
            for(int j=i+1; j<len; j++) {
                String a1 = s.substring(0,i);
                String b1 = s.substring(i,j);
                String c1 = s.substring(j);

                String a2 = new StringBuilder(a1).reverse().toString();
                String b2 = new StringBuilder(b1).reverse().toString();
                String c2 = new StringBuilder(c1).reverse().toString();

                list.add(a2+b2+c2);
            }
        }
        Collections.sort(list);
        System.out.println(list.pop());
    }
}