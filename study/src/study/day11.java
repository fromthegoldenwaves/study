package study;

import java.util.ArrayList;
import java.util.List;

public class day11 {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] first={1,2,3,4,5};
        int[] second={2,1,2,3,2,4,2,5};
        int[] third={3,3,1,1,2,2,4,4,5,5};

        int firstScore = scoreCheck(answers, first);
        int secondScore = scoreCheck(answers, second);
        int thirdScore = scoreCheck(answers, third);

        List<Integer> rank = new ArrayList<>();
        if(firstScore > secondScore){
            rank.add(1);
            if(firstScore == thirdScore){
                rank.add(3);
            }else if(firstScore < thirdScore){
                rank.remove(0);
                rank.add(3);
            }
        }else if(firstScore == secondScore){
            rank.add(1);
            rank.add(2);
            if(firstScore == thirdScore){
                rank.add(3);
            }else if(firstScore < thirdScore){
                rank.remove(0);
                rank.remove(1);
                rank.add(3);
            }
        }else{
            rank.add(2);
            if(secondScore == thirdScore){
                rank.add(3);
            }else if(secondScore < thirdScore){
                rank.remove(0);
                rank.add(3);
            }
        }
        answer = new int[rank.size()];
        answer = rank.stream().mapToInt(i->i).toArray();

        return answer;
    }
    public int scoreCheck(int[] a, int[] b){
        int score=0;
        int j=0;
        for(int i=0; i<a.length; i++){
            if(a[i] == b[j]){
                score++;
            }

            if(j==b.length-1){
                j=0;
            }else{
                j++;
            }
        }
        return score;
    }
}
