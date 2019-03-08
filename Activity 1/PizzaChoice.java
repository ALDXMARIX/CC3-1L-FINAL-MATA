import javax.swing.JOptionPane;

public class PizzaChoice {

	public static void main(String[] args) {

		String input, size;
		String PizzaChoice;
		String thePrice;
		boolean wrongInput;

		System.out.println("Welcome to PizzaHub");

		do {
			PizzaChoice = (JOptionPane.showInputDialog("Which pizza size do you want "));

			switch (PizzaChoice) {
			case "S":
				wrongInput = false;
				break;
			case "M":
				wrongInput = false;
				break;
			case "L":
				wrongInput = false;
				break;
			case "X":
				wrongInput = false;
				break;
			default:
				JOptionPane.showMessageDialog(null,
						"Invalid Input. S = Small" + " M = Medium" + " L = Large" + " X = Extra Large");
				wrongInput = true;
				break;
			}

		} while (wrongInput == true);

		JOptionPane.showMessageDialog(null, "The price for the pizza is " + getPizzaPrice(PizzaChoice));

	}

	public static String getPizzaPrice(String size) {
		String thePrice = "";
		String PizzaSize[] = { "S", "M", "L", "X" };
		String prices[] = { "$6.99", "$8.99", "$12.50", "$15.00" };

		for (int i = 0; i < PizzaSize.length; i++) {
			if (size.equals(PizzaSize[i])) {
				thePrice = prices[i];
			}
		}
		return thePrice;

	}

}
