package study;

public class day7_2 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length ; i++){
            int temp = signs[i]? absolutes[i]:absolutes[i]*-1;
            answer = answer + temp;
        }
        return answer;
    }
}
