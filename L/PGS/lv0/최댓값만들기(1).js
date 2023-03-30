function solution(numbers) {
    var answer = numbers.sort(function(a, b) {
        return a - b;
    });
    return answer[answer.length-1] * answer[answer.length-2];
}