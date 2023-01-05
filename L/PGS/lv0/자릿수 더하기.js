function solution(n) {
    var answer = 0;
    for(var i of n.toString()){
        answer += parseInt(i);
    }
    return answer;
}