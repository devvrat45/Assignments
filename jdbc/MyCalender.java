package jdbc;

import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class MyCalender {

	public static void main(String[] args) {
		
//		Calendar cal=Calendar.getInstance();
//		System.out.println(cal);
//		int yr=cal.get(Calendar.YEAR);
//		int mon=cal.get(Calendar.MONTH);
//		int day=cal.get(Calendar.DATE);
//		
//
//		System.out.println(day+":"+(mon+1)+":"+yr);
//		
//		Date dt=new Date();
//		long millis=dt.getTime();
//		Calendar calndr=Calendar.getInstance();
//		calndr.setTime(dt);
//		calndr.setTimeInMillis(millis);
		daysToDate("19-12-2020");

	}
	
	
	public static int daysToDate(String date) {
		int numDays=0;
		LocalDate today = LocalDate.now();
		int thisyear = today.getYear();
		int thismonth=today.getMonthValue();
		int thisday = today.getDayOfMonth();
		System.out.println(thisyear+":"+thismonth+":"+thisday);
		
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate futureDate = LocalDate.from(dtf.parse(date));
		int futureYear = futureDate.getYear();
		int futureMonth = futureDate.getMonthValue();
		int futureDay= futureDate.getDayOfMonth();
		
		System.out.println(futureYear+":"+futureMonth+":"+futureDay);

		System.out.println("----------------using chronounits------------------------------");
		
		long daysBetween = ChronoUnit.DAYS.between(today, futureDate);
		System.out.println(daysBetween);
		
		return numDays;
	}

}
