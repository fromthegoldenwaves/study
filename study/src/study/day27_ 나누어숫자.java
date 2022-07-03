import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int val : arr) {
            if (val % divisor == 0) {
                list.add(val);
            }
        }

        if (list.size() == 0) {
            int[] list1 = new int[1];
            list1[0] = -1;
            return list1;
        }

        int[] result = new int[list.size()];
        
        for (int i=0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        // 오름차순
        Arrays.sort(result);


        return result;
    }
}