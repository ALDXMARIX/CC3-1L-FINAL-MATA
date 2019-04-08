
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import randomGen.Dice;

public class Food {

	private static Dice dice = new Dice();

	static int randomGeneratorX = 1 + dice.roll(850);;
	static int randomGeneratorY = 1 + dice.roll(710);;

	private static int xStart = 580;

	private static int yStart = 400;

	private Rectangle food = new Rectangle(randomGeneratorX, randomGeneratorY, 50, 50);

	private static String eaten = "no";

//	private Rectangle hitbox;
//
//	public Rectangle getHitbox() {
//		return hitbox;
//	}

//	public void setHitbox(Rectangle hitbox) {
//		this.hitbox = hitbox;
//	}

	private MainProg instance;

	private int counter;

	public void draw(Graphics g) {

		updatePosition();

		g.setColor(Color.white);
		g.fillRect(food.x, food.y, food.width, food.height);
	}

	public static String getEaten() {
		return eaten;
	}

	public static void setEaten(String eaten) {
		Food.eaten = eaten;
	}

	public Food(MainProg instance) {

	}

	public void setWidth(int w) {
		food.width = w;
	}

	public void setHeight(int h) {
		food.height = h;
	}

	private void updatePosition() {
		food.x = food.x;
		food.y = food.y;
	}

	public int rollX() {
		int num = 1 + dice.roll(820);
		if (num == food.getX()) {
			num = 1 + dice.roll(820);
		}
		return num;
	}

	public int rollY() {
		int num = 1 + dice.roll(680);
		if (num == food.getY()) {
			num = 1 + dice.roll(685);
		}
		return num;
	}

	public int generateY() {
		for (int i = 0; 100 + randomGeneratorY == instance.getPacman().getY()
				|| 100 - randomGeneratorY == instance.getPacman().getY(); i++) {
			randomGeneratorY = dice.roll(710);
		}
		return randomGeneratorY;
	}

	public int generateX() {
		for (int j = 0; 100 + randomGeneratorX == instance.getPacman().getX()
				|| 100 - randomGeneratorX == instance.getPacman().getX(); j++) {
			randomGeneratorX = dice.roll(850);
		}
		return randomGeneratorX;
	}

	public void setX(int x) {
		food.x = x;
	}

	public void setY(int y) {
		food.y = y;
	}

	public boolean isCollided(Rectangle entity) {
		// TODO Auto-generated method stub
		return food.intersects(entity);
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
