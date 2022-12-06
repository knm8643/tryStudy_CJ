package PGS.lv1;

public class 없는숫자더하기 {
    import java.util.Arrays;

    class Solution {
        public int solution(int[] numbers) {
            int answer = 45;
            Arrays.sort(numbers);

            for(int dumNumber : numbers){
                answer -= dumNumber;
            }
            return answer;
        }
    }
}
