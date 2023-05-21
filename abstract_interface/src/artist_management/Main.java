package artist_management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
//	DIFFERENCE BETWEEN ABSTRACT AND INTERFACE
//	Abstract classes and interfaces in Java have some key differences. An abstract class, declared with the abstract keyword, cannot be instantiated directly and serves as a blueprint for subclasses. It can contain both abstract and non-abstract methods, as well as instance variables and constructors. In contrast, an interface, declared with the interface keyword, also cannot be instantiated directly, but it defines a set of methods that a class must implement. Interfaces only allow abstract methods, constants, and default methods, and they cannot have instance variables or constructors.
//
//	When it comes to inheritance, an abstract class allows for class inheritance, meaning a class can extend only one abstract class. Subclasses inherit the methods and fields of the abstract class. On the other hand, interfaces allow for interface inheritance, enabling a class to implement multiple interfaces, ensuring it provides an implementation for all the methods defined in those interfaces.
//
//	Method implementation differs as well. Abstract classes can have abstract and non-abstract methods, and subclasses must provide an implementation for the abstract methods. Abstract classes can also provide default implementations for certain methods, which subclasses can choose to override. Interfaces, however, only allow for abstract methods. All methods in an interface must be implemented by the class that implements the interface. Starting from Java 8, interfaces can have default methods, which provide a default implementation that implementing classes can choose to override.


	static ArrayList<Artist> artists = new ArrayList<>();
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice=0;
		
		init();
		
		while(true) {
			System.out.println("Artist Management System");
			System.out.println("========================");
			System.out.println("1. Add new artist");
			System.out.println("2. Schedule artist");
			System.out.println("3. Exit");
			System.out.print(">> ");
			choice = s.nextInt();s.nextLine();
			
			if(choice==1) {
				int type=0;
				while(type<1||type>3) {
//					SELECTING THE TYPE OF ARTIST THE MANAGEMENT WANT TO ADD
					System.out.print("Select Type of artist : \n1. Soloist\n2. Girlband\n3. Boyband\n>> ");
					type = s.nextInt();s.nextLine();
				}
				
//				ASK USER TO INPUT THE NECESSARY DATA
				String name,gender = null,agency;
				
				System.out.print("Name : ");
				name = s.nextLine();
				
				
				if(type==1) {
					System.out.print("Gender : ");
					gender = s.nextLine();	
				}
				
				System.out.print("Agency : ");
				agency = s.nextLine();
				
//				INSERTING NEW DATA INTO THE ARRAYLIST
				if(type==1) {
					artists.add(new Soloist(name, gender, agency));
				}else if(type==2) {
					artists.add(new Girlband(name, agency));
				}else {
					artists.add(new Boyband(name, agency));
				}
				
				System.out.println("Welcome "+name+"!");
				
			}else if(choice==2) {
//				SHOWING ALL ARTIST IN THE DATA
				for(int i=0;i<artists.size();i++) {
					System.out.println((i+1)+". "+artists.get(i).getName()+" from "+artists.get(i).getAgency());
				}
				
//				CHOOSING ARTIST
				int artist=0;
				while(artist<1||artist>artists.size()) {
					System.out.print("Choose Artist to schedule: ");
					artist = s.nextInt();s.nextLine();
				}
				artist--;
				
//				SELECTING THE ACTIVITY
				int activity=0;
				while(activity<1||activity>4) {
					System.out.println("Select Activity for "+artists.get(artist).getName());
					System.out.println("1. Music Show");
					System.out.println("2. Variety Show");
					System.out.println("3. Award Show");
					System.out.println("4. Concert");
					activity = s.nextInt();s.nextLine();
				}
				
//				USER INPUT PLACE OF THE ACTIVITY/EVENT
				String place;
				if(activity==4) {
					System.out.print("Concert Country: ");
				}else {
					System.out.print("Show Name: ");
				}
				place= s.nextLine();
				
//				ARTIST DOING THE ACTIVITY
				switch (activity) {
				case 1: 
					artists.get(artist).musicShow(place);
					break;
					
				case 2: 
					artists.get(artist).varietyShow(place);
					break;
					
				case 3: 
					artists.get(artist).awardShow(place);
					break;
					
				case 4: 
					artists.get(artist).concert(place);
					break;
		
				}
				
				
			}else if(choice==3) {
//				TERMINATE THE PROGRAM
				return;
			}
			
		}
	}
	
	public static void init() {
//		INITIALIZE DATA
		artists.add(new Soloist("IU", "Female", "EDAM Entertainment"));
		artists.add(new Girlband("ITZY", "JYP Entertainment"));
		artists.add(new Boyband("Straykids", "JYP Entertainment"));
	}

}
