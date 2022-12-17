// js 버전
function solution(quiz){
    var answer = [];
    var disAnswer = [];

    for(var i=0; i<quiz.length; i++){
        disAnswer[i] = quiz[i].split(" ");
        if(disAnswer[i][1] == "+"){
            answer[i] = ((Number(disAnswer[i][0]) + Number(disAnswer[i][2]))==disAnswer[i][4])?"O":"X"
        } else {
            answer[i] = ((Number(disAnswer[i][0]) - Number(disAnswer[i][2]))==disAnswer[i][4])?"O":"X"
        }
    }
    return answer;
}