function solution(order) {
    var answer = order.toString();
    var tmp = 0;
    for(var i=0; i<answer.length; i++) {
        if(answer.charAt(i)=='3') tmp++;
        else if(answer.charAt(i)=='6') tmp++;
        else if(answer.charAt(i)=='9') tmp++;
    }
    return tmp;
}