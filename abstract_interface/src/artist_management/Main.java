package artist_management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

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
					System.out.print("Select Type of artist : \n1. Soloist\n2. Girlband\n3. Boyband\n>> ");
					type = s.nextInt();s.nextLine();
				}
				String name,gender = null,agency;
				
				System.out.print("Name : ");
				name = s.nextLine();
				
				
				if(type==1) {
					System.out.print("Gender : ");
					gender = s.nextLine();	
				}
				
				System.out.print("Agency : ");
				agency = s.nextLine();
				
				if(type==1) {
					artists.add(new Soloist(name, gender, agency));
				}else if(type==2) {
					artists.add(new Girlband(name, agency));
				}else {
					artists.add(new Boyband(name, agency));
				}
				
				System.out.println("Welcome "+name+"!");
				
			}else if(choice==2) {
				for(int i=0;i<artists.size();i++) {
					System.out.println((i+1)+". "+artists.get(i).getName()+" from "+artists.get(i).getAgency());
				}
				
				int artist=0;
				while(artist<1||artist>artists.size()) {
					System.out.print("Choose Artist to schedule: ");
					artist = s.nextInt();s.nextLine();
				}
				artist--;
				
				int activity=0;
				while(activity<1||activity>4) {
					System.out.println("Select Activity for "+artists.get(artist).getName());
					System.out.println("1. Music Show");
					System.out.println("2. Variety Show");
					System.out.println("3. Award Show");
					System.out.println("4. Concert");
					activity = s.nextInt();s.nextLine();
				}
				
				String place;
				if(activity==4) {
					System.out.print("Concert Country: ");
				}else {
					System.out.print("Show Name: ");
				}
				place= s.nextLine();
				
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
				return;
			}
			
		}
	}
	
	public static void init() {
		artists.add(new Soloist("IU", "Female", "EDAM Entertainment"));
		artists.add(new Girlband("ITZY", "JYP Entertainment"));
		artists.add(new Boyband("Straykids", "JYP Entertainment"));
	}

}
