package algorithmStudy;

public class pro_10 {
	public long solution(int a, int b) {
		long answer = 0;
		int temp = 0;
		
		if (a == b) {
			return a;
		} else if (a > b) { // a�� b���� Ŭ ��� �� ���� ������ �ٲ��ش�.
			temp = b;
			b = a;
			a = temp;
		}
		
		for (int i = a; i <= b; i++) {
			answer += i;
		}
		
		return answer;
	}
}
