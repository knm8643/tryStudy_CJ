package PGS_SUM.lv1;

public class 문자열다루기기본 {
    class Solution {
        public boolean solution(String s) {
            boolean answer = (s.matches("(.*)[a-z|A-Z](.*)"))?false:true;
            int slength = s.length();

            if(slength == 4 || slength == 6){
                System.out.println("OK");
            } else{
                return false;
            }
            return answer;
        }
    }
}
