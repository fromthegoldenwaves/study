package study;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class day12 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        //배열이 학생 번호 순서가 아니라는 전재하에 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //리스트화
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        //동일 벨류 삭제
        for (int i=0 ; i<lostList.size() ; i++) {
            if (reserveList.contains(lostList.get(i))){
                reserveList.remove(reserveList.indexOf(lostList.get(i)));
                lostList.remove(i);
                answer++;
                i--;
            }
        }
        //대여가능 판정
        for (int i=0 ; i<lostList.size() ; i++) {
            if (reserveList.contains(lostList.get(i)-1)){
                reserveList.remove(reserveList.indexOf(lostList.get(i)-1));
                lostList.remove(i);
                answer++;
                i--;
            } else if (reserveList.contains(lostList.get(i)+1)) {
                reserveList.remove(reserveList.indexOf(lostList.get(i)+1));
                lostList.remove(i);
                answer++;
                i--;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        day12 test = new day12();
        int[] a = {2,4};
        int[] b = {1,3,5};
        System.out.println(test.solution(5, a, b));
    }
}
