import java.util.Scanner;


public class TicketNumbers {

	public static void main(String[] args) {
		int ticketNumber, stem, checkDigit;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a six-digit ticket number: ");
		ticketNumber = sc.nextInt();
		stem = ticketNumber / 10;
		checkDigit = ticketNumber % 10;
		
		if (checkDigit == stem % 7) {
			System.out.println("That is a valid ticket number, well done!");
		} else {
			System.out.println("That is not a valid ticket number!");
		}
	
	}

}

