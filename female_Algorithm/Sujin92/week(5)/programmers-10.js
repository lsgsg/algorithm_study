/**
 * 프로그래머스 - 두 정수 사이의 합
 * @param {} a 정수 1
 * @param {*} b 정수 2
 */
function solution(a, b) {
  let sum = 0
  for (let item = Math.min(a, b); item <= Math.max(a, b); item++) {
    sum += item;
  }
  return sum
}

/**
 * 다른사람 문제 풀이
 */
function solution(a, b) {
  return (a+b)*(Math.abs(b-a)+1)/2
}