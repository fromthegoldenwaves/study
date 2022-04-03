import java.util.*;
import java.text.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        Calendar cal = Calendar.getInstance();
    	cal.set(2016, a-1, b);
    	Date date = cal.getTime();
		// 대문자변환
        answer = new SimpleDateFormat("E").format(date).toUpperCase();
    	return answer;
    }
}