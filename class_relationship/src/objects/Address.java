package objects;

import java.util.ArrayList;

public class Address {
	private String street,city,state;
	private ArrayList<Person> residents;
	
	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.residents = new ArrayList<>();
	}
	
	public void addResident(Person p) {
		residents.add(p);
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ArrayList<Person> getResidents() {
		return residents;
	}

	public void setResidents(ArrayList<Person> residents) {
		this.residents = residents;
	}
	
	
}
