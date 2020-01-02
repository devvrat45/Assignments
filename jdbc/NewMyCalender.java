package jdbc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NewMyCalender {
		
		
		public static void main(String[] args) {
			LocalDate Id = LocalDate.now();
			System.out.println(Id);
			DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-MM-YYYY");
			System.out.println(dtf.format(Id));
			
		}
		
}
