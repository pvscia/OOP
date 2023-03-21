package main;

import java.util.ArrayList;

import objects.Address;
import objects.Employer;
import objects.Person;

public class Main {

	public static void main(String[] args) {
		//Random data generated using chatgpt
//		tapi structurenya ama object nya saya bikin sendiri ya sir :)
		ArrayList<Address> addresses = new ArrayList<>();
		ArrayList<Employer> employers = new ArrayList<>();
		ArrayList<Person> people = new ArrayList<>();
		
        Address address1 = new Address("123 Main St", "New York", "NY");
        Address address2 = new Address("456 Oak Ave", "Los Angeles", "CA");
        Address address3 = new Address("789 Maple Dr", "Chicago", "IL");
        Address address4 = new Address("321 Pine St", "Houston", "TX");
        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        addresses.add(address4);

        Employer employer1 = new Employer("Acme Inc", "Manufacturing", new ArrayList<Person>());
        Employer employer2 = new Employer("Globex Corp", "Technology", new ArrayList<Person>());
        Employer employer3 = new Employer("Wayne Enterprises", "Finance", new ArrayList<Person>());
        employers.add(employer1);
        employers.add(employer2);
        employers.add(employer3);

        Person person1 = new Person("John Doe", 30, address1, employer1);
        address1.addResident(person1);
        employer1.addEmployee(person1);
        
        Person person2 = new Person("Jane Smith", 25, address2, employer2);
        address2.addResident(person2);
        employer2.addEmployee(person2);
        
        Person person3 = new Person("Bob Johnson", 40, address3, employer1);
        address3.addResident(person3);
        employer1.addEmployee(person3);
        
        Person person4 = new Person("Sara Lee", 35, address4, employer3);
        address4.addResident(person4);
        employer3.addEmployee(person4);
        
        Person person5 = new Person("Mike Smith", 28, address1, employer2);
        address1.addResident(person5);
        employer2.addEmployee(person5);
        
        Person person6 = new Person("Emily Kim", 33, address2, employer1);
        address2.addResident(person6);
        employer1.addEmployee(person6);
        
        Person person7 = new Person("Tom Davis", 45, address3, employer2);
        address3.addResident(person7);
        employer2.addEmployee(person7);
        
        Person person8 = new Person("Lisa Chen", 27, address4, employer3);
        address4.addResident(person8);
        employer3.addEmployee(person8);
        
        Person person9 = new Person("Kevin Lee", 31, address1, employer1);
        address1.addResident(person9);
        employer1.addEmployee(person9);
        
        Person person10 = new Person("Michelle Wu", 29, address2, employer2);
        address2.addResident(person10);
        employer2.addEmployee(person10);
        
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);
        
//        With proper relationship
		System.out.println("================================================================================");
        for (Employer e : employers) {
			System.out.println("COMPANY NAME : " + e.getName());
			System.out.println("INDUSTRY : " + e.getIndustry());
			System.out.println();
			
			System.out.println("EMPLOYEES");
			System.out.println("----------------------------------------------------------------------------");
			for (Person p : e.getEmployees()) {
				System.out.println("Name : " + p.getName());
				System.out.println("Age : " + p.getAge());
				System.out.println("Address : " + p.getAddress().getStreet() + ", " + p.getAddress().getCity() + ", " + p.getAddress().getState());
				System.out.println("----------------------------------------------------------------------------");
			}
			
			System.out.println("================================================================================");
		}
        
//	without proper relationship
        System.out.println("EMPLOYERS");
        for (Employer e : employers) {
        	System.out.println("COMPANY NAME : " + e.getName());
        	System.out.println("INDUSTRY : " + e.getIndustry());
        	System.out.println();
        }
        System.out.println();
        
        System.out.println("ADDRESSES");
        for (Address a : addresses) {
        	System.out.println("Street : " + a.getStreet());
        	System.out.println("City : " + a.getCity());
        	System.out.println("State : " + a.getState());
        	System.out.println();
        }
	}
	

}
