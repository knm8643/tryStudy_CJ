function solution(x, n) {
    var answer = [];
    for(var i=0; i<n+1; i++){
        answer[i] = x*i;
    };
    answer.shift();
    return answer;
}