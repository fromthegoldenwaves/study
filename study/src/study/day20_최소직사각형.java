class Solution {
    public int solution(int[][] sizes) {
        int longest = 0;
        int shortest = 0;
        for(int i = 0; i < sizes.length; i++) {
            // 가로
            int longVal = Math.max(sizes[i][0], sizes[i][1]);
            // 세로
            int shortVal = Math.min(sizes[i][0], sizes[i][1]);
            // 가로중 가장 긴변
            if(longVal > longest){
                longest = longVal;
            }
            //세로중 가장 긴변
            if(shortVal > shortest){
                shortest = shortVal;
            }
        }
        return longest * shortest;
    }
}