function solution(numbers, num1, num2) {
    var answer = [];
    for(var i=num1; i<numbers.length; i++){
        if(i<=num2) answer.push(numbers[i]);
        else console.log("Fail");
    }
    return answer;
}