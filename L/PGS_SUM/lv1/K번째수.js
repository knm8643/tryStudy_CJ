function solution(array, commands) {
    var answer = [];
    var intNumber1 = 0;
    var intNumber2 = 0;
    var intNumber3 = 0;

    for(var i=0; i<commands.length; i++){
        intNumber1 = commands[i][0];
        intNumber2 = commands[i][1];
        intNumber3 = commands[i][2];

        for(var sibal in array){
            if(sibal == (intNumber1-1)){
                console.log("sibal This here? : ", sibal);
                console.log("what is :", (intNumber2-1));
                for(var j=sibal; j<(intNumber2); j++){
                    answer[j] += array[j];
                }
            }
        }
    }
    return answer;
}