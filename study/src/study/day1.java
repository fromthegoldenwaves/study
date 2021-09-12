package study;

public class day1 {

	public int solution(String s) {
        int answer = s.length();
        
        for(int i = 1; i<=s.length()/2; i++){
            //압축카운팅, 기준 문자열, 비교 문자열
            int cnt = 1;
            String str1 = s.substring(0,i);
            String str2;
            //최종 출력 문자열
            String result = "";

            for(int j = i; j < s.length(); j+=i){
                str2 = s.substring(j,j+i);
                if(str1.equals(str2)){
                    //문자열이 반복되었으므로 압축횟수 카운팅
                    cnt++;
                } else {
                    if(cnt > 1){
                        result = result + cnt + str2;
                    } else {
                        result = result + str2;
                    }
                    //반복이 종료되었으므로 새로운 기준 문자열을 설정한다
                    str1 = s.substring(j,j+i);
                    cnt = 1;
                }
            }
            answer = Math.min(answer, result.length());
        }
        return answer;
    }

	
	public static void main(String[] args) {
		 
		
	}

}
