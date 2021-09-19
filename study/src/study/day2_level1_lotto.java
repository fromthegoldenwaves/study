package study;

public class day1 {

	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int zeroCnt = 0;
        int winCnt = 0;
        for (int a : lottos) {
            if(a == 0) {
                zeroCnt++;
            } else {
                for (int w : win_nums) {
                    if (a == w){
                        winCnt++;
                    }
                }
            }
        }
        //ÃÖ±«, ÃÖÀú
        answer[0] = 7 - (zeroCnt + winCnt) > 6 ? 6 : 7 - (zeroCnt + winCnt); 
        answer[1] = 7 - winCnt == 7 ? 6 : 7 - winCnt;
        return answer;
    }
}
