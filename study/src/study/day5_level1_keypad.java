import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String rNow = "#";
        String lNow = "*";
        String[] left = {"1","4","7"};
        String[] right = {"3","6","9"};
        String[] middle = {"2","5","8","0"};
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("1",1);
        map2.put("2",0);
        map2.put("3",1);
        map2.put("4",2);
        map2.put("5",1);
        map2.put("6",2);
        map2.put("7",3);
        map2.put("8",2);
        map2.put("9",3);
        map2.put("0",3);
        map2.put("*",4);
        map2.put("#",4);
        Map<String,Integer> map5 = new HashMap<>();
        map5.put("1",2);
        map5.put("2",1);
        map5.put("3",2);
        map5.put("4",1);
        map5.put("6",1);
        map5.put("7",2);
        map5.put("8",1);
        map5.put("9",2);
        map5.put("0",2);
        map5.put("*",3);
        map5.put("#",3);
        Map<String,Integer> map8 = new HashMap<>();
        map8.put("1",3);
        map8.put("2",2);
        map8.put("3",3);
        map8.put("4",2);
        map8.put("5",1);
        map8.put("6",2);
        map8.put("7",1);
        map8.put("8",0);
        map8.put("9",1);
        map8.put("0",1);
        map8.put("*",2);
        map8.put("#",2);
        Map<String,Integer> map0 = new HashMap<>();
        map0.put("1",4);
        map0.put("2",3);
        map0.put("3",4);
        map0.put("4",3);
        map0.put("5",2);
        map0.put("6",3);
        map0.put("7",2);
        map0.put("8",1);
        map0.put("9",2);
        map0.put("0",0);
        map0.put("*",1);
        map0.put("#",1);
        for (int i : numbers) {
            String val = Integer.toString(i);
            boolean ifMiddle = false;
            for (String m : middle) {
                if (val.equals(m)){
                    ifMiddle = true;
                }
            }    
            if (ifMiddle){
            int rDis = 0;
            int lDis = 0;
            if (val.equals("2")){
                rDis = map2.get(rNow);
                lDis = map2.get(lNow);
            } else if (val.equals("5")){
                rDis = map5.get(rNow);
                lDis = map5.get(lNow);
            } else if (val.equals("0")){
                rDis = map0.get(rNow);
                lDis = map0.get(lNow);
            } else if (val.equals("8")){
                rDis = map8.get(rNow);
                lDis = map8.get(lNow);
            }
            
            if (rDis>lDis) {
                lNow = val;
                answer = answer + "L";
            } else if (rDis<lDis) {
                rNow = val;
                answer = answer + "R";
            } else if (rDis==lDis){
                if (hand.equals("right")){
                    rNow = val;
                    answer = answer + "R";
                } else {
                    lNow = val;
                    answer = answer + "L";
                }
            }
                       
            } else {
                for (String l : left) {
                if (val.equals(l)){
                    lNow = val;
                    answer = answer + "L";
                    break;
                }
            }
            for (String r : right) {
                if (val.equals(r)){
                    rNow = val;
                    answer = answer + "R";
                    break;
                }
            }
                
            }
            
        }
        
        return answer;
    }
}