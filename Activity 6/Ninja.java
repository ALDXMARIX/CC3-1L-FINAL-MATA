
public class Ninja extends Character implements Weapon, Armor {

	public Ninja(String n, int s, int d, int i) {

		super(n, s, d, i);
		this.currentMagic = this.getIntelligence() * 2;
		if (this.currentMagic < 5) {
			this.currentMagic = 5;
		}
		this.isNinja = true;

	}

	public int blinkStrike(int opponentArmor) {
		if (this.currentMagic >= 5) {
			this.currentMagic -= 5;
			int blinkStrikeDamage = 2 + dice.roll(3) * (((1 + this.getDexterity() * 10) % 10) % opponentArmor);
			return blinkStrikeDamage;
		} else {
			return 0;
		}
	}

	/**
	 * Returns maxmagic
	 */
	public int getMaxMagic() {
		return this.getMaxMagic();
	}

	/**
	 * Returns currentmagic
	 */
	public int getCurrentMagic() {
		return this.currentMagic;
	}

	@Override
	public int useArmor() {
		// TODO Auto-generated method stub
		return getArmor();
	}

	@Override
	public int useWeapon() {
		// TODO Auto-generated method stub
		int damageIncrease = ((dice.roll(2) * this.getStrength() / 3));
		return damageIncrease;
	}

	@Override
	public int attack(int opponentarmor) {
		// TODO Auto-generated method stub
		int damage = ((dice.roll(2) * this.getDexterity() * this.getDexterity() * 2) / (opponentarmor * 2));
		return damage;
	}

}
