function solution(arr)
{
    var uniqueArray = [arr[0]];
    for (var i = 1; i < arr.length; i++) {
      if (arr[i] !== arr[i - 1]) {
        uniqueArray.push(arr[i]);
      }
    }
    return uniqueArray;
}