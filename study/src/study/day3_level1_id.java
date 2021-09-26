package study;

public class day1 {

	public int[] solution(String new_id) {
        String answer = new_id.toLowerCase();    // 1
        

        // 2 indexOF replaceOf
        answer = answer.replaceAll("[^a-z0-9-_.]","");
        // 3 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        // \d+[.] (\d{3,})
        answer = answer.replaceAll("[.]{2,}","");

        // 4 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        answer = answer.replaceAll("^[.]|[.]$","");
        // 5
        if (answer.length() == 0){
            answer += "a";
        }
        
        if (answer.length() >= 16){
            answer = answer.substring(0,15);
            answer = answer.replaceAll("^[.]|[.]$","");
        }
        
        if (answer.length() <= 2 ) {
            while(answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }
}
