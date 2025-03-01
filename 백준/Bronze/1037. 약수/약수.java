import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[T];
        int max = 1, min = 1000001;
        StringTokenizer st = new StringTokenizer(br.readLine());
        if(T==1){
            System.out.println((int)Math.pow(Integer.parseInt(st.nextToken()),2));
        }else{
            for(int i=0; i<T; i++){
                int n =Integer.parseInt(st.nextToken());
                if(n>max){
                    max = n;
                }
                if(n<min){
                    min = n;
                }
            }
            System.out.println(max*min);
        }
    }
}