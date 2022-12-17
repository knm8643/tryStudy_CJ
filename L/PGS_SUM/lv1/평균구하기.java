package PGS_SUM.lv1;

class Solution {
    //평균구하기
    public double solution(int[] arr) {
        double answer = 0;
        for(double sum : arr){
            answer += sum;
        }
        return answer/arr.length;
    }
}