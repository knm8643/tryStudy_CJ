function solution(n) {
    var answer = n.toString();
    var tmp = answer.length;
    var tmpArr = [];
    var trueAnswer = '';

    for(var i=0; i<tmp; i++){
        tmpArr.push(answer.charAt(i));
    };

    tmpArr.sort(function(a, b)  {
        return b - a;
    });

    for(var j=0; j<tmpArr.length; j++){
        trueAnswer += tmpArr[j];
    };
    return Number(trueAnswer);
}