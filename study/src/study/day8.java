package study;

public class day8 {
    public int solution(int[] nums) {
        int answer = 0;

        //합계산출을 위한 반복문
        for (int i=0; i < nums.length-2; i++){
            for (int j=i+1; j < nums.length-1; j++){
                for (int k=j+1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) answer++;
                }
            }
        }
        return answer;
    }

    //소수판정
    public boolean isPrime(int a) {
        for(int i=2; i<a; i++){
            if(a%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        day8 test = new day8();
        int[] test1 = {1,2,3,4};
		System.out.println(test.solution(test1));
	}
}
