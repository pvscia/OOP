package inheritance;

public class Person {
	private String name,born_date;

	public Person(String name, String date) {
		super();
		this.name = name;
		this.born_date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return born_date;
	}

	public void setDate(String date) {
		this.born_date = date;
	}
	
	
}
