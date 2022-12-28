package PGS.lv1;

public class 문자열내p와y의개수 {
    class Solution {
        boolean solution(String s) {
            char chP = 'P';
            char chY = 'Y';
            int p = 0;
            int y = 0;

            String siba = s.toUpperCase();
            if(siba.contains("P") || siba.contains("Y")){
                for (int i = 0; i < siba.length(); i++) {
                    if (siba.charAt(i) == chP) {
                        p++;
                    }
                    if (siba.charAt(i) == chY) {
                        y++;
                    }
                }
            }
            return (p==y)?true:false;
        }
    }
}
