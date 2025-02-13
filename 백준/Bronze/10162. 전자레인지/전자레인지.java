import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {300, 60, 10};
        int T = Integer.parseInt(br.readLine());

        if(T%10!=0){
            System.out.println("-1");
        }
        else{
            for(int i:arr){
                System.out.println(T/i);
                T%=i;
            }
        }
    }
}