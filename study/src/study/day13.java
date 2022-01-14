package study;

import java.util.Arrays;

public class day13 {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        int prev = 0;
        for(int i = 0; i<nums.length; i++ ){
            if(prev != nums[i]){
                prev = nums[i];
                answer++;
            }

            if(answer==nums.length/2){
                break;
            }
        }
        return answer;
    }
}
