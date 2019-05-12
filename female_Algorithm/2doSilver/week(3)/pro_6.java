package algorithmStudy;

public class pro_6 {
	public static void main(String[] args) {
		System.out.println(solution(1, 7));
	}

	public static String solution(int a, int b) {
		// dataFormat�̶� Calender �Ἥ �ϴ� �� (42~55ms)
		/*//		import java.text.DateFormat;
		//		import java.text.ParseException;
		//		import java.text.SimpleDateFormat;
		//		import java.util.Calendar;
		//		import java.util.Date;
		String answer = "";
		String[] days = { "", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		String inputDate = String.format("2016%02d%02d", a, b);

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

		Date date = null;
		try {
			date = dateFormat.parse(inputDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);

		return days[calendar.get(Calendar.DAY_OF_WEEK)];*/
		
		// ���� ���� �ϴ� �� (2ms ����)
		String answer = "";
		int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 5�� 24���� ���� ��� 1~4������ �ϼ� + 24�� ���� �� �ְ� �ϴ� ��
		for (int i=1; i<a; i++) {
			System.out.println(i);
			b += month[i];
		}
		
		// 1�� 1���� �ݿ����̶�� �־������� �װ� �������� b%7�� 1�� �� FRI�̰�, 0�� �� THU��� ���� �ϴ� ��
		// �׷��� ���� ���� 2016�� �� �ϼ����ٰ� 7�� ���� �� �������� switch�� ������ üũ
		switch (b % 7) {
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;
		case 0:
			answer = "THU";
			break;

		default:
			break;
		}
		
		return answer;
	}
}
