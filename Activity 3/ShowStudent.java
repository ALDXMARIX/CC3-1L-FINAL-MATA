public class ShowStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student();

		student1.setIdNumber(1001);
		student1.setCreditHours(10);
		student1.setPointsEarned(student1.getCreditHours());
		student1.setgradePointAverage(student1.getPointsEarned());

		System.out.println("Student ID Number: " + student1.getIdNumber());
		System.out.println("Credit Hours: " + student1.getCreditHours());
		System.out.println("Points Earned: " + student1.getPointsEarned());
		System.out.println("Grade Point Average: " + student1.getgradePointAverage());

	}

}
