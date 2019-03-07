public class CharacterDuel {

	private static int dmg1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int round = 1;
		int currentHealth = 0, currentHealth2 = 0;

		Character character1 = new Ninja("Naruto", 4, 7, 3);
		Character character2 = new Wizard("Gandalf", 3, 3, 7);

		do {
			System.out.println("Round: " + round);
			System.out.println(character1.getName() + ": " + character1.getCurrentLife());
			System.out.println(character2.getName() + ": " + character2.getCurrentLife());
			System.out.println("Magic Points " + character1.getName() + ": " + character1.getCurrentMagic());
			System.out.println("Magic Points " + character2.getName() + ": " + character2.getCurrentLife());

			currentHealth = character1.getCurrentLife();
			currentHealth2 = character2.getCurrentLife();

			if (character1.isWizard() == true) {
				if (character1.getCurrentMagic() >= 5) {

					dmg1 = ((Wizard) character1).castLightningBolt(character2.getStrength());
					character2.wound(dmg1);
					System.out.println(character1.getName() + " casts a lightning bolt to " + character2.getName()
							+ " for " + dmg1 + " magic damage.");
				} else if (character1.getCurrentMagic() < 5) {
					dmg1 = ((Wizard) character1).useWeapon();
					character2.wound(dmg1);
					System.out.println(character1.getName() + " uses sword to attack " + character2.getName() + " for "
							+ dmg1 + " physical damage.");
				}
			} else if (character1.isNinja() == true) {
				if (character1.getCurrentMagic() >= 5) {

					dmg1 = ((Ninja) character1).blinkStrike(character2.getArmor());
					character2.wound(dmg1);
					System.out.println(character1.getName() + " attacks with a speedy blinkstrike to "
							+ character2.getName() + " for " + dmg1 + " physical damage.");
				} else if (character1.getCurrentMagic() < 5) {
					dmg1 = ((Ninja) character1).useWeapon();
					character2.wound(dmg1);
					System.out.println(character1.getName() + " uses sword to attack " + character2.getName() + " for "
							+ dmg1 + " physical damage.");
				}
			}

			if (character2.isWizard() == true) {
				if (character2.getCurrentMagic() >= 5) {

					dmg1 = ((Wizard) character2).castLightningBolt(character1.getStrength());
					character1.wound(dmg1);
					System.out.println(character2.getName() + " casts a lightning bolt to " + character1.getName()
							+ " for " + dmg1 + " magic damage.");
				} else if (character2.getCurrentMagic() < 5) {
					dmg1 = ((Wizard) character2).useWeapon();
					character1.wound(dmg1);
					System.out.println(character2.getName() + " uses sword to attack " + character1.getName() + " for "
							+ dmg1 + " physical damage.");
				}
			} else if (character2.isNinja() == true) {
				if (character2.getCurrentMagic() >= 5) {

					dmg1 = ((Ninja) character2).blinkStrike(character1.getArmor());
					character1.wound(dmg1);
					System.out.println(character2.getName() + " attacks with a speedy blinkstrike to "
							+ character1.getName() + "for" + dmg1 + " physical damage.");
				} else if (character2.getCurrentMagic() < 5) {
					dmg1 = ((Ninja) character2).useWeapon();
					character1.wound(dmg1);
					System.out.println(character2.getName() + " uses sword to attack " + character1.getName() + " for "
							+ dmg1 + " physical damage.");
				}
			}

			/*
			 * character2.wound(dmg1+character1.attack(character2.getArmor()));
			 * character1.wound(character2.attack(character1.getArmor()));
			 * 
			 * int damagetoChar1 = currentHealth - character1.getCurrentLife(); int
			 * damagetoChar2 = currentHealth2 - character2.getCurrentLife();
			 * 
			 * System.out.println(character1.getName() + "attacks" + character2.getName() +
			 * " for " + damagetoChar2); System.out.println(character2.getName() + "attacks"
			 * + character1.getName() + " for " + damagetoChar1); /*
			 * 
			 * /* character2.heal(); character1.heal();
			 * 
			 * int restoredHealthToChar1 = currentHealth - character1.getCurrentLife(); int
			 * restoredHealthToChar2 = currentHealth2 - character2.getCurrentLife();
			 * 
			 * // create checkhealth method here if life is lower than 25% and output the
			 * heal // turn and the currentlife String typeOfAttack = "";
			 * 
			 * // need to implement heal if statement that checks the hp of characters
			 */
			if (character1.getCurrentLife() < character1.getMaxLife() / 3) {
				character1.castHeal();
			} else if (character2.getCurrentLife() < character2.getMaxLife() / 3) {
				character2.castHeal();
			}
			round++;
			character1.currentMagic++;
			character2.currentMagic++;

		} while (character1.getCurrentLife() > 0 && character2.getCurrentLife() > 0);

		if (character1.getCurrentLife() <= 0 && character2.getCurrentLife() > 0)

		{
			System.out.println("The winner is: " + character2.getName());
		} else if (character2.getCurrentLife() <= 0 && character1.getCurrentLife() > 0) {
			System.out.println("The winner is: " + character1.getName());
		} else if (character1.getCurrentLife() <= 0 && character2.getCurrentLife() <= 0) {
			System.out.println("Both players were knocked out!\nIt is a draw there are no winners");
		}
	}

}
