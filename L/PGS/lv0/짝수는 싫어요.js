function solution(n) {
    var answer = [];
    for(var i=1; i<=n; i++){
        if(i%2==1){
            answer.push(i);
        }else{
            console.log("짝수는 싫어요!");
        }
    }
    return answer;
}