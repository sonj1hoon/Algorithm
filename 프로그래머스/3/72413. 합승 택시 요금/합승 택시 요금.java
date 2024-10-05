import java.util.*;
class Solution {
    public int solution(int pointCnt, int s, int a, int b, int[][] fares) {
        int[][] routeArr = initRouteArr(fares, fares.length, pointCnt);
        int index, cost, minCost = 2000000;
        boolean[] isCheck;
        
        for(int i=0; i<pointCnt; i++){
            isCheck = new boolean[pointCnt];
            isCheck[i] = true;
            
            for(int j=0; j<pointCnt; j++){
                index = nextIdx(routeArr,i,pointCnt,isCheck); 
                cost = routeArr[i][index]; //현 위치에서 가장 싼 비용
                
                for(int k=0; k<pointCnt; k++){
                    // i->현위치에서 가장 싼 포인트->k vs i->k
                    if(cost+routeArr[index][k]<routeArr[i][k]){
                        routeArr[i][k]=cost+routeArr[index][k];
                    }
                }
            }
        }
        
        for(int i=0; i<pointCnt; i++){
            cost = routeArr[s-1][i]+routeArr[i][a-1]+routeArr[i][b-1];
            if(cost<minCost){
                minCost = cost;
            }
        }return minCost;
    }
    
    private int[][] initRouteArr(int[][] fares, int faresLen, int pointCnt){
        int[][] routeArr = new int[pointCnt][pointCnt];
        for(int i=0; i<faresLen; i++){
            routeArr[fares[i][0]-1][fares[i][1]-1]=routeArr[fares[i][1]-1][fares[i][0]-1]=fares[i][2];
        }
        
        for(int j=0; j<pointCnt; j++){
            for(int k=0; k<pointCnt; k++){
                if(j!=k && routeArr[j][k]==0){
                    routeArr[j][k]=2000000;
                }
            }
        }
        return routeArr;
    }
    //다음에 탐색할 index 물색
    private int nextIdx(int[][] routeArr, int point, int pointCnt, boolean[] isCheck){
        int minVal = 2000000;
        int minIdx = 0;
        
        for(int i=0; i<pointCnt; i++){
            if(!isCheck[i] && minVal>routeArr[point][i]){
                minVal=routeArr[point][i];
                minIdx=i;
            }
        }
        isCheck[minIdx] = true;
        return minIdx;
    }
}