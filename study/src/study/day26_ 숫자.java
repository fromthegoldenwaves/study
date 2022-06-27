import java.lang.*;

class Solution {
  public int solution(String dartResult) {
      int answer = 0;
      int index = 0;
      // 점수|보너스|옵션 문자열 3세트
      int[] temp = new int[3];
      // 숫자
      String num = "";
      String[] dartList = dartResult.split("");
      
      for(String item : dartList) {
		if(isNumeric(item)) {
			num += item;
		}else {
            if(!num.equals("")) { 
				temp[index++] = Integer.parseInt(num);
				num = "";
			}
            // 보너스 옵션
			switch(item) {
                // 1제곱
				case "S":
					temp[index-1] = (int) Math.pow(temp[index-1],1);
					break;
                // 2제곱
				case "D":
					temp[index-1] = (int) Math.pow(temp[index-1],2);
					break;
                // 3제곱
				case "T":
					temp[index-1] = (int) Math.pow(temp[index-1],3);
					break;
                // 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다
				case "*":
					if(index > 1) {
						temp[index-2] = temp[index-2]*2;	
                    }
                    temp[index-1] = temp[index-1]*2; break;
                // 해당 점수는 마이너스
				case "#":
					temp[index-1] = -temp[index-1];
					break;
			}
		}
	}

    answer += temp[0] + temp[1] + temp[2];
    return answer;
  }

  public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
         }catch(NumberFormatException e) {
            return false;
        }
    }
    
}