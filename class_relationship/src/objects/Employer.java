package objects;

import java.util.ArrayList;

public class Employer {
	private String name, industry;
	private ArrayList<Person> employees;
	
	public Employer(String name, String industry, ArrayList<Person> employees) {
		super();
		this.name = name;
		this.industry = industry;
		this.employees = employees;
	}

	public void addEmployee(Person p) {
		employees.add(p);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public ArrayList<Person> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Person> employees) {
		this.employees = employees;
	}
	
	
}
