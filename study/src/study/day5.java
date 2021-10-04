package study;
public class day5 {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        hand = String.valueOf(hand.charAt(0)).toUpperCase();

        //각 손가락의 위치
        int[] right = {3,2};
        int[] left = {3,0};

        //이동 거리
        int rightMove;
        int leftMove;

        int[] key;

        String result;

        for (int num : numbers) {
            //num의 좌표
            key = position(num);

            if(num == 1 || num == 4 || num == 7){
                result = "L";
            }else if(num == 3 || num == 6 || num == 9){
                result = "R";
            }else{
                rightMove = Math.abs(right[0]-key[0]) + Math.abs(right[1]-key[1]);
                leftMove = Math.abs(left[0]-key[0]) + Math.abs(left[1]-key[1]);

                if(rightMove > leftMove){
                    result = "L";
                }else if(rightMove < leftMove){
                    result = "R";
                }else{
                    result = hand;
                }
            }

            if(result.equals("L")){
                left = key;
            }else{
                right = key;
            }
            answer = answer + result;
        }
        return answer;
    }

    //좌표찾기
    public int[] position(int key){
        int[][] keyPad = {{1,2,3},{4,5,6},{7,8,9},{10,0,12}};
        int[] result = new int[2];

        search: for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                if(key == keyPad[i][j]){
                    result[0] = i;
                    result[1] = j;
                    break search;
                }
            }
        }
        return result;
    }
}
