function solution(my_string) {
    var tmp = 0;
    var result = my_string.replaceAll(/[^0-9]/g, "")
    for(var i=0; i<result.length; i++){
        tmp += Number(result.charAt(i));
    }
    return tmp
}