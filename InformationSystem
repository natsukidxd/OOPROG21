import java.util.ArrayList;
import java.util.Scanner;

public class InformationSystem {
	
	private ArrayList<Student> students;
	private Scanner scan;
	
	public InformationSystem() {
		students = new ArrayList<>();
		students.add(new Student(123, "krist", "dave", "ferrer", "bsit"));
		students.add(new Student(456, "krist", "dave", "ferrer", "bsit"));
		scan = new Scanner(System.in);
	}
	
	public int checkId() {
		
		int id = 0;
		
		while(true) {
			try {
				System.out.print("\tEnter ID No.		: ");
				String idString = scan.nextLine();
				id = Integer.parseInt(idString);
				boolean uniqueId = true;
				for(Student student : students) {
					if(id == student.getId()) {
						uniqueId = false;
						break;
					} 
				}
				if(uniqueId) {
					break;
				} else {
					System.out.println("\t [Invalid ID. \n\t Please try again.]");
				}
			} catch(NumberFormatException e) {
				System.out.println("\t [Invalid input. \n\t Please try again.]");
			}
		}
		return id;
	}

	public void addRecord() {
		System.out.println("\n\tADD Record Menu");
		int id = checkId();
		System.out.print("\tEnter First Name	: ");
		String firstName = scan.nextLine();
		System.out.print("\tEnter Middle Name	: ");
		String middleName = scan.nextLine();
		System.out.print("\tEnter Last Name		: ");
		String lastName = scan.nextLine();
		System.out.print("\tCourse			: ");
		String course = scan.nextLine();
		
		students.add(new Student(id, firstName, middleName, lastName, course));
		System.out.println();
		System.out.println("\tRecord added successfully!");
		System.out.println("\tPress Enter to continue...");
		scan.nextLine();
	}
	
	public void updateRecord() {
		System.out.println("\n\tUPDATE Record Menu");
		
		if(!students.isEmpty()) {
			int id = 0;
			
			while(true) {
				try {
					System.out.print("\tEnter the ID No. of the record to update: ");
					String idString = scan.nextLine();
					id = Integer.parseInt(idString);
					break;
				} catch(NumberFormatException e) {
					System.out.println("\t Invalid input. \n\t Please try again.");
				}
			}
			for(Student student : students) {
				if(student.getId() == id) {
					System.out.println("\n\tRecord found: ");
					System.out.println("\t\tID	: " + student.getId());
					System.out.println("\t\tName	: " + student.getName());
					System.out.println("\t\tCourse	: " + student.getCourse());
					System.out.println("\n\tSelect Options to Perform: ");
					System.out.println("\t   [1] - First Name\n"
							         + "\t   [2] - Middle Name\n"
							         + "\t   [3] - Last Name\n"
							         + "\t   [4] - Course");
					int choice = 0;
					while(true) {
						try {
							System.out.print("\t   Enter your choice: ");
							String choiceString = scan.nextLine();
							choice = Integer.parseInt(choiceString);
							break;
						} catch(NumberFormatException e) {
							System.out.println("\t\tInvalid input.\n\t\tPlease try again.");
						}
					}
					switch(choice) {
					case 1: {
						System.out.print("\t   Enter new First Name: ");
						student.setFirstName(scan.nextLine());
						System.out.println("\n\t   First Name updated successfully!");
						System.out.println("\t   Press Enter to continue...");
						scan.nextLine();
						break;
					}
					case 2: {
						System.out.print("\t   Enter new Middle Name: ");
						student.setMiddleName(scan.nextLine());
						System.out.println("\n\t   Middle Name updated successfully!");
						System.out.println("\t   Press Enter to continue...");
						scan.nextLine();
						break;
					}
					case 3: {
						System.out.print("\t   Enter new Last Name: ");
						student.setLastName(scan.nextLine());
						System.out.println("\n\t   Last Name updated successfully!");
						System.out.println("\t   Press Enter to continue...");
						scan.nextLine();
						break;
					}
					case 4: {
						System.out.print("\t   Enter new Course: ");
						student.setCourse(scan.nextLine());
						System.out.println("\n\t   Course updated successfully!");
						System.out.println("\t   Press Enter to continue...");
						scan.nextLine();
						break;
					}
					}
				}
			}
			
		} else {
			System.out.println("\tNo Records to update.");
			System.out.println("\tPress Enter to continue...");
			scan.nextLine();
		}
		
	}
	
	public void searchRecord() {
		System.out.println("\n\tSEARCH Record Menu");
		if(!students.isEmpty()) {
			System.out.println("\tSelect Options to Perform: ");
			System.out.println("\t   [1] - Search by ID No.\n"
			         		 + "\t   [2] - Search by Last Name");
			int choice = 0;
			while(true) {
				try {
					System.out.print("\t   Enter your choice: ");
					String choiceString = scan.nextLine();
					choice = Integer.parseInt(choiceString);
					break;
				} catch(NumberFormatException e) {
					System.out.println("\t\t[Invalid input.]\n\t\t[Please try again.]");
				}
			}
			switch(choice) {
			case 1: {
				int id;
				while(true) {
					try {
						System.out.print("\t   Enter ID No. : ");
						String idString = scan.nextLine();
						id = Integer.parseInt(idString);
						break;
					} catch(NumberFormatException e) {
						System.out.println("\t\t[Invalid input.]\n\t\t[Please try again.]");
					}
				}
				for(Student student : students) {
					if(id == student.getId()) {
						System.out.println("\n\tRecord found: ");
						System.out.println("\t\tID	: " + student.getId());
						System.out.println("\t\tName	: " + student.getName());
						System.out.println("\t\tCourse	: " + student.getCourse());
						break;
					} else {
						System.out.println("\n\tNo Records found.");
						System.out.println("\tPress Enter to continue...");
					}
				}
				System.out.println("\n\tPress Enter to continue...");
				scan.nextLine();
			}
			case 2: {
				System.out.print("\t   Enter Last Name: ");
				String lastName = scan.nextLine();
				System.out.println("\n\tRecord found: ");
				for(Student student : students) {
					if(lastName.equalsIgnoreCase(student.getLastName())){
						System.out.println("\t\tID	: " + student.getId());
						System.out.println("\t\tName	: " + student.getName());
						System.out.println("\t\tCourse	: " + student.getCourse());
					} else {
						System.out.println("\n\tNo Records found.");
					}
				}
				System.out.println("\t");
				System.out.println("\tPress Enter to continue...");
				scan.nextLine();
				break;
			}
			default: {
				System.out.println("\t   Invalid choice. Exiting SEARCH Record Menu.\n");
			}
			}
		} else {
			System.out.println("\tNo Records to search.");
			System.out.println("\tPress Enter to continue...");
			scan.nextLine();
		}
	}
	public void deleteRecord() {
		System.out.println("\n\tDELETE Record Menu");
		boolean idFound = false;
		while(!idFound) {
			if(!students.isEmpty()) {
				int id;
				while(true) {
					try {
						System.out.print("\tEnter ID No. to delete a record: ");
						String idString = scan.nextLine();
						id = Integer.parseInt(idString);
						break;
					} catch(NumberFormatException e) {
						System.out.println("\t\t[Invalid input.]\n\t\t[Please try again.]");
					}
				}
				for(Student student : students) {
					if(id == student.getId()) {
						students.remove(student);
						System.out.println("\n\tRecord found: ");
						System.out.println("\t\tID	: " + student.getId());
						System.out.println("\t\tName	: " + student.getName());
						System.out.println("\t\tCourse	: " + student.getCourse());
						System.out.println("\n\tRecord deleted successfully!");
						idFound = true;
						break;
					} else {
						System.out.println("\tID No. not found.");
					}
				}
			} else {
				System.out.println("\tNo Records to delete.");
			}
		}
		System.out.println("\tPress Enter to continue...");
		scan.nextLine();
	}
	public void displayAllRecord() {
		System.out.println("\n\tDISPLAY ALL Record Menu");
		if(!students.isEmpty()) {
			System.out.println("\tRecords found: ");
			for(Student student : students) {
				System.out.println("\t\tID	: " + student.getId());
				System.out.println("\t\tName	: " + student.getName());
				System.out.println("\t\tCourse	: " + student.getCourse());
				System.out.println();
			}
		} else {
			System.out.println("\tNo Records to display.");
		}
		System.out.println("\tPress Enter to continue...");
		scan.nextLine();
	}
}
