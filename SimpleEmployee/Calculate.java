package Act2;

public class Calculate {

	String input, classification;
	double x, y, netWeeklySalary, weeklySales;

	public double netWeekly(double weeklyGross) {
		netWeeklySalary = SimpleEmployee.bonusRate * weeklyGross + SimpleEmployee.fixedSalary;
		return netWeeklySalary;
	}

	public String classify(double netforWeek) {
		String classi[] = { "A", "B", "C", "D", "E", "F" };
		int comp[] = { 1500, 2000, 2500, 3000, 3500, 4000, 99999999 };
		for (int i = 0; i < classi.length; i++) {
			if (netforWeek >= comp[i] && netforWeek < comp[i + 1]) {
				return classi[i];
			}
		}
		return null;
	}

}
