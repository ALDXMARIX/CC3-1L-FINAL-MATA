
public class Student {

	private int idNumber;
	private int creditHours;
	private int pointsEarned;
	private int gradePointAverage;

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	public int getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(int noCreditHours) {
		this.pointsEarned = noCreditHours * 4;
	}

	public int getgradePointAverage() {
		return gradePointAverage;
	}

	public void setgradePointAverage(int pointsEarned) {
		this.gradePointAverage = pointsEarned / this.creditHours;
	}

}
