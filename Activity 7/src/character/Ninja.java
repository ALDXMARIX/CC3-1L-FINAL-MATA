package character;

import item.Armor;
import item.Weapon;

/**
 * The Ninja character inherits general attributes from Character Class.
 * Remember, an instance of this chracter type should be instantiated with high
 * dexterity
 */

public class Ninja extends Character implements Weapon, Armor {

	/**
	 * The Ninja constructor uses the constructor from super Class and also sets its
	 * CurrentMagic which is influenced by the instance' intelligence
	 */

	public Ninja(String n, int s, int d, int i) {

		super(n, s, d, i);
		this.setCurrentMagic(this.getIntelligence() * 2);
		if (this.getCurrentMagic() < 5) {
			this.setCurrentMagic(5);
		}
		this.isNinja = true;
	}

	/**
	 * A ninja character has a unique skill blinkStrike which is affected which is
	 * influenced by the instance' intelligence
	 */
	public int blinkStrike(int opponentArmor) {
		if (this.getCurrentMagic() >= 5) {
			this.setCurrentMagic(this.getCurrentMagic() - 5);
			int blinkStrikeDamage = 2 + dice.roll(3) * (((1 + this.getDexterity() * 10) % 10) % opponentArmor);
			return blinkStrikeDamage;
		} else {
			return 0;
		}
	}

	/**
	 * Returns armor attribute of a an instance of this class to be a factor in
	 * computing defence against attacks
	 */
	@Override
	public int useArmor() {
		// TODO Auto-generated method stub
		return getArmor();
	}

	/**
	 * Models a weapon which can be used to increase physical attacks. The Weapon
	 * efficiency is affected by the strength of the character
	 */
	@Override
	public int useWeapon() {
		// TODO Auto-generated method stub
		int damageIncrease = ((dice.roll(2) * this.getStrength() / 3));
		return damageIncrease;
	}

	/**
	 * This method allows the character to attack opponents. Damage is affected by
	 * primary attribute and opponets armor which is passed on as argument
	 */
	@Override
	public int attack(int opponentarmor) {
		// TODO Auto-generated method stub
		int damage = ((dice.roll(2) * this.getDexterity() * this.getDexterity() * 2) / (opponentarmor * 2));
		return damage;
	}

}
