import java.util.Scanner;

public class ShowStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		Student student1 = new Student();

		System.out.print("Student ID Number: ");
		int ID_NUM = sc.nextInt();

		System.out.print("Credit hours earned: ");
		double CREDIT_HOURS = sc.nextDouble();

		student1.setIdNumber(ID_NUM);
		student1.setCreditHours(CREDIT_HOURS);
		student1.setPointsEarned(student1.getCreditHours());
		student1.setgradePointAverage(student1.getPointsEarned());

		System.out.println("Student ID Number: " + student1.getIdNumber());
		System.out.println("Credit Hours: " + student1.getCreditHours());
		System.out.println("Points Earned: " + student1.getPointsEarned());
		System.out.println("Grade Point Average: " + student1.getgradePointAverage());

	}

}
