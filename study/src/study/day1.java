package study;

public class day1 {

	public int solution(String s) {
        int answer = 0;
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < s.length()/2; i++) {
            ArrayList<String> strList = new ArrayList<>();
            String txt = s;
            double f = (double)s.length()/(double)(i+1);
            int len = (int)Math.ceil(f);
            for(int r = 0; r < len; r++) {
                String search = "";
                if (i+1 >= txt.length()) {
                    search = txt;
                } else {
                    search = txt.substring(0, i+1);
                }
                strList.add(search);
                if (r+1 < len) {
                    txt = txt.substring(i+1);
                }
            }
            String before = "";
            String after = "";
            String resultVal = "";
            System.out.println(strList);
            int cnt = 1;
            for(int a = 0; a < strList.size(); a++) {
                if(before.equals(strList.get(a))){
                    cnt++;
                } else {
                    if(!(a+1 < strList.size()) || !before.equals(strList.get(a+1))){
                        String val = cnt > 1 ? cnt + before : before;
                        resultVal = a != 0 ? resultVal + val : "";
                        cnt = 1;
                        before = strList.get(a); 
                    }
                    
                }
                if (a+1 >= strList.size()){
                    if (cnt > 1){
                        resultVal = resultVal + cnt + before;
                    } else {
                        resultVal = resultVal + before;
                    }
                }
            }
            System.out.println(resultVal);
            resultList.add(Integer.valueOf(resultVal.length()));
        }
        System.out.println(resultList);
        return answer = Collections.min(resultList);
    }
	
	public static void main(String[] args) {
		 
		
	}

}
