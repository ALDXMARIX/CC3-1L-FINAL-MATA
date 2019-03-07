
public class Ninja extends Character {

	private int maxmagic, currentmagic;

	public Ninja(String n, int s, int d, int i) {

		super(n, s, d, i);
		this.maxmagic = 20;
		this.currentmagic = this.getIntelligence() * 2;

	}

	private int blinkStrike() {
		if (this.currentmagic >= 5) {
			this.currentmagic -= 5;
			int blinkStrikeDamage = dice.roll(2) * (this.getDexterity() * 2);
			return currentmagic;
		} else {
			return 0;
		}
	}

	/**
	 * Returns maxmagic
	 */
	public int getMaxMagic() {
		return maxmagic;
	}

	/**
	 * Returns currentmagic
	 */
	public int getCurrentMagic() {
		return currentmagic;
	}

}
