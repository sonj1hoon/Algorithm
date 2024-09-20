import java.util.*;
class Solution {
    public String solution(String polynomial) {
        int sum = 0;
        int xSum = 0;
        String result;
        
        for(String s : polynomial.split(" ")){
            if(s.contains("x")){
                s=s.replace("x","");
                if(s.length()==0){
                    xSum++;
                }else xSum+=Integer.parseInt(s);
            }else if(!s.equals("+")) sum+=Integer.parseInt(s);
        }
        
        if (xSum == 0 && sum == 0) {
            return "0";
        }
        
        if (xSum == 1) {
            result = "x";
        } else { 
            result = xSum + "x";
        }
        
        if (sum == 0) {
            return result;
        } else if (xSum == 0) {
            return "" + sum;
        } else {
            result += " + " + sum;
        }
        return result;
    }
}