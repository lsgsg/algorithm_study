package algorithmStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pro_11 {
	public static void main(String[] args) {
		String[] string = {"abce", "abcd", "cdx"};
		
		solution(string, 2);
	}
	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		Arrays.sort(strings);
		
		for (int i=0; i<strings.length; i++ ) {
			list1.add(strings[i]);
		}
		
		String[] temp = new String[strings.length];
		
		for (int i = 0; i<strings.length; i++) {
			temp[i] = strings[i].substring(n, n+1);
		}
		
		Arrays.sort(temp);
		
		for (int i = 0; i<temp.length; i++) {
			for (int j = 0; j<list1.size(); j++) {
				if (list1.get(j).substring(n, n+1).equals(temp[i])) {
					list2.add(list1.get(j));
					System.out.println(list1.get(j));
					list1.remove(j);
					break;
				}
			}
		}
		
		for (int i=0 ;i<strings.length; i++) {
			answer[i] = list2.get(i);
		}
	
		return answer;
	}
}
