import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalCredit = 0;
        double totalScore = 0;
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String[] s1 = br.readLine().split(" ");
            double credit = Integer.parseInt(s1[1]); //총학점 계산

            String[] s2 = s1[2].split(""); //등급에 따른 점수
            double score = "FDCBA".indexOf(s2[0]);
            if(s2.length > 1) {
                if(s2[1].equals("+")) score += 0.3; //+면 +0.3
                else if(s2[1].equals("-")) score -= 0.3; //-면 -0.3
            }
            totalScore += credit*score;
            totalCredit += credit;
        }
        System.out.printf("%.2f", totalScore/totalCredit);
    }
}