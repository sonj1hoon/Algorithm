import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		double sumScore=0;
		double sumGrade=0;
		double sum=0;
		
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
	        String ObjectName = st.nextToken();
	        double score= Double.parseDouble(st.nextToken());
	        String grade= st.nextToken();
	        if(!grade.equals("P")){
	        	sumScore+=calculate(score, grade);
	        	sumGrade+=score;
	        }
		}
		
		System.out.printf("%f",sumScore/=sumGrade);
	}
	public static double calculate(double score, String grade) {
		double sum=0;
    	switch(grade) {
    	case "A+":
    		sum+=score*4.5;
    		break;
    	case "A0":
    		sum+=score*4.0;
    		break;
    	case "B+":
    		sum+=score*3.5;
    		break;
    	case "B0":
    		sum+=score*3.0;
    		break;
    	case "C+":
    		sum+=score*2.5;
    		break;
    	case "C0":
    		sum+=score*2.0;
    		break;
    	case "D+":
    		sum+=score*1.5;
    		break;
    	case "D0":
    		sum+=score*1.0;
    		break;
    	case "F":
    		sum+=score*0.0;
    		break;
    	}return sum;
	}
}