package PGS.lv0;

public class 짝수홀수개수 {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[2];
            for(int i =0; i<num_list.length; i++){
                if(num_list[i]%2 == 0){
                    System.out.println(num_list[i]);
                    answer[0] += 1;
                }else {
                    System.out.println(num_list[i]);
                    answer[1] += 1;
                }
            }
            return answer;
        }
    }
}
