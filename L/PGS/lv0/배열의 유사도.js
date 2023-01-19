function solution(s1, s2) {
    var answer = s1.filter(function(e,index){
        var tmpNum = 0;
        for(var tmp in s2){
            if(e == s2[tmp]) tmpNum++;
        }
        return tmpNum;
    })
    return answer.length;
}