import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ; i < commands.length ; i++) {
            int[] list = new int[commands[i][1] - commands[i][0] + 1];
            int index = 0;
            for(int j = commands[i][0] - 1 ; j < commands[i][1]; j++){
                list[index] = array[j];
                index++;
            }
            Arrays.sort(list);
            answer[i] = list[commands[i][2]-1];
        }
        return answer;
    }
}