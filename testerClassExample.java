import java.util.Scanner;

// ************************* Employee and tester class ********************

class Employee {

	// Fields
	private String name;
	private int id;
	private double salary;

	// Methods
	// Parameter-less Constructors
	public Employee() {
		// Constructor Chaining
		this("nan", 0, 0.0);
	}

	// Parameterized Constructor
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	// Mutator Methods
	public void setName(String name) {
		this.name = name;
	}

	public void setid(int id) {
		this.id = id;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Inspector Methods
	public void getName() {
		System.out.println("Name: " + name);
	}

	public void getId() {
		System.out.println("ID: " + id);
	}

	public void getSalary() {
		System.out.println("Salary: " + salary);
	}
}

// Tester Class
class TestEmployee {
	Employee emp = new Employee();

	public void settor() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		emp.setName(sc.nextLine());

		System.out.print("Id: ");
		emp.setid(sc.nextInt());

		System.out.print("Salary: ");
		emp.setSalary(sc.nextDouble());
	}

	public void gettor() {
		emp.getName();
		emp.getId();
		emp.getSalary();
	}
}

public class testerClassExample {

	public static void main(String[] args) {
		TestEmployee test1 = new TestEmployee();
		test1.settor();
		test1.gettor();

	}

}
