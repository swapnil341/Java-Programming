import java.util.Calendar;
import java.util.Scanner;

//********************* Calendar  *****************

class Date {
	// Fields
	private int day;
	private int month;
	private int year;

	// Methods
	public void initDate() {
		Calendar cal = Calendar.getInstance();
		day = cal.get(Calendar.DATE);
		month = cal.get(Calendar.MONTH) + 1;
		year = cal.get(Calendar.YEAR);
	}

	public void getDate() {
		System.out.println(day + "\\" + month + "\\" + year);
	}

	public void setDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Day: ");
		day = sc.nextInt();
		System.out.print("Month: ");
		month = sc.nextInt();
		System.out.print("Year: ");
		year = sc.nextInt();
	}
}

public class CalendarImplementation {
	public static void main(String[] args) {
		Date dt = new Date();
		dt.initDate();
		dt.getDate();
		dt.setDate();
		dt.getDate();
	}

}
