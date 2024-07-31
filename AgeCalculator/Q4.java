package strings;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		//Creating the scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Birthdate (yyyy-mm-dd): ");
		//getting the Birthdate as an input from the user as a string
		String b_Date = scanner.nextLine();
		//writing the logic inside the try block - to handle the error in case an invaild number/date is provided
		try {
			//converting the String to LocalDate format
			LocalDate ld_bDate = LocalDate.parse(b_Date);
			//Getting the current date using LocalDate --formatter is used to get only the date
			String curDate = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
			//converting the Currentdate to the LocalDate format
			LocalDate cDate = LocalDate.parse(curDate);
			//Creating a period variable and passing the birthdate and local date -- for further calculations
			Period period = Period.between(ld_bDate, cDate);
			//storing the years, months and date in the below variables
			int years = period.getYears();
			int mon = period.getMonths();
			int day = period.getDays();
			//this is the output
			System.out.println(years + " years " + mon + " months " + day + " Days");
		} catch (Exception e) {
			System.out.println("Enter a valid date ...!");
		}

	}

}

