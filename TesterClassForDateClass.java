package assignments;

import java.util.Calendar;
import java.util.Scanner;

class Date {
	private int day;
	private int month;
	private int year;  

	public Date() {
		Calendar c = Calendar.getInstance();
		day = c.get(Calendar.DATE);
		month = c.get(Calendar.MONTH);
		year = c.get(Calendar.YEAR);
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// Gettor Methods
	public void getDay() {
		System.out.print(this.day);
	}

	public void getMonth() {
		System.out.print(this.month);
	}

	public void getYear() {
		System.out.print(this.year);
	}

	// Settor Methods
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Facilitator Method
	public void displayDate() {
		System.out.println("Date: " + day + "\\" + month + "\\" + year);
	}

}

class DateTestor {
	Date date = new Date();
	Scanner sc = new Scanner(System.in);

	public void setDate() {
		System.out.print("Day: ");
		date.setDay(sc.nextInt());

		System.out.println("Month: ");
		date.setMonth(sc.nextInt());

		System.out.println("Year: ");
		date.setYear(sc.nextInt());
	}

	public void getDate() {
		date.getDay();
		System.out.print("/");
		date.getMonth();
		System.out.print("/");
		date.getYear();
		System.out.println();
	}
}

public class TesterClassForDateClass {

	public static void main(String[] args) {
		// test using Date class object

//		Date dt = new Date();
//		dt.displayDate();
//		
//		Date dt2 = new Date(1 , 1, 2000);
//		dt2.displayDate();

		// test using DateTester class object

		DateTestor tester = new DateTestor();
		tester.getDate();
		tester.setDate();
		tester.getDate();

	}

}
