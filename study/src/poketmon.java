import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 1; i < nums.length; i++) {
            if (!array.contains(nums[i])) {
                array.add(nums[i]);
            }
        }

        answer = array.size();

        if (answer > nums.length / 2) {
            answer = nums.length / 2;
        }

        return answer;
    }
}