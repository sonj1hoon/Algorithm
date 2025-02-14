import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        char[] c = br.readLine().toCharArray();
        for(int i=1; i<n; i++){
            String s = br.readLine();
            for(int j=0; j<c.length; j++){
                if(c[j]!=s.charAt(j)){
                    c[j]='?';
                }
            }
        }
        System.out.println(String.valueOf(c));
    }
}