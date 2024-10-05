class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        for(int x=0; x<len-2; x++){
            for(int y=x+1; y<len-1; y++){
                for(int z=y+1; z<len; z++){
                    if(isPrime(nums[x] + nums[y] + nums[z])) answer++;
                }
            }
        }return answer;
    }
    
    private boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }return true;
    }
}