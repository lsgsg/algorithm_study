package algorithmStudy;

public class pro_15 {
	public String solution(String[] seoul) {
		String answer = "";
		
		for (int i = 0; i < seoul.length; i++) {
			if ( seoul[i].equals("Kim") ) {
				answer = String.format("�輭���� %d�� �ִ�", i);
				break;
			}
		}
		
		return answer;
	}
}
