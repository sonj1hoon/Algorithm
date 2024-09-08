class Solution {
    public long solution(String numbers) {
        String str="";
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<numbers.length(); i++){
            str+=numbers.charAt(i);
            switch(str){
                case "zero":
                    sb.append("0");
                    str="";
                    break;
                case "one":
                    sb.append("1");
                    str="";
                    break;
                case "two":
                    sb.append("2");
                    str="";
                    break;
                case "three":
                    sb.append("3");
                    str="";
                    break;
                case "four":
                    sb.append("4");
                    str="";
                    break;
                case "five":
                    sb.append("5");
                    str="";
                    break;
                case "six":
                    sb.append("6");
                    str="";
                    break;
                case "seven":
                    sb.append("7");
                    str="";
                    break;
                case "eight":
                    sb.append("8");
                    str="";
                    break;
                case "nine":
                    sb.append("9");
                    str="";
                    break;
            }
        }
        return Long.parseLong(sb.toString());
    }
}