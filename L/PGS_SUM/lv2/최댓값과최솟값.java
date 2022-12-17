package PGS_SUM.lv2;

public class 최댓값과최솟값 {
    class Solution {
        public String solution(String s) {
            String[] answerSibal = s.split(" ");
            // ----------------------------두번째 시도 -------------------------
            String answer = "";

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int i=0; i<answerSibal.length; i++){
                int number = Integer.parseInt(answerSibal[i]);
                min = Math.min(min, number);
                max = Math.max(max, number);
            }
            return min + " " + max;
            // ----------------------------첫번째 시도(코드실행만 통과) -------------------------
            // String answer = "";
            // for(int i=0; i<answerSibal.length; i++){
            //     if(i==0){
            //        answer += answerSibal[i];
            //     }else if(i==(answerSibal.length-1)){
            //         if(Integer.parseInt(answer) > Integer.parseInt(answerSibal[i])){
            //             return answerSibal[i] + " " + answer;
            //         }else {
            //             answer += " " + answerSibal[i];
            //         }
            //     }
            // }
            // return answer;
        }
    }
}
