function solution(record) {
    var answer = [];
    var name = [];
    var changeName = [];
    // console.log(record);

    for(var i=0; i<record.length; i++){
        name[i] = record[i].split(" ");

        if(record[i].indexOf("Enter") != -1){
            answer[i] = name[i][1] + "/" + name[i][2] + "/님이 들어왔습니다."
        }
        if(record[i].indexOf("Leave") != -1){
            for(var j=0; j<answer.length-1; j++){
                if(answer[j].indexOf(name[i][1]) != -1){
                    name[i] = answer[j].split("/");
                    answer[i] = name[i][0] + "/" + name[i][1] + "/님이 나갔습니다."
                }
            }
        }
        if(record[i].indexOf("Change") != -1){
            for(var q=0; q<answer.length-1; q++){
                if(answer[q].indexOf(name[i][1]) != -1){
                    changeName[q] = answer[q].split("/");
                    answer[q] = changeName[q][0] + "/" + name[i][2] +"/"+ changeName[q][2]
                }
            }
        }
    }
    if(answer.length > 0){
        for(var k=0; k<answer.length; k++){
            changeName[k] = answer[k].split("/");
            if(answer[answer.length-1].indexOf(changeName[k][0]) != -1){
                name[k] = answer[answer.length-1].split("/");
                // answer[k] = changeName[k][1] + changeName[k][2]
                answer[k] = name[k][1] + changeName[k][2]
            }else{
                answer[k] = changeName[k][1] + changeName[k][2]
            }
        }
    }
    // console.log(answer);
    return answer;
}