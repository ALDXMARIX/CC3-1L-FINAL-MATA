package Act2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleEmployee {

	final static int fixedSalary = 1500;
	final static double bonusRate = .085;
	private String name;
	private String classification;
	protected double weeklyGross;

	public void setName(String empName) {
		this.name = empName;
	}

	public void setWeeklyGross(double grossForWeek) {
		this.weeklyGross = grossForWeek;
	}

	public void setClassification(String classif) {
		this.classification = classif;
	}

	public int getFixedSalary() {
		return fixedSalary;
	}

	public static double getBonusrate() {
		return bonusRate;
	}

	public String getName() {
		return name;
	}

	public String getClassification() {
		return classification;
	}

	public double getWeeklyGross() {
		return weeklyGross;
	}

	public SimpleEmployee() {

		System.out.print("Enter Name:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader rtdInput = new BufferedReader(isr);

		String temp = null;
		try {
			temp = rtdInput.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setName(temp);
		System.out.print("Enter Weekly Gross:");
		BufferedReader br/* identifier */ = new BufferedReader(new InputStreamReader(System.in));
		try {
			temp = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		double weeklyGross = Double.parseDouble(temp);
		setWeeklyGross(weeklyGross);

	}
}
