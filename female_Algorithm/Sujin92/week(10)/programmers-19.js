/**
 * 핸드폰 번호 가리기 문제
 */
function solution(phone_number) {
  return phone_number.replace(/\d(?=\d{4})/g, "*");
}