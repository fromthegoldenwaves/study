package study;

public class day29 {
    public long solution(int a, int b) {
        int start = a>b? b:a;
        int end = a>b? a:b;
        long answer = 0;
        for (int i=start; i<=end; i++){
            answer = answer+i;
        }
        return answer;
    }
}
