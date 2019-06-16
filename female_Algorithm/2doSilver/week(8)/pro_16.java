package algorithmStudy;

public class pro_16 {
	public static void main (String[] args) {
		solution(5);
	}
	public static int solution(int n) {
		int answer = 0;
		
		/*for (int i=2; i<=n; i++) {
			int j = 0;
			for (j=2; j<=i; j++) {
				if (i%j == 0) {
					break;
				}
			}
			
			if (j == i) {
				answer++;
			}
		}*/
		
		// 에라토스체네스의 체
		boolean[] chk = new boolean[n+1];
		for (int i = 2; i <= n; i++) {
			chk[i] = true;
		}
		
		int to = (int) Math.sqrt(n);
		System.out.println("to : " + to);
		
		for (int i = 2; i <= to; i++ ) {
			if (chk[i]) {
				for (int j = i; j*i <= n; j++) {
					chk[j*i] = false;
					System.out.println(j*i);
				}
			}
		}
		
		for (int i=2; i<=n; i++) {
			if (chk[i]) {
				System.out.print(i + " ");
				answer++;
			}
		}
		
		return answer;
	}
}
