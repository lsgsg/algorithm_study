/**
 *  콜라츠 추측
 */
function collatz(num) {
  let value = num;
  if (value === 1) {
    return 0;
  }

  for (let i = 1; i <= 500; i++) {
      value = value % 2 === 0 ? value / 2 : value * 3 + 1;
      if (value === 1) {
        return i;
      }
  }
  return -1;
}