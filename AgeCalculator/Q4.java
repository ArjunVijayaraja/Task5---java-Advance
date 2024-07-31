package strings;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Birthdate (yyyy-mm-dd): ");
		String b_Date = scanner.nextLine();
		// LocalDate currdate = LocalDate.parse(LocalDate.now());
		try {
			LocalDate ld_bDate = LocalDate.parse(b_Date);
			// System.out.println(ld_bDate);
			// ChronoPeriod.between(LocalDate.now().format(null), ld_bDate);
			// System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
			String curDate = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
			LocalDate cDate = LocalDate.parse(curDate);
			Period period = Period.between(ld_bDate, cDate);
			int years = period.getYears();
			int mon = period.getMonths();
			int day = period.getDays();
			System.out.println(years + " years " + mon + " months " + day + " Days");
		} catch (Exception e) {
			System.out.println("Enter a valid date ...!");
		}

	}

}

