function solution(my_string) {
    var answer = my_string.toUpperCase();
    var tmp = "";
    for(var i=0; i<my_string.length; i++){
        if(answer.charAt(i) == my_string.charAt(i)) tmp += answer.charAt(i).toLowerCase();
        else tmp += answer.charAt(i);
    }
    return tmp;
}