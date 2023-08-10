import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        char[] list = input.toCharArray();
        String[] ca = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        List<String> alist = new ArrayList<>();
        for(int i = 0; i < list.length; i++){
            String temp = String.valueOf(list[i]);
            for(int k = 0; k < ca.length; k++){
                if(ca[k].indexOf(temp) == 0){
                    sb = new StringBuilder();
                    for (int j = 0; j < ca[k].length(); j++){
                        if(i + j < list.length){
                            sb.append(list[i + j]);
                        }
                    }
                    if(ca[k].contentEquals(sb)){
                        alist.add(String.valueOf(sb));
                        i = i + ca[k].length() - 1;
                    }else{
                        if(k < ca.length - 1){
                            continue;
                        }else{
                            alist.add(temp);
                        }
                    }
                    break;
                }else if(k == ca.length - 1){
                    alist.add(temp);
                }
            }
        }
        // System.out.print(alist);
        System.out.print(alist.size());
    }
}