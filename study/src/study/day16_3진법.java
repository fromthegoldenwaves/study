class Solution {
    public int solution(int n) {
        int answer = 0;
		String val = "";
		while(n > 0) {
			val = n % 3 + val;
			n /= 3;
		}
		StringBuffer sb = new StringBuffer(val);
        // 리버스변환
		val = sb.reverse().toString();
		answer = Integer.valueOf(val, 3);
		return answer;
    }
}