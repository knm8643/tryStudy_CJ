package PGS.lv2;

public class JadenCase문자열만들기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String sibalAnswer = "";
            String Array[] = s.split(" ");

            for(int i=0; i<Array.length; i++){
                sibalAnswer = Array[i].substring(0,1).toUpperCase();

                if(Array[i].substring(0,1) == sibalAnswer){
                    System.out.println("앞글자 대문자 없음");
                }else {
                    if((i+1)<Array.length) {
                        answer += Array[i].toLowerCase() + " ";
                    } else {
                        answer += Array[i].toLowerCase();
                        answer = Array[i].repl
                        // toUpperCase()
                    }
                }
            }
            return answer;
        }
    }
}
