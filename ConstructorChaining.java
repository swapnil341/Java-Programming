// ******************** constructor chaining **************************** 
class Person {
	public String name;
	public int id;

	// parameter-less constructor
	public Person() {
		this("nan", 0);
	}

	// parameterized constructor
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void setPerson(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void getPerson() {
		System.out.println("Name: " + name + "\nId: " + id);
		System.out.println();
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		Person p = new Person();
		p.setPerson("Abc", 100);
		p.getPerson();
		Person p2 = new Person("Xyz", 200);
		p2.getPerson();
		Person p3 = new Person();
		p3.getPerson();

	}

}
