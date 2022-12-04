package PGS.lv0;

public class 세균증식 {
    public int solution(int n, int t){
        int answer = 0;
        answer = (int)Math.pow(2,t) * n;
        return answer;
    }
}
