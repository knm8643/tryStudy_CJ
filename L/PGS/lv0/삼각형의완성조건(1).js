function solution(sides) {
    sides.sort(function (a, b) {
        return a - b;
    });
    return (sides[0]+sides[1]) > sides[2]?1:2;
}