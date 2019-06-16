package algorithmStudy;

public class pro_12 {
    boolean solution(String s) {
        boolean answer = true;

        int pCnt = 0;
        int yCnt = 0;
        
        for (int i=0; i<s.length(); i++) {
        	if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
        		pCnt++;
        	}else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
        		yCnt++;
        	}
        }
        
        if ( pCnt != yCnt ) {
        	return false;
        }

        return answer;
    }
}