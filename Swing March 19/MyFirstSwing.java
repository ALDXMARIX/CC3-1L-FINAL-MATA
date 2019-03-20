import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstSwing {

	public static void main(String args[]) {

		JFrame aFrame = new JFrame();

		JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11,
				button12;

		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button10 = new JButton("10");
		button11 = new JButton("11");
		button12 = new JButton("12");

		aFrame.setSize(300, 300);
		aFrame.setVisible(true);
		aFrame.setTitle("Buttons");
		aFrame.setResizable(true);

		aFrame.add(button1);
		aFrame.add(button2);
		aFrame.add(button3);
		aFrame.add(button4);
		aFrame.add(button5);
		aFrame.add(button6);
		aFrame.add(button7);
		aFrame.add(button8);
		aFrame.add(button9);
		aFrame.add(button10);
		aFrame.add(button11);
		aFrame.add(button12);

		aFrame.setLayout(new GridLayout(5, 20));
		// aFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

		// aFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

	}
}
