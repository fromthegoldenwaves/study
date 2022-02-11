package study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class day15 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        //중복신고 제거
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));

        Map<String, Integer> reportCnt = new HashMap<>();

        for (String str : reportSet) {
            String[] arrStr = str.split(" ");
            //key:신고당한ID value:신고당한 횟수
            if(reportCnt.containsKey(arrStr[1])){
                reportCnt.put(arrStr[1], reportCnt.get(arrStr[1])+1);
            }else{
                reportCnt.put(arrStr[1], 1);
            }
        }

        // filtering
        reportCnt = reportCnt.entrySet()
            .stream()
            .filter(x -> x.getValue()>= k)
            .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        for (String str : reportSet) {
            String[] arrStr = str.split(" ");
            if(reportCnt.containsKey(arrStr[1])){
                for(int i=0; i<id_list.length; i++){
                    if(id_list[i].equals(arrStr[0])){
                        answer[i]=answer[i]+1;
                        break;
                    }
                }
            }
        }

        return answer;
    }
    public static void main(String[] args){
        day15 test = new day15();
        String[] a = {"muzi", "frodo", "apeach", "neo"};
        String[] b = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        System.out.println(test.solution(a, b,2));
    }
}
