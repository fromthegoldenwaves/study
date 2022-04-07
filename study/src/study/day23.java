package study;

public class day23 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long cost = 0;
        for (int i = 1; i <= count; i++){
            cost = cost + (price*i);
        }
        answer = cost-money<=0? 0: cost-money;
        return answer;
    }
}
