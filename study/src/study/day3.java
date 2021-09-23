package study;

public class day3 {

    public String solution(String new_id) {
        String answer = "";
        //1. 소문자 치환
        new_id = new_id.toLowerCase();
        //2. 특정 문자 제거
        String pattern ="[^\\w-_.]";
        new_id = new_id.replaceAll(pattern, "");
        //3. 마침표 중복 치환
        pattern ="\\.{2,}";
        new_id = new_id.replaceAll(pattern, ".");
        //4. 마침표 제거
        pattern ="^\\.";
        new_id = new_id.replaceAll(pattern, "");
        pattern = "\\.$";
        new_id = new_id.replaceAll(pattern, "");
        //5. a대입
        new_id = new_id.equals("")? "a" : new_id;
        //6. 16자 이상문자 처리
        if(new_id.length() >= 16) new_id = new_id.substring(0, 15).replaceAll(pattern, "");
        //7. 2자 이하문자 처리
        if(new_id.length() <= 2){
            String lastStr = new_id.substring(new_id.length()-1);
            while (new_id.length() < 3){
                new_id = new_id + lastStr;
            }
        }
        answer = new_id;
        return answer;
    }

    public static void main(String[] args){
        day3 a = new day3();
        System.out.println(a.solution("./././././abcd/./././.()."));
    }
}
