import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int index1=-1, index2=-1;
        
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                index1=i;
                break;
            } 
        }
        for(int j=arr.length-1; j>=0; j--){
            if(arr[j]==2){
                index2=j;
                break;
            }
        }
        if(index1==-1){
            return new int[]{-1};
        }else{
            return Arrays.copyOfRange(arr, index1, index2+1);    
        }
    }
}