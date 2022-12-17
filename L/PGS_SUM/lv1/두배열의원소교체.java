package PGS_SUM.lv1;

import java.util.Arrays;
import java.util.Collections;

public class 두배열의원소교체 {
    // 프로그래머스 아닌 사제 알고리즘 문제 (이코테)
    public static void main(String[] args){
        int answer = 0;
        int[] a = {1,2,5,4,3};
        Integer[] b = {5,5,6,6,5};
        int k = 3;

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for(int i=0; i<a.length; i++){
            if(i < k) a[i] = b[i];
            answer += a[i];
        }
        // 정답은 26이 출력되어야 함
    }
}
