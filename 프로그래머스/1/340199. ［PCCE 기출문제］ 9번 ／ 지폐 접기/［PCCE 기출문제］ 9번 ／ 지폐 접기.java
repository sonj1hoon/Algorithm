class Solution {
    public int solution(int[] wallet, int[] bill) {
        int count = 0;
        
        while (min(bill)>min(wallet) || max(bill)>max(wallet)) {
            if(bill[0]>bill[1]) bill[0] /= 2;
            else bill[1] /= 2;
            count++;
        }
        return count;
    }
    
    private int max(int[] arr){
        return Math.max(arr[0], arr[1]);
    }
    private int min(int[] arr){
        return Math.min(arr[0], arr[1]);
    }
}