import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int i:sortedArr){
            if(!map.containsKey(i)){
                map.put(i, index++);
            }
        }
        for(int i:arr){
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}