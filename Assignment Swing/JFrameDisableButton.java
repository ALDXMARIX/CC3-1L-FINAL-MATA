package cc3.mar14.lectureActivity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameDisableButton {

	static JButton button;
	static JFrame frame;

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

		button.addActionListener(new Action());

	}

	static class Action implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			button.setEnabled(false);

		}
	}
}
