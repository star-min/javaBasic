package sec5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		String str = date.toString();
		Date now = date.getTime();
		Calendar d = new GregorianCalendar(2022,3,14);		// 날짜만 저장가능한 그레고리안
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일  hh시 mm분 ss초");
		
		String date1 = sdf1.format(now);
		String date2 = sdf2.format(now);
												// month 들은 전부 +1을 해주어야한다 0부터 세기때문
		System.out.println(date1);
		System.out.println(date2);
		
		int year = date.get(Calendar.YEAR);		// 년
		int month = date.get(Calendar.MONTH);		// 월
		int day = date.get(Calendar.DAY_OF_MONTH);		// 일
		int hour = date.get(Calendar.HOUR);		// 시
		int minute = date.get(Calendar.MINUTE);	// 분
		int second = date.get(Calendar.SECOND);	// 초
//		int week = now.get(Calendar.WEEK);		// 요일 번호
//		System.out.println(month+1);
		System.out.println(year+"년 "+month+"월 "+day+"일 "+hour+"시 "+minute+"분 "+second+"초");
	}

}
