package cc3.mar14.lectureActivity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JVacationRental {

	static JButton button, button2, button3, button4, button5, button6, button7, button8;
	static JFrame frame;
	static JLabel label, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11,
			label12;

	static JPanel panel;

	static int counter = 5;

	static int availableBedCounter = 5;
	static int bedCounter = 0;

	static int myLocationCost = 0;
	static int myAdditionalBedroomCost = 0;
	static int myMealCost = 0;
	static int mytotalCost = 0;

	static int myBedroom = 0;
	static String myLocation = "", myMeal = "";

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello");
		frame.setVisible(true);
		frame.setLayout(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(250, 250);
		frame.setSize(650, 650);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Parkside");
		button2 = new JButton("Poolside");
		button3 = new JButton("Lakeside");

		button4 = new JButton("Yes");
		button5 = new JButton("No");

		button6 = new JButton("Yes");
		button7 = new JButton("No");

		button8 = new JButton("Show Totals");

		// button group for locations
		button.setLocation(60, 170);
		button.setSize(100, 50);
		button2.setLocation(60, 250);
		button2.setSize(100, 50);
		button3.setLocation(60, 330);
		button3.setSize(100, 50);

		// button group for bedroom selection
		button4.setLocation(230, 170);
		button4.setSize(100, 50);
		button5.setLocation(230, 250);
		button5.setSize(100, 50);

		// button group for additional meal query selection
		button6.setLocation(410, 170);
		button6.setSize(100, 50);
		button7.setLocation(410, 250);
		button7.setSize(100, 50);

		// button group to show totals
		button8.setLocation(380, 440);
		button8.setSize(150, 50);

		// button group for locations
		button.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);

		// button group for bedroom selection
		button4.setEnabled(true);
		button5.setEnabled(true);

		// button group for Additional meal
		button6.setEnabled(true);
		button7.setEnabled(true);

		// button group to show customer totals
		button8.setEnabled(true);

		label = new JLabel("Choose your vacation plan");
		label1 = new JLabel("Select Location");
		label2 = new JLabel("Add additional bed?");
		label3 = new JLabel("Current Available: " + availableBedCounter);
		label4 = new JLabel("Add Meals?");

		label.setLocation(65, 0);
		label.setSize(150, 100);
		label1.setLocation(65, 70);
		label1.setSize(100, 50);
		label2.setLocation(230, 70);
		label2.setSize(270, 50);
		label3.setLocation(230, 100);
		label3.setSize(270, 50);
		label4.setLocation(430, 70);
		label4.setSize(270, 50);

		label.setVisible(true);
		label1.setVisible(true);
		label2.setVisible(true);
		label3.setVisible(true);
		label4.setVisible(true);

		frame.add(label);
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);

		frame.add(button);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);

		panel = new JPanel();
		frame.add(panel);
		panel.setLocation(180, 330);
		panel.setVisible(true);
		panel.setSize(200, 200);
		panel.setEnabled(true);

		button.addActionListener(new LocationPlanParkside());
		button2.addActionListener(new LocationPlanParkside());
		button3.addActionListener(new LocationPlanParkside());

		button4.addActionListener(new BedroomPlanYes());
		button5.addActionListener(new BedroomPlanNo());

		button6.addActionListener(new MealPlanYes());
		button7.addActionListener(new MealPlanNo());

		button8.addActionListener(new ShowTotals());

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

	static class LocationPlanParkside implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			myBedroom = 1;
			myLocationCost = 600;
			button.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
			myLocation = "Parkside";
			mytotalCost = mytotalCost + myLocationCost;
		}

	}

	static class LocationPlanPoolside implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			myBedroom = 2;
			myLocationCost = 750;
			button.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
			myLocation = "Poolside";
			mytotalCost = mytotalCost + myLocationCost;
		}

	}

	static class LocationPlanLakeside implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			button.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
			myBedroom = 3;
			myLocationCost = 825;
			myLocation = "Lakeside";
			mytotalCost = mytotalCost + myLocationCost;
		}

	}

	static class BedroomPlanYes implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			myBedroom = myBedroom + 1;
			myAdditionalBedroomCost = myAdditionalBedroomCost + 75;
			mytotalCost = mytotalCost + myAdditionalBedroomCost;
			availableBedCounter--;
			if (availableBedCounter == 0) {
				button4.setEnabled(false);
			}
		}

	}

	static class BedroomPlanNo implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			button5.setEnabled(false);
		}

	}

	static class MealPlanYes implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			myMeal = "Yes";
			myMealCost = 200;
			mytotalCost = mytotalCost + myMealCost;
			button6.setEnabled(false);
		}

	}

	static class MealPlanNo implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			button7.setEnabled(false);
		}

	}

	static class ShowTotals implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			label5 = new JLabel("Your Plan Totals: ");
			label6 = new JLabel("Location Cost: " + myLocationCost);
			label7 = new JLabel("Additional Bedroom Cost: " + myAdditionalBedroomCost);
			label8 = new JLabel("Meal Cost: " + myMealCost);
			label9 = new JLabel("Total Cost: " + mytotalCost);

			label10 = new JLabel("Location: " + myLocation);
			label11 = new JLabel("Bedrooms availed: " + myBedroom);
			label12 = new JLabel("Meal inclusive: " + myMeal);

			panel.add(label5);
			panel.add(label6);
			panel.add(label7);
			panel.add(label8);
			panel.add(label9);
			panel.add(label10);
			panel.add(label11);
			panel.add(label12);

			label5.setVisible(true);
			label6.setVisible(true);
			label7.setVisible(true);
			label8.setVisible(true);
			label9.setVisible(true);
			label10.setVisible(true);
			label11.setVisible(true);
			label12.setVisible(true);

			button8.setEnabled(false);

		}

	}

}
