function solution(array, n) {
    var answer = 0;

    var testfilter = array.map(function(e){
        if(e==n) answer++;
        return answer;
    });
    return answer;
}