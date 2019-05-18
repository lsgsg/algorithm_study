package algorithmStudy;

import java.util.ArrayList;
import java.util.List;

public class pro_5 {
	public static void main(String[] args) {
        List<Integer> lostL = new ArrayList<>();
		lostL.add(1);
		
		int n = 5;
		int[] lost = {3, 4};
		int[] reserve = {3, 4, 5};
		
		System.out.println(solution(n , lost, reserve));
	}
    public static int solution(int n, int[] lost, int[] reserve) {
    	/*int lostLength = lost.length;
        int answer = n - lostLength;*/
    	int answer = 0;
        List<Integer> lostL = new ArrayList<>();
        List<Integer> reserveL = new ArrayList<>();
        List<Integer> answerL = new ArrayList<>();
        
        // list �� lost, reserve �迭 �Ű� ��� > �̷��� ���� �˻��̳� �׷� �� �� ���� �� �� ���� �� ���Ҵ�.
        for (int i = 0; i<lost.length; i++) {
        	lostL.add(lost[i]);
        }
        
        for (int i = 0; i<reserve.length; i++) {
        	reserveL.add(reserve[i]);
        }
        
        // ü���� ������ �ְ�, ������ ���� �л����� list���� ����
        // ��¥ ���� (.remove(index))�ϸ� list ����� �ٲ�� lost/reserve ����Ʈ ���� ��ġ�� �ֵ��� ��Ȯ�� ���� ó������ �� ����
        // �׷��� ���� ��ĥ ��� remove�� �ƴ� 0���� ��� �������־� ó�� >> �� ��� ����� �л��� �׳� �л��� ��������.
        for (int i : reserveL) {
        	if (lostL.indexOf(i) >= 0) {
        		reserveL.set(reserveL.indexOf(i), 0);
        		lostL.set(lostL.indexOf(i), 0);
        	}
        }
        
        System.out.println("size : " + reserveL.size());
        
        for (int i = 1; i <= n; i++) {
        	System.out.println("i : " + i + ", i��ġ : " + reserveL.indexOf(i));
        	
        	// ������ ���� �ִ� �л����� (index���� ���°�� -1�� ��ȯ)
        	if ( reserveL.indexOf(i) >= 0) {
        		answer++; // ������ ���� �ִ� �л� ���� ++
        		
        		// 
        		/*if (lostL.indexOf(i) >= 0) {
        			System.out.println("i : " + i);

        		} else*/ 
        		if (lostL.indexOf(i - 1) >= 0) { // ������ ���� �ִ� �л� �� �л��� ü���� ������������
        			System.out.println("i-1 : " + (i-1));
        			// answerL.add(i-1); i������ ���� ���� ��� �̹� for���� ���ұ� ������ �̰� �ʿ� ����
        			answer++; // ���� ���� �޾����Ƿ� �л� ���� ++
        			lostL.remove(lostL.indexOf(i - 1)); // ��� indexOf�� �̿��� ��ġ �˻��� �ϴϱ� remove�ص� �������.
        		} else if (lostL.indexOf(i + 1) >= 0) { // ������ ���� �ִ� �л� �� �л��� ü���� ������������
        			System.out.println("i+1 : " + (i+1));
        			// �̹� ���� ���� �޾Ҵٴ� ��
        			// �̰� �����ָ� ������ �޾Ƽ� �̹� ���� ++ �Ǿ��µ� �߰������� ���� �л����� üũ�Ǿ� ���� ++�� ���ִ�.
        			answerL.add(i+1);
        			answer++; // ���� ���� �޾����Ƿ� �л� ���� ++
        			lostL.remove(lostL.indexOf(i + 1)); // ��� indexOf�� �̿��� ��ġ �˻��� �ϴϱ� remove�ص� �������.
        		}
        		
        	// ���� ���� ���� �л��� �ƴϰ�, �̹� ���� �� ���� �л����� �� ���� �л��� �ƴ� ���	
        	} else if (lostL.indexOf(i) < 0 && answerL.indexOf(i) < 0) {
        		answer++; // �Ϲ� �л����� �Ǵ��ؼ� �л� ���� ++
        	}
        	
        	System.out.println("�� : " + answer);
        }
        
        // ������ �õ�.. 
        /*for (Integer i : reserveL) {
        	System.out.println("i : " + i);
        	if ( lostL.indexOf(i) >= 0 ) {
        		System.out.println(i + "�� ������ �ְ�, ���ϵ� �°�~");
        		reserveL.set(lostL.indexOf(i), 0);
        		lostL.remove(lostL.indexOf(i));
        		answer++;
        	} else if ( lostL.indexOf(i-1) >= 0 ) {
        		System.out.println((i-1) + "(��)�� ü������ ���� �¾Ƽ� " + i + "(��)�� �������!");
        		lostL.remove(lostL.indexOf(i-1));
        		answer++;
        	} else if ( lostL.indexOf(i+1) >= 0 ) {
        		System.out.println((i+1) + "(��)�� ü������ ���� �¾Ƽ� " + i + "(��)�� �������!");
        		lostL.remove(lostL.indexOf(i+1));
        		answer++;
        	}
            System.out.println("answer : " + answer);
        }*/
        
        return answer;
    }
}
