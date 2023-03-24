function solution(my_string, num1, num2) {
    var tmp1 = my_string.split('')
    var tmp2 = tmp1[num1]
    tmp1[num1] = tmp1[num2]
    tmp1[num2] = tmp2
    var answer = tmp1.join('')
    console.log(answer)
    return answer;
}