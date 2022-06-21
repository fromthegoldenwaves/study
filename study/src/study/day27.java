package study;

import java.util.*;

public class day27 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            if (i == 0){
                list.add(arr[i]);
            }else{
                if (arr[i-1]!=arr[i]){
                    list.add(arr[i]);
                }
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
