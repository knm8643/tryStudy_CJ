package PGS.lv0;

public class 짝수의합 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int i=1; i<=n; i++){
                if(i%2 != 1){
                    answer += i;
                }
            }
            return answer;
        }
    }
// 음주코딩
}
