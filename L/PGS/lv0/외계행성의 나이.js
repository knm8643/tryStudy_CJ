function solution(age) {
    var answer =['a','b','c','d','e','f','g','h','i','j']
    var tmpString = age.toString();
    var tmp = age.toString().length;
    for(var i=0; i<tmp; i++){
        tmpString += answer[tmpString.charAt(i)]
    }
    return tmpString.substring(tmp,tmpString.length);
} 