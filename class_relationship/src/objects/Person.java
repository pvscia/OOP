package objects;

public class Person {
	private String name;
	private int age;
	private Address address;
	private Employer employer;
	
	public Person(String name, int age, Address address, Employer employer) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.employer = employer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	
	
	
}
