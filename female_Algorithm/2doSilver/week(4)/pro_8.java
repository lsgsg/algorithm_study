package algorithmStudy;

import java.util.ArrayList;
import java.util.List;

public class pro_8 {
	public int[] solution(int []arr) {
        int[] answer = {};
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        list.add(cnt, arr[cnt]); // ���� �� ó�� ���� ����Ʈ�� �߰�; �迭�� �Ϸ��ٰ� �迭 ���̸� ÷���� ���� ����
       
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("Hello Java");
        
        for (int i = 1; i < arr.length; i++) {
        	// i = 1�� ��, ����Ʈ�� �߰��� 0��° ���� 1��° ���� �Ȱ����� ++cnt�ؼ� ����Ʈ�� �߰�
        	// �� ���� ������ �׳� ���
        	if (list.get(cnt) != arr[i]) {
        		list.add(++cnt, arr[i]);
        	}
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }

        return answer;
	}
}
