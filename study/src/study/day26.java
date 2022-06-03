package study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day26 {
    public int solution(String dartResult) {
        int answer = 0;
        Pattern pattern = Pattern.compile("([0-9]+)([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);

        int pre = 0;
        
        while(matcher.find()){
            int now = Integer.parseInt(matcher.group(1));
            if(matcher.group(2).equals("D")) {
                now = (int)Math.pow(now, 2);
            }else if(matcher.group(2).equals("T")){
                now = (int)Math.pow(now, 3);
            };

            if(matcher.group(3).equals("*")){
                now = now * 2;
                answer = answer + pre + now;
            }else if(matcher.group(3).equals("#")){
                now = now * -1;
                answer = answer + now;
            }else{
                answer = answer + now;
            };
            pre = now;
        };

        
        return answer;
    }

    public static void main(String[] args){
        day26 a = new day26();
        System.out.println(a.solution("1D#2S*3S"));
    }
}
