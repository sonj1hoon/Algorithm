import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[array.length/2];
    }
}