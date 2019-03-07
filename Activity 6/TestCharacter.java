public class TestCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int round = 1;
		int currentHealth = 0, currentHealth2;

		Character character1 = new Character("Joe", 2, 3, 4);
		Character character2 = new Character("Bob", 3, 2, 2);

		do {
			System.out.println("Round: " + round);
			System.out.println(character1.getName() + ": " + character1.getCurrentLife());
			System.out.println(character2.getName() + ": " + character2.getCurrentLife());
			currentHealth = character1.getCurrentLife();

			currentHealth2 = character2.getCurrentLife();
			character2.wound(character1.attack(character2.getIntelligence()));
			character1.wound(character2.attack(character1.getIntelligence()));
			int damagetoChar1 = currentHealth - character1.getCurrentLife();
			int damagetoChar2 = currentHealth2 - character2.getCurrentLife();
			System.out.println(character1.getName() + " attacks " + character2.getName() + " for " + damagetoChar2);
			System.out.println(character2.getName() + " attacks " + character1.getName() + " for " + damagetoChar1);
			round++;
		} while (character1.getCurrentLife() > 0 && character2.getCurrentLife() > 0);

		if (character1.getCurrentLife() <= 0 && character2.getCurrentLife() > 0) {
			System.out.println("The winner is: " + character2.getName());
		} else if (character2.getCurrentLife() <= 0 && character1.getCurrentLife() > 0) {
			System.out.println("The winner is: " + character1.getName());
		} else if (character1.getCurrentLife() <= 0 && character2.getCurrentLife() <= 0) {
			System.out.println("Both players were knocked out!\nIt is a draw there are no winners");
		}
	}

}
