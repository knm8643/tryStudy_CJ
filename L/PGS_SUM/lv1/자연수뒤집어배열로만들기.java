package PGS_SUM.lv1;

public class 자연수뒤집어배열로만들기 {
//    import java.util.*;
//
//    class Solution {
//        public int[] solution(long n) {
//            long tmp1기 = n;
//            int tmp2 = 0;
//
//            // --------------------------1번째 시도---------------------------
//            // StringBuilder tmp2 = new StringBuilder(""+tmp1);
//            // String sibal = tmp2.reverse().toString();
//            // String sibalLength = sibal.length();
//            // int intSibal = Integer.parseInt(sibal);
//
//            // --------------------------1-1번째 시도---------------------------
//            // String number = String.valueOf(intSibal);
//            // char[] putNum = number.toCharArray();
//
//            // --------------------------1-2번째 시도---------------------------
//
//            // int[] answer = new int[sibalLength];
//            // for(int i = 0; i < sibalLength; i++) {
//            // answer[i] = Integer.parseInt(String.valueOf(putNum[i]));
//            // }
//
//            // --------------------------2번째 시도---------------------------
//            // ArrayList<Integer> arrNum = new ArrayList<>();
//            while(tmp1 != 0) {
//                tmp1 /= 10;
//                tmp2++;
//            }
//
//            int[] answer = new int[tmp2];
//            tmp1 = n;
//
//            for(int i=0; tmp1 != 0; i++){
//                answer[i] = (int)(tmp1 % 10);
//                tmp1 /= 10;
//                System.out.println(answer[i]);
//            }
//            System.out.println(tmp1);
//            return answer;
//        }
//    }
}
