package PGS.lv0;

public class 머쓱이보다키큰사람 {
    class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;

            for(int i=0; i<array.length; i++) {
                if(array[i] > height){
                    if(height >= 1 && height <= 200){
                        answer ++;
                    }
                }
            }
            return answer;
        }
    }
}
