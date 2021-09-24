package study;

public class day1 {

	public int solution(String s) {
        int answer = s.length();
        
        if(s.length() == 1 ){
            return 1;
        }

        for(int i = 1; i <= s.length()/2; i++){
            //압축카운팅, 기준 문자열, 비교 문자열
            int cnt = 1;
            String str1 = s.substring(0,i);
            String str2="";
            //최종 출력 문자열
            String result = "";

            for(int j = i; j <= s.length(); j+=i){
                if(j+i < s.length()){
                    str2 = s.substring(j,j+i);
                } else {
                    str2 = s.substring(j);
                }
                if(str1.equals(str2)){
                    //문자열이 반복되었으므로 압축횟수 카운팅
                    cnt++;
                } else {
                    if(cnt > 1){
                        result = result + cnt + str1;
                    } else {
                        result = result + str1;
                    }
                    //문자열의 반복이 종료되었으므로 새로운 기준 문자열을 설정한다
                    if(str1.length() == str2.length()){str1 = str2;}
                    cnt = 1;
                }
            }
            //나누어 떨어지지 않는 문자 처리
            if(str1.length() != str2.length()){result = result + str2;}

            answer = Math.min(answer, result.length());
        }
        return answer;
    }

	
	public static void main(String[] args) {
        day1 a = new day1();
		System.out.println(a.solution("xxxxxxxxxxyyy"));
	}

}
