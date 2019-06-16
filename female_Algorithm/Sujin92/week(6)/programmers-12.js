/**
 * 프로그래머스 - 문자열 다루기 기본
 */
function solution(s) {
    const reg = /^(\s|\d)+$/;
    return (s.length === 4 || s.length === 6) && reg.test(s);
}