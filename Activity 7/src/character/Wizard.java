package character;

import item.Armor;
import item.Weapon;

/**
 * The Wizard character inherits general attributes from Character Class. An
 * instance of this character type should be instantiated with high intelligence
 */

public class Wizard extends Character implements Weapon, Armor {

	/**
	 * The Wizard constructor uses the constructor from super Class and also sets
	 * its CurrentMagic which is influenced by the instance' intelligence
	 */

	public Wizard(String n, int s, int d, int i) {

		super(n, s, d, i);
		this.setCurrentMagic(this.getIntelligence() * 2);
		if (this.getCurrentMagic() < 5) {
			this.setCurrentMagic(minMagic);
		}
		this.isWizard = true;
	}

	/**
	 * @castLightningBolt cast a lightning bolt that strucks opponets with magic
	 *                    damage. Magic damage dealt affected by opponent strength.
	 * @opponentStrength strength type characters have stronger resistance to magic
	 */

	public int castLightningBolt(int opponentStrength) {
		if (this.getCurrentMagic() >= 5) {
			this.setCurrentMagic(this.getCurrentMagic() - 5);
			int lightningBoltDamage = 2 + dice.roll(3) * (((this.getIntelligence() * 15) % 10) % opponentStrength);
			return lightningBoltDamage;
		} else {
			return 0;
		}
	}

	/**
	 * @userArmor Returns armor attribute of a an instance of this class to be a
	 *            factor in computing defence against attacks
	 */
	public int useArmor() {
		// TODO Auto-generated method stub
		return getArmor();
	}

	/**
	 * @useWeapon Models a weapon which can be used to increase physical attacks.
	 *            The Weapon efficiency is affected by the strength of the character
	 */
	public int useWeapon() {
		// TODO Auto-generated method stub
		int damageIncrease = ((dice.roll(2) * this.getStrength() / 3));
		return damageIncrease;
	}

	/**
	 * This method allows the character to attack opponents. Damage is affected by
	 * primary attribute and opponets armor which is passed on as argument
	 */

	public int attack(int opponentarmor) {
		// TODO Auto-generated method stub
		int damage = ((dice.roll(2) * this.getIntelligence() * this.getDexterity() * 2) / (opponentarmor * 2));
		return damage;

	}

}
