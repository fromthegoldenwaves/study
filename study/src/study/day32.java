package study;

import java.util.Arrays;

public class day32 {
    public String solution(String s) {
        String answer = "";
        char charArr[] = s.toCharArray();
        Arrays.sort(charArr);
        for (int i = charArr.length - 1; i >= 0; i--) {
            answer = answer + charArr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        day32 a = new day32();
        System.out.println(a.solution("adBEda"));
    }
}
