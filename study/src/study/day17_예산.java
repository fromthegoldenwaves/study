import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
		// 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget
        int answer = 0;
        Arrays.sort(d);
        for(int n : d) {
            if(budget - n >= 0) {
                answer++;
                budget -= n;
            }
        }
        return answer;
    }
}