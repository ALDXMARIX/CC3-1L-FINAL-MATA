package cc3.mar14.lectureActivity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameDisableButton2 {

	static JButton button;
	static JFrame frame;
	static JLabel label;
	static int counter = 0;

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello");
		frame.setVisible(true);
		frame.setLayout(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(0, 0);
		frame.setSize(250, 150);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Press");
		frame.add(button);

		button.setLocation(60, 30);
		button.setSize(100, 50);
		button.setEnabled(true);

		// button.setEnabled(false);

		button.addActionListener(new Action());
		label = new JLabel("That's enough!");
		label.setLocation(65, 70);
		label.setSize(100, 50);
		label.setVisible(false);
		frame.add(label);

	}

	static class Action implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			counter++;
			if (counter == 8) {
				label.setVisible(true);
				button.setEnabled(false);

			}

		}
	}
}
