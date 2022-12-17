package PGS_SUM.lv1;

import java.util.Arrays;

class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        System.out.println(Arrays.toString(seoul));
        String answer = "";

        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i +"에 있다";
            }
        }
        return answer;
    }
}

