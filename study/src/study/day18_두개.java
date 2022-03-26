import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
		// 정수 배열 numbers
		int result = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				result = numbers[i] + numbers[j];
                // 중복제거
				if (!list.contains(result)) {
					list.add(result);
				}
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		// 오름차순
		Arrays.sort(answer);
		return answer;
    }
}