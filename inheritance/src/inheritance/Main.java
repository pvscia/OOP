package inheritance;

import java.util.Scanner;

public class Main {
	
	public Main() {
		Person p = new Person("Peter", "04-10-2003");
		Mahasiswa m = new Mahasiswa("Lily", "05-03-2003", "2543103405", 12);
		Dosen d = new Dosen("John", "19-11-2003", "D1203", 5);
		int choice;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("1. Person");
			System.out.println("2. Mahasiswa");
			System.out.println("3. Dosen");
			System.out.println("4. Exit");
			System.out.print(">> ");
			choice = s.nextInt();
			s.nextLine();
			
			switch (choice) {
			case 1: 
				System.out.println("PERSON OBJECT");
				System.out.println("Name : " + p.getName());
				System.out.println("Date of birth : " + p.getDate());
				System.out.println();
				break;
			case 2: 
				System.out.println("MAHASISWA OBJECT");
				System.out.println("Name : " + m.getName());
				System.out.println("Date of birth : " + m.getDate());
				System.out.println("Student ID : " + m.getStudent_id());
				System.out.println("Current Point : " + m.getPoint());
				System.out.println();
				m.helpingDosen();
				System.out.println();
				break;
			case 3: 
				System.out.println("DOSEN OBJECT");
				System.out.println("Name : " + d.getName());
				System.out.println("Date of birth : " + d.getDate());
				System.out.println("Dosen Code : " + d.getCode_dosen());
				System.out.println("Current Point : " + d.getPoint());
				System.out.println();
				d.selfDev();
				d.teach();
				d.p2m();
				d.research();
				d.otherWorks();
				System.out.println();
				break;
			}
			
		}while(choice!=4);
	}

	public static void main(String[] args) {
		new Main();

	}

}
