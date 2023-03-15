function solution(num, k) {
    var answer = num.toString()
    for(var i=0; i<answer.length; i++){
        if(answer.charAt(i) == k){
            return i+1
        }
    }
    return -1;
}