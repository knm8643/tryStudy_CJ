package PGS.lv1;

public class 부족한금액계산하기 {
    class Solution {
        public long solution(int price, int money, int count) {
// ------- 두번째 도전 -------------
            long answer = 0;
            for(int i=1; i<=count; i++){
                answer += price*i;
            }
            return (answer>money)?answer-money:0;

// ------- 첫번째 도전 -------------
//         long answer = 0;
//         int sibal = 0;

//         for(int i=1; i<money; i++){
//             if(i%price == 0) {
//                 sibal++;
//                 if(sibal <= count) answer += i;
//             }
//         }
//         if(answer > money) return answer-money;
//         else return 0;
        }
    }
}
