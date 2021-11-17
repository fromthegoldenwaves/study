package study;

public class day7_1 {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int i : numbers) {
            answer = answer - i;
        }
        return answer;
    }
}
