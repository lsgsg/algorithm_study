package algorithmStudy;

public class pro_7 {
  public String solution(String s) {
      String answer = "";
      
      int length = s.length();
      int a = length / 2;
      
      // substring : start <= x < end
      if (length % 2 == 0) {
    	  // ���̰� ¦���� �� �ݹ�, �߰����� �������ϱ� �߰���-1���� �߰������� �̾Ƴ��� �ϴϱ�
    	  answer = s.substring(a-1, a+1);
      } else {
    	  // ���̰� Ȧ���� 2�� ���� ������ �̾Ƴ��� �ϴϱ�
    	  answer = s.substring(a, a+1);
      }
      
      return answer;
  }
}
