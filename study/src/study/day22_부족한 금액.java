class Solution {
    public long solution(int price, int money, int count) {
        // 놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
        // 처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
        // 놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수

        long total = 0;
        long answer = 0;

        for(int i=1; i<=count; i++) {
            total += price * i;
        }
        // 부족금액 = 총금액 - 소지금액
        answer = total - money;
        
        if(answer < 0) {
            answer = 0;
        }

        return answer;
    }
}