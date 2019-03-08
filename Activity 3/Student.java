import java.util.Scanner;

public class Student {

	private int ID_NUMBER;
	private double CREDIT_HOURS_EARNED;
	private double POINTS_EARNED;
	private double GRADE_POINT_AVERAGE;
	private String LETTER_GRADE;

	Scanner sc = new Scanner(System.in);

	public int getIdNumber() {
		return ID_NUMBER;
	}

	public void setIdNumber(int theIDNumber) {
		ID_NUMBER = theIDNumber;
	}

	public double getCreditHours() {
		return CREDIT_HOURS_EARNED;
	}

	public void setCreditHours(double creditHours) {
		CREDIT_HOURS_EARNED = creditHours;
	}

	public double getPointsEarned() {
		return POINTS_EARNED;
	}

	public void setPointsEarned(double noCreditHours) {

		boolean wrongInput;
		do {
			System.out.print("Letter Grade: ");
			LETTER_GRADE = sc.nextLine();

			switch (LETTER_GRADE) {
			case "A":
				POINTS_EARNED = noCreditHours * 4.0;
				wrongInput = false;
				break;
			case "A-":
				POINTS_EARNED = noCreditHours * 3.7;
				wrongInput = false;
				break;
			case "B":
				POINTS_EARNED = noCreditHours * 3;
				wrongInput = false;
				break;
			case "B-":
				POINTS_EARNED = noCreditHours * 2.7;
				wrongInput = false;
				break;
			case "C":
				POINTS_EARNED = noCreditHours * 2.0;
				wrongInput = false;
				break;
			case "C-":
				POINTS_EARNED = noCreditHours * 1.7;
				wrongInput = false;
				break;
			case "D":
				POINTS_EARNED = noCreditHours * 1.0;
				wrongInput = false;
				break;
			case "F":
				POINTS_EARNED = noCreditHours * 0;
				wrongInput = false;
				break;

			default:

				System.out.println("Invalid Input. Please choose the appropriate Letter Grade: " + "A," + " A-," + " B,"
						+ " B-," + " C," + " C-," + " D," + " or F");
				/**
				 * System.out.println("Invalid Input. A = 4.0" + " A- = 3.7" + " B = 3.0" + " B-
				 * = 2.7" + " C = 2.0" + " C- = 1.7" + " D = 1.0" + " F = 0");
				 */
				wrongInput = true;
				break;
			}
		} while (wrongInput == true);

	}

	// pointsEarned=noCreditHours*LetterGrade;

	public double getgradePointAverage() {
		return GRADE_POINT_AVERAGE;
	}

	public void setgradePointAverage(double pointsEarned) {
		GRADE_POINT_AVERAGE = pointsEarned / CREDIT_HOURS_EARNED;
	}

	public double getCreditHoursEarned() {
		// TODO Auto-generated method stub
		return CREDIT_HOURS_EARNED;
	}

}
