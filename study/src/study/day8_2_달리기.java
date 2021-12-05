import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String>  completionArray = new ArrayList<>(Arrays.asList(completion));
        List<String>  participantArray = new ArrayList<>(Arrays.asList(participant));
        for(String a : participant) {
            if(completionArray.indexOf(a) < 0) {
                answer = a;
                break;
            } else {
                int aFrequency = Collections.frequency(completionArray, a);
                int bFrequency = Collections.frequency(participantArray, a);
                if(aFrequency != bFrequency) {
                    answer = a;
                    break;
                }
            }
        }
        return answer;
    }
}