package PGS_SUM.lv1;

public class 가운데글자가져오기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            int sLength = s.length();

            if(sLength%2 == 1) answer += s.charAt(sLength/2);
            else {
                answer += s.charAt(sLength/2-1);
                answer += s.charAt(sLength/2);
            }
            return answer;
        }
    }
}
