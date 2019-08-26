/**
 * 프로그래머스 - 하샤드 수
 */
function solution(x) {
  const sum = x.toString().split("").reduce((pre, next) => { parseInt(pre) + parseInt(next) });
  return x % sum === 0;
}
