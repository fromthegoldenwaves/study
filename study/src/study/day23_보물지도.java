class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {    
        
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String first = convertBinary(n, arr1[i]);
            String second = convertBinary(n, arr2[i]);
            String val = "";
            for (int j = 0; j < n; j++) {
                String k = (first.charAt(j) == '1' || second.charAt(j) == '1') ? "#" : " ";
                val += k;
            }
            answer[i] = val;
        }
        return answer;
    }

    private String convertBinary(int n, int val){
        String binary = Integer.toBinaryString(val);
        // return StringUtils.leftPad(binary, n, "0");
        return padZero(val, n);
    }

    public static String padZero(int num, int len) {
        String fm = "%0" + String.valueOf(len) + "d";
        return String.format(fm, num);
    }
}