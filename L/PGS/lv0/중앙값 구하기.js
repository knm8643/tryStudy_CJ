function solution(array) {
    // array.sort()
    array.sort(function(a, b) {
        return a - b;
    });
    var answer = parseInt(array.length/2)
    return array[answer];
}