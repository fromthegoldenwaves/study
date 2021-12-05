package study;

import java.util.*;

public class day9_2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        int index = participant.length -1;

        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i=0; i<completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                index = i;
                break;
            }
        }

        answer = participant[index];

        return answer;
    }

    public static void main(String[] args){
        day9_2 test = new day9_2();
        String[] a = {"mislav", "stanko", "mislav", "ana"};
        String[] b = {"stanko", "ana", "mislav"};
        System.out.println(test.solution(a, b));
    }
}
