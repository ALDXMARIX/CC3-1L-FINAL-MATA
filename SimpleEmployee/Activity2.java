package Act2;

import java.text.DecimalFormat;

public class Activity2 {

	public static void main(String[] args) {

		SimpleEmployee employee1 = new SimpleEmployee();
		Calculate calculator1 = new Calculate();
		calculator1.netWeekly(employee1.weeklyGross);
		employee1.setClassification(calculator1.classify(calculator1.netWeekly(employee1.weeklyGross)));

		DecimalFormat df = new DecimalFormat("00.00");

		System.out.println("*****Snow Enterprises*****");
		System.out.println("Employee Name:" + employee1.getName());
		System.out.println("Gross Salary:" + df.format((employee1.getWeeklyGross())));
		System.out.println("Bonus:" + df.format(employee1.getWeeklyGross() * SimpleEmployee.getBonusrate()));
		System.out.println("Net Weekly Salary:" + df.format(calculator1.netWeeklySalary));
		System.out.println("Classification: " + employee1.getClassification());

	}

}
