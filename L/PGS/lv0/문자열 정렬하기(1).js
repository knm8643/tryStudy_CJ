function solution(my_string) {
    var answer = [];
    var regex = /[^0-9]/g;
    var regexResult = my_string.replace(regex, "");
    for(var i=0; i<regexResult.length; i++){
        answer.push(parseInt(regexResult.charAt(i)));
    }
    return answer.sort();
}