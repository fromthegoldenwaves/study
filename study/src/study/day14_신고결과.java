import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 전체이용자ID id_list
        // 신고당한 이용자ID report
        // 정지 기준 k
        // 각 유저별로 처리 결과 메일을 받은 횟수 answer
        // return 하는 배열은 id_list에 담긴 id 순서대로 각 유저가 받은 결과 메일 수를 담으면 됩니다.
        int[] answer = new int[id_list.length];
        // 유저리스트  key:신고당한유저, value:신고자 리스트
        Map<String, HashSet<String>> userMap = new HashMap<>();
        // 유저 아이디 , 결과 횟수
        Map<String, Integer> resultMap = new HashMap<>();
		
        for(int i=0 ; i<id_list.length ; i++) {
            // userId, userIndex
			userMap.put(id_list[i], new HashSet<>());
            // userId, reportCnt
            resultMap.put(id_list[i], 0);
		}
        // report 
        for(String item : report) {
        	String[] id = item.split(" ");
            // 리포트한 유저
        	String reportId=id[0];
            // 신고당한 유저
            String singoId=id[1];
            // 신고당한놈, 신고한 유저
            userMap.get(singoId).add(reportId);
        }
        for(String user : userMap.keySet()) {
        	HashSet<String> reportUser = userMap.get(user);
            // 신고한 유저수가 정지기준 이상일 경우
            if (reportUser.size() >= k) {
                for (String u : reportUser) {
                    // 메일 카운트 업
                    Integer mailCnt = resultMap.get(u);
                    resultMap.put(u, ++mailCnt);
                }
            }
        }
        for (int i=0;i<answer.length; i++){
            // 메일 카운트 취득
            answer[i] = resultMap.get(id_list[i]);
        }
        return answer;
    }
}