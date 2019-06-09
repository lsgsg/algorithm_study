package algorithmStudy;

import java.util.Arrays;
import java.util.Collections;

public class pro_13 {
	  public String solution(String s) {
	      String answer = "";
	      String[] chk = new String[s.length()];
	      
	      for (int i=0; i<s.length(); i++) {
	    	  if (i == s.length() -1) {
	    		  chk[i] = s.substring(i);
	    	  }
	    	  
	    	  chk[i] = s.substring(i, i+1);
	      }
	      
	      Arrays.sort(chk, Collections.reverseOrder());
	      
	      /*for (int i=0; i<s.length()-1; i++) {
	    	  for(int j = i+1; j < s.length(); j++) {
	    		  if (s.charAt(i) <= s.charAt(j)) {
	    			  answer = chk[i];
	    			  chk[i] = chk[j];
	    			  chk[j] = answer;
	    		  }
	    	  }
	      }*/
	      
	      answer = "";
	      
	      for (int i=0; i<s.length(); i++) {
	    	  answer += chk[i];
	      }
	      
	      return answer;
	  }
}
