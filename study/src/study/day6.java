package study;

import java.util.ArrayList;
import java.util.List;

public class day6 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        //뽑은 인형
        List<Integer> pick = new ArrayList<Integer>();
        
        for (int move : moves) {
            //좌표
            int i = 0;
            int j = move - 1;
            while (i < board.length){
                if(board[i][j]!=0){
                    pick.add(board[i][j]);
                    board[i][j] = 0;
                    break;
                }
                i++;
            } 
        }
        System.out.println(pick);

        //중복인형 카운트
        int k = pick.size()-1;
        while(k>0){
            if(pick.get(k) == pick.get(k-1)) {
                pick.remove(k);
                pick.remove(k-1);
                answer = answer + 2;

                k = pick.size();
            }
            k--;
        }

        return answer;
    }

    public static void main(String[] args){
        day6 a = new day6();
        int[][] board = {{1,1,1,3,1},{0,1,1,0,1}};
        int[] moves = {1,3,1,5,5};
        System.out.println(a.solution(board, moves));
    }
}
