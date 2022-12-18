package PGS.lv2;

public class JadenCase문자열만들기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String Array[] = s.split(" ");

            for(int i=0; i<Array.length; i++){
                if(Array[i].length() == 0) answer += " ";
                else {
                    answer += Array[i].substring(0, 1).toUpperCase();
                    answer += Array[i].substring(1, Array[i].length()).toLowerCase();
                    answer += " ";

                    // Array[i] = Array[i].toLowerCase();
                    // Array[i] = Array[i].replaceAll(Array[i].substring(0,1),Array[i].substring(0,1).toUpperCase());
                    // answer += Array[i] + " ";
                }
            }
            // answer = answer.substring(0, answer.length() - 1);
            // 테스트 8케이스 이해 못하겠네
            if(s.substring(s.length() -1, s.length()).equals(" ")) return answer;
            return answer.substring(0, answer.length() - 1);

//         ----------------------------------- 첫 번째 시도 ------------------------------
//         String sibalAnswer = "";
//         for(int i=0; i<Array.length; i++){
//             sibalAnswer = Array[i].substring(0,1).toUpperCase();

//             if(Array[i].substring(0,1) == sibalAnswer){
//                 System.out.println("앞글자에 대문자 없음");
//             }else {
//                 Array[i] = Array[i].toLowerCase();
//                 Array[i] = Array[i].replaceAll(Array[i].substring(0,1),sibalAnswer);
//                 if((i+1)<Array.length) {
//                     answer += Array[i] + " ";
//                 } else {
//                     answer += Array[i];
//                 }
//             }
//         }
//         return answer;
        }
    }
}
