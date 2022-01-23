package study;

import java.util.Calendar;

public class day20 {
    public String solution(int a, int b) {
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        Calendar cal = Calendar.getInstance();
        cal.set(2016,a-1,b);
        return week[cal.get(Calendar.DAY_OF_WEEK)-1];
    }
}
