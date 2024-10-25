import java.util.*;

public class Solution {
    public int solution(int n) {
        int battery = 0;
        
        while (n > 0) {
            if (n % 2 == 0) {
                // 순간이동 가능
                n /= 2;
            } else {
                // 점프 필요
                n -= 1;
                battery++;
            }
        }
        
        return battery;
    }
}
/*
1. k칸 '점프'. k만큼 건전지 소모
2. 이동한 거리 * 2 '위치로 순간이동'. 건전지 소모 없음
순간이동에 쓰이는 이동한 거리는 '점프'를 사용한다. 
N만큼 떨어진 장소로 이동예정.

N=6
1. 1칸 점프 순간이동*2 2칸 점프 -3
2. 2칸 점프 순간이동*1 2칸 점프 -4
3. 3칸 점프 순간이동*1         -0
4. 4칸 점프 순간이동*X 2칸 점프 -6
5. 4와 같은 이유로 순간이동 불가 -6
6. 6칸 점프 -6

N/2 몫이 마지노선. 이 이상 올라가면 안됨.
*/