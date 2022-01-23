package study;

import java.util.Arrays;

public class day18 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i : d) {
            budget = budget - i;
            if(budget<0){
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }
}
