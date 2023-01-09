function solution(num_list) {
    var answer = [];
    var tmp = num_list.length;
    for(var i=0; i<num_list.length;i++){
        tmp--;
        answer.push(num_list[tmp]);
    }
    return answer;
}