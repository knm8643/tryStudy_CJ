function solution(my_string) {
    var answer = my_string.toLowerCase().split('')
    var tmp = '';
    answer.sort()
    for(var i=0; i<answer.length; i++){
        tmp += answer[i]
    }
    return tmp;
}