package study;

import java.util.*;

public class day28 {
    public int[] solution(int[] arr, int divisor) {
        //나누어 떨어지는 값
        ArrayList<Integer> tmpList = new ArrayList<>();
        for (int i : arr){
            if (i % divisor == 0){
                tmpList.add(i);
            }
        }
        if (tmpList.size() == 0){
            tmpList.add(-1);
        } else {
            //오름차순 정렬
            Collections.sort(tmpList);
        }
        int[] answer = new int[tmpList.size()];
        for (int i=0; i<answer.length; i++){
            answer[i] = tmpList.get(i);
        }
        return answer;
    }
}
