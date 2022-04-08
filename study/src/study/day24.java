package study;

public class day24 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] map1 = toBinary(n, arr1);
        String[] map2 = toBinary(n, arr2);

        for(int i=0; i<n; i++){
            String[] arrTmp1 = map1[i].split("");
            String[] arrTmp2 = map2[i].split("");

            String strTmp = "";
            for(int j=0; j<n; j++){
                if (arrTmp1[j].equals("0") && arrTmp2[j].equals("0")) {
                    strTmp = strTmp + " ";
                } else {
                    strTmp = strTmp + "#";
                }
            }
            answer[i] = strTmp;
        }

        return answer;
    }

    public String[] toBinary (int n, int[] map){
        String[] result = new String[n];
        for(int i=0; i<n; i++){
            result[i] = String.format("%"+n+"s", Integer.toBinaryString(map[i])).replace(" ", "0");
        }

        return result;
    }

    public static void main(String[] args){
        day24 a = new day24();
        int[] arr1 = {9, 20, 28, 18, 11};
        System.out.println(a.toBinary(5, arr1));
    }
}