
public class Wizard extends Character {

	private int maxmagic, currentmagic;

	public Wizard(String n, int s, int d, int i) {

		super(n, s, d, i);
		this.maxmagic = 20;
		this.currentmagic = this.getIntelligence() * 2;

	}

	private int castLightningBolt() {
		if (this.currentmagic >= 5) {
			this.currentmagic -= 5;
			int magicdamage = dice.roll(2) * ((this.getIntelligence() * 13) % 10);
			return currentmagic;
		} else {
			return 0;
		}
	}

	private int castHeal() {
		if (this.currentmagic >= 8) {
			this.heal((this.getIntelligence() * 13) % 10);
			this.currentmagic -= 8;
			int magicdamage = dice.roll(2) * (this.getIntelligence() * 2);
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
