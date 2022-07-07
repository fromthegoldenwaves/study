package study;

public class day30 {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length-1; i++){
            for(int j = i; j < strings.length; j++ ){
                if (strings[i].substring(n, n+1).compareTo(strings[j].substring(n, n+1))>0){
                    String tmpStr = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmpStr;
                } else if (strings[i].substring(n, n+1).compareTo(strings[j].substring(n, n+1))==0){
                    if(strings[i].compareTo(strings[j])>0) {
                        String tmpStr = strings[i];
                        strings[i] = strings[j];
                        strings[j] = tmpStr;
                    }
                }

            }
        }
        return strings;
    }
    public static void main(String[] args){
        day30 a = new day30();
        String[] test = {"abce", "abcd", "cdx"};
        System.out.println(a.solution(test,2));
    }
}
