package Act1;

import java.util.Scanner;

public class SeatReservation {

	private static String[][] seatsBooked;
	private static int row;
	private static int column;
	private static int i;
	private static int j;

	public static void main(String[] args) {

		seatsBooked = new String[13][6];

		int option;
		row = 0;
		column = 0;

		boolean again = false;
		int ans = 0;

		do {
			System.out.println("Seat Reservation Program: ");
			System.out.println("* = Available Seats \nX = Booked Seats");
			printSeatPlan();
			System.out.print("[1]First Class\n[2]Business Class\n[3]Economy Class\n");
			Scanner s = new Scanner(System.in);
			option = s.nextInt();

			switch (option) {
			case (1):
				do {
					System.out.println("Enter Row. First Class seats are at [1-3] only");
					row = s.nextInt();
				} while (row < 1 || row > 3);
				do {
					System.out.println("Enter Column[1-6] only");
					column = s.nextInt();
				} while (column < 1 || column > 6);
				break;
			case (2):
				do {
					System.out.println("Enter Row. Business Class seats are at [4-8] only");
					row = s.nextInt();
				} while (row < 4 || row > 8);
				do {
					System.out.println("Enter Column[1-6] only");
					column = s.nextInt();
				} while (column < 1 || column > 6);
				break;

			case (3):
				do {
					System.out.println("Enter Row. Economy Class seats are at [9-13] only");
					row = s.nextInt();
				} while (row < 9 || row > 13);
				do {
					System.out.println("Enter Column[1-6] only");
					column = s.nextInt();
				} while (column < 1 || column > 6);
				break;
			default:
				break;
			}
			checkSeats();
			seatsBooked[row - 1][column - 1] = "X";
			System.out.println("Booked Seat below: ");
			printSeatPlan();

			System.out.println("Do you want to try again?[1.Yes][2.No]");

			try {
				ans = s.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			/**
			 * switch (ans) { case "y": again = true; break; case "Y": again = true; break;
			 * case "n": again = false; exit = 2; System.out.println("Goodbye!");
			 * System.exit(exit); case "N": again = false; exit = 2;
			 * System.out.println("Goodbye!"); System.exit(exit); default:
			 * System.out.println("Wrong input! Please choose either option 1 or 2"); again
			 * = true; }
			 **/

			switch (ans) {
			case 1:
				again = true;
				break;
			case 2:
				again = false;
				System.out.println("Thank you valued customer.Goodbye!");
				System.exit(ans);
			default:
				System.out.println("Wrong input! Please choose either option 1 or 2");
			}

		} while (again == true);

	}

	private static void printSeatPlan() {
		// print table in matrix format
		for (i = 0; i < 13; i++) {

			for (j = 0; j < 6; j++) {
				if (seatsBooked[i][j] == null) {
					seatsBooked[i][j] = "*";
				}
				System.out.print(seatsBooked[i][j] + "");
			}
			System.out.println();
		}
	}

	private static void checkSeats() {
		if (seatsBooked[row - 1][column - 1] == "X") {
			System.out.println("Sorry seat is already taken");
		}

	}

}
