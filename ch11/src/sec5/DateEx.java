package sec5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일  hh시 mm분 ss초");
		
		String date1 = sdf1.format(now);
		String date2 = sdf1.format(now);
		// yyyy = 년, MM = 월, dd = 일, hh = 시, mm = 분, ss = 초
		int year = now.getYear();		// 년
		int month = now.getMonth();		// 월
		int day = now.getDate();		// 일
		int hour = now.getHours();		// 시
		int minute = now.getMinutes();	// 분
		int second = now.getSeconds();	// 초
		int week = now.getDay();		// 요일 번호
	}

}
