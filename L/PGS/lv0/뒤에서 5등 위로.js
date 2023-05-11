function solution(num_list) {
    num_list.sort(function(a, b)  {
        if(a > b) return 1;
        if(a === b) return 0;
        if(a < b) return -1;
    });
    return num_list.slice(-5)
}