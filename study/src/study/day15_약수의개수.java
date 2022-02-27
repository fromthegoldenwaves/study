class Solution {
    public int solution(int left, int right) {
        // left > rigth 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 
        int answer = 0;

        for(int i = left; i <= right; i++) {
            // 약수의 개수
            int cnt = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) cnt++;
            }
            // 약수의 개수가 짝수
            if(cnt % 2 == 0) answer += i;
            // 약수의 개수가 홀수
            else answer -= i;
        }
        return answer;
    }
}