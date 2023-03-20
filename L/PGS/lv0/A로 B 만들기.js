function solution(before, after) {
    // var answer = before.split('').reverse().join('')
    // if(answer == after){
    //     return 1
    // } else {
    //     return 0
    // }

    // var tmp = '';
    // for (let i = before.length - 1; i >= 0; i--) {
    //   tmp += before[i];
    // }
    // return tmp==after?1:0;

    return (before.split('').sort().join('') === after.split('').sort().join(''))?1:0
}