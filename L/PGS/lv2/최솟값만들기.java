package PGS.lv2;

public class 최솟값만들기 {
    //    import java.util.Arrays;
//    class Solution
//    {
//        public int solution(int []A, int []B)
//        {
//            // -- 세번째 시도 --
//            int answer = 0;
//            Arrays.sort(A);
//            Arrays.sort(B);
//
//            for(int i=0; i<A.length; i++){
//                System.out.println(B[B.length-i-1]);
//                answer += A[i] * B[B.length-i-1];
//            }
//            return answer;
//
//
//            // -- 두번째 시도 --
//            // int answer = 0;
//            // for(int i=0; i<A.length; i++){
//            //     answer += A[i] * (((A.length-1)==i)?B[i-1]:B[i+1]);
//            //     System.out.println(answer + "|" + i);
//            // }
//            // return answer;
//
//            // -- 첫번째 시도 --
//            // int answer = 0;
//            // for(int i=0; i<A.length; i++){
//            //     if(A.length == 2) {
//            //         if(answer ==0) answer += A[i] * B[i+1];
//            //         else answer += A[i] * B[i-1];
//            //     } else{
//            //         answer += A[i] * B[i];
//            //     }
//            // }
//            // return answer;
//        }
//    }
}
