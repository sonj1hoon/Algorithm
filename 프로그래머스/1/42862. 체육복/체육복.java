class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n+2];
        int answer = n;
        
        for(int l:lost){
            people[l]-=1;
        }
        for(int r:reserve){
            people[r]+=1;
        }
        
        for(int i=1; i<=n; i++){
            if(people[i]==-1){
                if(people[i-1]==1){
                    people[i]++;
                    people[i-1]--;
                }
                else if(people[i+1]==1){
                    people[i]++;
                    people[i+1]--;
                }
                else{
                    answer--;
                }
            }
        }
        return answer;
    }
}
