
public class Wizard extends Character implements Weapon, Armor {

	public Wizard(String n, int s, int d, int i) {

		super(n, s, d, i);
		this.currentMagic = this.getIntelligence() * 2;
		if (this.currentMagic < 5) {
			this.currentMagic = minMagic;
		}
		this.isWizard = true;
	}

	/** magic damage resistance affected by strength */
	int castLightningBolt(int opponentStrength) {
		if (this.currentMagic >= 5) {
			this.currentMagic -= 5;
			int lightningBoltDamage = 2 + dice.roll(3) * (((this.getIntelligence() * 15) % 10) % opponentStrength);
			return lightningBoltDamage;
		} else {
			return 0;
		}
	}

	/**
	 * Returns maxmagic
	 */
	public int getMaxMagic() {
		return maxMagic;
	}

	/**
	 * Returns currentmagic
	 */
	public int getCurrentMagic() {
		return currentMagic;
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
		int damage = ((dice.roll(2) * this.getIntelligence() * this.getDexterity() * 2) / (opponentarmor * 2));
		return damage;

	}

}
