import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        //인형바구니
        List<Integer> dollList = new ArrayList<>();
        for(int move: moves){
            // 좌표
            int j = move-1;
            for(int i = 0; i<board.length; i++){
                //뽑기
                if (board[i][j]>0){
                    // 담기
                    dollList.add(board[i][j]);
                    // 제거
                    board[i][j] = 0;
                    break;
                }

            }
            // 중복제거
            if (dollList.size()>1){
                if(dollList.get(dollList.size()-2) == dollList.get(dollList.size()-1)){
                    dollList.remove(dollList.size()-2);
                    dollList.remove(dollList.size()-1);
                    answer++;
                }
            }        
        }
        return answer*2;
    }
}