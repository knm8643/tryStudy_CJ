package PGS_SUM.lv1;

public class 이상한문자만들기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String answerArray[] = s.split("");
            int number = 0;

            for(String sLength : answerArray){
                if(sLength.contains(" ")) number = 0;
                else number = number + 1;

                answer += number%2 != 0 ? sLength.toUpperCase() : sLength.toLowerCase();
            }
            return answer;
        }
    }
}
