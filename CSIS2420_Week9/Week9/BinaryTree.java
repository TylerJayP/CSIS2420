package Week9;

import java.io.IOException;
import java.util.Scanner;

public class BinaryTree {

	public static void main(String[] args) throws IOException {
		
		Node newNode = new Node();

		Scanner again = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
	
		menu();
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			
			newNode.buildUsersTree();
			
		}else if (choice == 2) {
			
			System.out.print("Search IP: ");
			int ipSearch= sc.nextInt();
			newNode.searchByIP(ipSearch);
			
		}else if (choice == 3) {
			
			System.out.print("Search Username: ");
			String un = again.nextLine();
			newNode.searchByName(un);
			
		}else if(choice == 4) {
			
			System.out.println(newNode.size());
			
		}else if(choice == 5) {
			
			newNode.printTree();
			
		}else if(choice == 6) {
			
			System.exit(0);
			
		}else {
			
			System.out.println("Number doesn't exist within the main menu...");
			
		}
		
		System.out.print("Go back to main menu? 'Y' for yes, 'N' for no: ");
		String againOrNot = again.nextLine();
		
		if(againOrNot.toUpperCase().equals("N")) break;
		
	}
	
}
	
	private static void menu() {
		
		
		System.out.println("-------------------------");
		System.out.println("1: Build Users Tree");
		System.out.println("2: Find by IP Address");
		System.out.println("3: Find by Username");
		System.out.println("4: Report Number of Nodes");
		System.out.println("5: Print Entire Tree");
		System.out.println("6: Exit");
		System.out.println("-------------------------");
		System.out.print("Enter 1, 2, 3, 4, 5 or 6: ");
		
	}
	
}
