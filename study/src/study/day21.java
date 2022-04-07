package study;


public class day21 {
    public int solution(int[][] sizes) {
        int maxWid = 0;
        int maxLen = 0;

        int tempWid;
        int tempLen;

        for(int i=0; i<sizes.length; i++ ){
            tempWid = sizes[i][0]>sizes[i][1]? sizes[i][0] : sizes[i][1];
            tempLen = sizes[i][1]>sizes[i][0]? sizes[i][0] : sizes[i][1];

            maxWid = maxWid < tempWid? tempWid : maxWid;
            maxLen = maxLen < tempLen? tempLen : maxLen;
        }
        return maxWid * maxLen;
    }


    public static void main(String[] args){
        day21 test = new day21();
        int[][] a = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(test.solution(a));
    }
}
