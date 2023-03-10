function solution(array) {
    var answer = Math.max.apply(null, array)
    var index = array.indexOf(answer)
    return [answer, index];
}