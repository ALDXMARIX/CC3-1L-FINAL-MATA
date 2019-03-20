import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame aFrame = new JFrame("Hello");

		aFrame.setDefaultLookAndFeelDecorated(true);
		aFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		aFrame.setSize(800, 800);
		aFrame.setVisible(true);
		aFrame.setTitle("My Frame");
		aFrame.setResizable(true);

		Font headlineFont = new Font("Arial", Font.BOLD, 20);
		Font headlineFont2 = new Font("Arial", Font.BOLD, 20);
		Font headlineFont3 = new Font("Arial", Font.BOLD, 20);

		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel greeting = new JLabel("Good day!");
		JLabel school = new JLabel("University of the Cordilleras!");
		JLabel department = new JLabel("College of Information Technology and Computer Science");

		greeting.setFont(headlineFont);
		school.setFont(headlineFont2);
		department.setFont(headlineFont3);

		aFrame.add(greeting);
		aFrame.add(school);
		aFrame.add(department);

		JTextField firstName = new JTextField("First Name:");
		JTextField middleName = new JTextField("Middle Name: ");
		JTextField lastName = new JTextField("Last Name:");
		JTextField course = new JTextField("Course: ");
		JTextField year = new JTextField("Year: ");

		firstName.setVisible(true);
		middleName.setVisible(true);
		lastName.setVisible(true);
		course.setVisible(true);
		year.setVisible(true);

		aFrame.add(firstName);
		aFrame.add(middleName);
		aFrame.add(lastName);
		aFrame.add(course);
		aFrame.add(year);

	}

}
