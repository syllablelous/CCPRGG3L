import java.util.Scanner;

public class BookRental {
	String[] books = {"System Analysis and Design", "Android Application", "Programming Concepts and Application"};
	String[] authors = {"Paul Anthers", "Mia B. Anderson", "Wesley Gibbins"};
	String[] pub_year = {"2010", "2016", "1998"};
	int[] copies = {2, 3, 4};
	int choice;
	boolean renting = true;
	Scanner sc = new Scanner(System.in);
	
	public void rentBook() {
		
		System.out.print("Choose the number of the book you wish to rent: ");		
		choice = sc.nextInt();
		
		sc.nextLine();

		try {
			if(copies[choice] == 0) {
				System.out.println("There are no more copies of your chosen book.");
				rentCheck();
			}
			
		
			while (renting) {
				System.out.println("\nYou have chosen to rent the book " + books[choice] +"\n");
				copies[choice] -= 1;
				rentCheck();
			}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Inputted number does not exist in the list.");
			rentCheck();
		}
	}
	
	
	public void rentCheck() {
		System.out.print("Do you wish to rent another book? Y/N ");
		char rent_again = sc.nextLine().toUpperCase().charAt(0);
		
		if (rent_again == 'Y') {
			rentBook();
		}
		else{
			renting = false;
		}
		
	}
}

