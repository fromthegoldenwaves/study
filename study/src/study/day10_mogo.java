import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        int[] a = {0,0,0};
        for (int i=0; i<answers.length; i++) {
            if(answers[i] == s1[i%5]){
               a[0]++;
            }
            if(answers[i] == s2[i%8]){
               a[1]++;
            }
            if(answers[i] == s3[i%10]){
               a[2]++;
            }
        }
        int max = a[0];
        // 최대값 구하기
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        // 2명 이상
        for (int i=0; i <a.length ; i++) {
            if (a[i] == max) {
                list.add(i+1);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();;

        return answer;
    }
}

//memo
//boolean result = Arrays.equals(A,B);
//A.containsAll(B); ArrayList 