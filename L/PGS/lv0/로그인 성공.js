function solution(id_pw, db) {
    var answer = '';
    var userId = id_pw[0];
    var userPw = id_pw[1];

    for(var i=0; i<db.length; i++){
        if(userId == db[i][0] && userPw == db[i][1]){
            answer = 'login';
        }

        if(answer != 'login' && userId == db[i][0] && userPw != db[i][1]){
            answer = 'wrong pw';
        }

        if(answer == '' && db[i][0] != userId){
            if(db[i][1] == userPw){
                answer = (db[i][0] != userId)?"fail":""
            }
        }
    }
    return answer;
}