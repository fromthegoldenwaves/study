import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        // 전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 
        // 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
        int[] answer = {};
        // 스테이지번호, 실패율
        Map<Integer,Double> failmap = new HashMap<>();

        List<Integer> list = new ArrayList();
        // i+1
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            int noClearCnt = 0;
            int currentCnt = 0;
            for (int j = 0; j < stages.length; j++) {
                // 미클자
                if (i == stages[j]) {
                    noClearCnt++;
                }
                // 도전중
                if (i <= stages[j]) {
                    currentCnt++;
                }
                
            }
            // 실패율
            // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
            double fail = 0;
            if (noClearCnt == 0 || currentCnt == 0) {
                fail = 0;
            } else {
                fail = (double)noClearCnt/(double)currentCnt;
            }
            failMap.put(i, fail);
        }

        for(int i=0; i<N; i++) {
            double max = -1;
            int maxKey = 0;
            for(Integer key : map.keySet()) {
                if(max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey;
            map.remove(maxKey);
        }
        return answer;
    }
}