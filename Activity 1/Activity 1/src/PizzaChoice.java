import javax.swing.JOptionPane;

public class PizzaChoice {

	String input, size;
	static String PizzaChoice;
	static String thePrice;
	private static boolean wrongInput;

	public static void main(String[] args) {

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
