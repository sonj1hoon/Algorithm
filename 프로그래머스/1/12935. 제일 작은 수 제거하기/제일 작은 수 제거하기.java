import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            return new int[]{-1};
        }   
        
        int minIdx=0;
        for(int i=0; i<arr.length; i++)
            if(arr[minIdx] > arr[i]) minIdx=i;
                
        int[] answer = new int[arr.length - 1];
        int index=0;
        for(int i=0; i<arr.length; i++){
            if (i != minIdx) {
                answer[index++] = arr[i]; 
            }
        }return answer;
    }
}