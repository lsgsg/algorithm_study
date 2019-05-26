package algorithmStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pro_9 {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>(); // �迭�� �Ϸ��ٰ� �迭 ���̸� ÷���� ���� �׳� ����Ʈ��
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			// divisor�� �������� ����Ʈ�� �߰�
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		// ����Ʈ�� �߰��� ���� ������ �׳� answer�� -1 �ֱ�
		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[list.size()];
			
			for (int i = 0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
		
		return answer;
	}
}
