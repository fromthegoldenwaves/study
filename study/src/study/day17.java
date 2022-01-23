package study;

public class day17 {
    public int solution(int n) {
        int answer = 0;
        String result = "";
        //3진수로 변형
        while(n > 0){
            //앞뒤반전
            result = result + (n % 3);
            n = n/3;
        }
        //10진수로 변형
        System.out.println(result);
        answer = Integer.parseInt(result, 3);
        return answer;
    }
    public static void main(String[] args){
        day17 test = new day17();
        System.out.println(test.solution(45));
    }
}
