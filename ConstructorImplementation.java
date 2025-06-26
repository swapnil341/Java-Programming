import java.util.Calendar;
import java.util.Scanner;

//********************* parameter-less and parameterized constructor *****************

class DateC {
	// Fields
	private int day;
	private int month;
	private int year;

	// Methods
	// Parameter-less Constructor
	public DateC() {
		Calendar cal = Calendar.getInstance();
		day = cal.get(Calendar.DATE);
		month = cal.get(Calendar.MONTH) + 1;
		year = cal.get(Calendar.YEAR);
	}

	public DateC(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
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

public class ConstructorImplementation {
	public static void main(String[] args) {
		DateC dt = new DateC();
		dt.getDate();
		dt.setDate();
		dt.getDate();
		DateC dt2 = new DateC(10, 10, 2000);
		dt2.getDate();
	}

}
