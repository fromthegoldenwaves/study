package study;

import java.util.ArrayList;
import java.util.List;

public class day9_1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //array to list
        List<String> participantList = new ArrayList<>();
        for (String str : participant) {
            participantList.add(str);
        }
        
        for (String str : completion) {
            int index = participantList.indexOf(str);
            participantList.remove(index); //비효율
        }

        answer = participantList.get(0);

        return answer;
    }

    public static void main(String[] args){
        day9_1 test = new day9_1();
        String[] a = {"mislav", "stanko", "mislav", "ana"};
        String[] b = {"stanko", "ana", "mislav"};
        System.out.println(test.solution(a, b));
    }
}
