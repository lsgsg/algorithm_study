package algorithmStudy;

public class pro_14 {
	public boolean solution(String s) {
		boolean answer = true;
		
		if (s.length() != 4) {
			return false;
		}
		
		for (int i=0; i<s.length(); i++) {
			if ( s.charAt(i) < 48 || s.charAt(i) > 57) {
				return false;
			}
		}
		
		return answer;
	}
}
