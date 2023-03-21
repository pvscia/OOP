package main;

import java.util.ArrayList;

import objects.Address;
import objects.Employer;
import objects.Person;

public class Main {

	public static void main(String[] args) {
        Address address1 = new Address("123 Main St", "New York", "NY");
        Address address2 = new Address("456 Oak Ave", "Los Angeles", "CA");
        Address address3 = new Address("789 Maple Dr", "Chicago", "IL");
        Address address4 = new Address("321 Pine St", "Houston", "TX");

        // Create Employer objects
        Employer employer1 = new Employer("Acme Inc", "Manufacturing", new ArrayList<Person>());
        Employer employer2 = new Employer("Globex Corp", "Technology", new ArrayList<Person>());
        Employer employer3 = new Employer("Wayne Enterprises", "Finance", new ArrayList<Person>());

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
        
        System.out.println(person1.getName() + " works for " + person1.getEmployer().getName() +
                " in " + person1.getEmployer().getIndustry() + " industry, and lives at " +
                person1.getAddress().getStreet() + ", " + person1.getAddress().getCity() + ", " +
                person1.getAddress().getState());

        // Display information without proper relationships
        System.out.println(person3.getName() + " lives at " + address3.getStreet() + ", " +
                address3.getCity() + ", " + address3.getState() + ", and works for " + employer1.getName() +
                " in " + employer1.getIndustry() + " industry");
        
        
	}

}
