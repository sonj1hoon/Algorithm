class Solution {
    public int answer;
    public boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return answer;
    }
    public void dfs(int depth, int k, int[][] dungeons){
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && k>=dungeons[i][0]){
                visited[i]=true;
                dfs(depth+1, k-dungeons[i][1], dungeons);
                visited[i]=false;
            }
        }
        answer = Math.max(answer, depth);
    }
}
/*
깊이 우선 탐색 DFS(Depth-First Search)
루트 노드에서 시작해서 다음 분기로 넘어가기 전에 해당 분기를 완벽하게 탐색하는 방법
*/