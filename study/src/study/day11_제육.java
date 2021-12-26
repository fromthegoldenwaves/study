class Solution {
    // reserve 여벌
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        int cnt = 0;
        // 여벌 제거
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]==reserve[j]) {
                    answer++;
                    lost[i] = 0;
                    reserve[j] = 0;
                    break;
                }
            }
        }
        // 빌려주기
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
                    answer++;
                    reserve[j] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}