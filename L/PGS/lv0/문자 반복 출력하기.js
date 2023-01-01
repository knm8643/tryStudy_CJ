function solution(my_string, n) {
    var answer = "";
    for(var i=0; i<my_string.length; i++){
        let ch = my_string.charAt(i);

        for(var p=1; p<=n; p++){
            answer += ch;
        }
    }
    return answer;
}