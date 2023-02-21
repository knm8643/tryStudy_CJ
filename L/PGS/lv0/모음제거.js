function solution(my_string) {
    var tmpAnswer = ["a","e","i","o","u"];
    var tmpString = my_string;
    var answer = tmpAnswer.filter(function(e,index){
        if(my_string.indexOf(e) != -1) {
            var tmp = e;
            my_string.replace(tmp,"");
            return e;
        }
    });

    for(var i=0; i<answer.length; i++){
        tmpString = tmpString.replaceAll(answer[i],'')
    }
    return tmpString;
}