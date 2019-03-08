import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hourly pay rate: ");
		double hourlyRate = sc.nextDouble();

		System.out.println("Enter regular hours of work: ");
		double regularHours = sc.nextDouble();

		System.out.println("Enter overtime hours: ");
		double overtimeHours = sc.nextDouble();

		System.out.println("Normal Salary: " + hourlyRate * regularHours);
		double overtimeSalary = calculateOvertimePay(hourlyRate, regularHours, overtimeHours)
				- hourlyRate * regularHours;
		System.out.println("Overtime Pay: " + overtimeSalary);
		System.out.println("Total Salary: " + calculateOvertimePay(hourlyRate, regularHours, overtimeHours));

	}

	static double calculateOvertimePay(double hourlyRate, double regularHours, double overtimeHours) {

		return (regularHours * hourlyRate + (overtimeHours * (1.5 * regularHours)));
	}

}