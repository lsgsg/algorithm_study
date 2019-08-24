/**
 * 자릿 수 더하기
 */
function solution (number)
{
  return number.toString().split("").reduce((pre, next) => {
    return parseInt(pre) + parseInt(next);
  }, 0);
}
