package study;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class day14 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        //key: 스테이지, value: 실패율
        Map<Integer, Double> failureRate = new LinkedHashMap<>();
        for(int i=1; i<=N; i++){
            failureRate.put(i, cal(i,stages));
        }
        //vale로 올림차순
        Map<Integer, Double> sortedMap = sortMapByValue(failureRate);
        Object[] objArr = sortedMap.keySet().toArray();
        
        for(int i = 0; i < objArr.length ; i++){
            answer[i] = (int)objArr[i];
        }
        return answer;
    }

    //실폐율 계산
    //인수: 스테이지 번호, 도전자
    public Double cal(int stage, int[] stages){
        Double result;
        Double challenge = 0.0;
        Double failure = 0.0;
        for (int i : stages) {
            challenge = i>=stage? challenge+1 : challenge;
            failure = i==stage? failure+1 : failure;
        }
        result = challenge==0? 0 : failure/challenge;
        return result;
    }

    //정렬
    public static LinkedHashMap<Integer, Double> sortMapByValue(Map<Integer, Double> map) {
        List<Map.Entry<Integer, Double>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries,(o1,o2)->o2.getValue().compareTo(o1.getValue()));

        LinkedHashMap<Integer, Double> result = new LinkedHashMap<>();
        for(Map.Entry<Integer, Double> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}