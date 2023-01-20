function solution(cipher, code) {
    var answer = '';
    for(var i=1; i<=cipher.length; i++){
        if(i%code == 0){
            answer += cipher.charAt(i-1)
        }
    }
    return answer;
}