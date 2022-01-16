import java.util.*;

class Solution {
    	public int solution(int[] nums) {

        int answer = 0;
        int type = nums.length / 2;
        ArrayList<Integer> pList = new ArrayList<>();

        for(int i : nums){
            if(!pList.contains(i)){
                pList.add(i);
            }
        }
        return answer = pList.size() > type ? type : pList.size();
    }
}