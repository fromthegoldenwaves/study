package study;

public class day16 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            //약수갯수구하기
            int cnt = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    cnt++;
                }
            }
            //홀짝판정
            if (cnt%2==0) {
                answer = answer + i;
            } else {
                answer = answer - i;
            }
        }
        return answer;
    }
}
