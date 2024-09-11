class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(safeCheck(board, i, j)){
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public boolean safeCheck(int[][] board, int x, int y){
        for(int i=-1; i<=1; i++){
            for(int j=-1; j<=1; j++){
                try{
                    if(board[x+i][y+j]==1){
                        return false;
                    }
                }catch (ArrayIndexOutOfBoundsException e){
                    continue;
                }
            }
        }return true;
    }
}
//지뢰를 발견했다면 해당열 앞뒤로 1넣고
//위 아래열 위치에도 1넣고