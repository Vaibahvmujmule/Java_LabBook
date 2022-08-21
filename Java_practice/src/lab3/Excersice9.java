package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Excersice9 {

	public void datediff(CharSequence textdate) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(textdate, format);
		LocalDate todayDate = LocalDate.now();
		Period period = date.until(todayDate);
		System.out.println("Days Duration : " + period.getDays() + " days");
		System.out.println("Months Duration :" + period.getMonths() + "months");
		System.out.println("Years Duration :" + period.getYears() + "years");
	}

	public static void main(String[] args) {
		System.out.println("Enter the date");
		Scanner sc = new Scanner(System.in);
		String textdate = sc.next();
		Excersice9 x = new Excersice9();
		x.datediff(textdate);
	}

}
