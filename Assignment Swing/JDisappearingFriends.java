package cc3.mar14.lectureActivity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JDisappearingFriends {

	static JButton button, button2;
	static JFrame frame;
	static JLabel label1, label2, label3, label4, label5;
	static int counter = 5;

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello");
		frame.setVisible(true);
		frame.setLayout(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(0, 0);
		frame.setSize(250, 200);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Press");
		frame.add(button);

		button2 = new JButton("Press2");
		frame.add(button2);

		button.setLocation(60, 30);
		button.setSize(100, 50);
		button.setEnabled(false);

		// button.setEnabled(false);

		label1 = new JLabel("1. John");
		label2 = new JLabel("2. Mike");
		label3 = new JLabel("3. Andrea");
		label4 = new JLabel("4. Mark");
		label5 = new JLabel("5. Sam");

		label1.setLocation(65, 70);
		label1.setSize(100, 50);
		label2.setLocation(65, 80);
		label2.setSize(100, 50);
		label3.setLocation(65, 90);
		label3.setSize(100, 50);
		label4.setLocation(65, 100);
		label4.setSize(100, 50);
		label5.setLocation(65, 110);
		label5.setSize(100, 50);

		label1.setVisible(true);
		label2.setVisible(true);
		label3.setVisible(true);
		label4.setVisible(true);
		label5.setVisible(true);

		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);

		button.addActionListener(new Action());

	}

	static class Action implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			counter--;
			if (counter == 4) {
				label1.setVisible(false);
			} else if (counter == 3) {
				label2.setVisible(false);
			} else if (counter == 2) {
				label3.setVisible(false);
			} else if (counter == 1) {
				label4.setVisible(false);
			} else if (counter == 0) {
				label5.setVisible(false);
				button.setEnabled(false);
			} else
				button.setEnabled(false);
		}

	}
}
