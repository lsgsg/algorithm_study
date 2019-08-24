/**
 * x만큼 간격이 있는 n개의 숫자
 */
function solution(x, n) {
  let array = Array(n).fill(x);
  return array.map((value, idx) => {
      return value + (x * idx);
  })
}