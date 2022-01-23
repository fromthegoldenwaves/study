package study;

import java.util.Arrays;
import java.util.HashSet;

public class day19 {
    public int[] solution(int[] numbers) {
        //합
        HashSet<Integer> sumResult = new HashSet<>();
        for(int i=0; i <numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                sumResult.add(Integer.valueOf(numbers[i]+numbers[j]));
            }
        }
        //정렬
        int[] answer = sumResult.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
