import java.util.Scanner;

public class InformationSystemTester {

	public static void main(String[] args) {
		
		InformationSystem is = new InformationSystem();
		Scanner scan = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("Select options to perform:");
			System.out.println("	[1] - Add Record");
			System.out.println("	[2] - Update Record");
			System.out.println("	[3] - Search Record");
			System.out.println("	[4] - Delete Record");
			System.out.println("	[5] - Display All Record");
			System.out.println("	[6] - Exit");
			while(true) {
				try {
					System.out.print("	Enter your choice: ");
					String choiceString = scan.nextLine();
					choice = Integer.parseInt(choiceString);
					break;
				} catch(NumberFormatException e) {
					System.out.println("\t[  Invalid input. ] \n\t[Please try again.]");
				}
			}
			switch (choice) {
			case 1: {
				is.addRecord();
				break;
			}
			case 2: {
				is.updateRecord();
				break;
			}
			case 3: {
				is.searchRecord();
				break;
			}
			case 4: {
				is.deleteRecord();
				break;
			}
			case 5: {
				is.displayAllRecord();
				break;
			}
			case 6: {
				System.out.println("\n[Information System terminated.]");
				break;
			}
			default: {
				System.out.println("\n\t[  Invalid input. ] \n\t[Please try again.]\n");
			}
			}
			
		} while(choice != 6);

	}

}
