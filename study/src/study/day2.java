package study;

public class day2 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        //일치하는 수
        int cnt = 0;
        //알아볼 수 없는 번호
        int zeroes = 0;
        
        //로또 번호 확인
        for(int i=0; i < 6; i++){
            if(lottos[i] == 0){
                zeroes++;
            } else {
                for(int j=0; j < 6; j++){
                    if(lottos[i] == win_nums[j]){
                        cnt++;
                    }
                }
            }
        }
        //순위 판정
        answer[0] = ranking(cnt + zeroes);
        answer[1] = ranking(cnt);

        return answer;
    }

    public int ranking(int cnt) {
        int result;

        switch(cnt){
            case 6:
                result = 1;
                break;
            case 5:
                result = 2;
                break;
            case 4:
                result = 3;
                break;
            case 3:
                result = 4;
                break;
            case 2:
                result = 5;
                break;
            default :
                result = 6;
        }

        return result;
    }

}
