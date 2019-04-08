import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pacman extends Creature {

	private int xd, yd;

	private MainProg instance;

	private static String mouth = "open";

	private Rectangle hitbox;
	private int arcStart = 45, arcEnd = 270;

	private int counter;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Pacman(MainProg instance, int x, int y) {

		super(x, y);
		this.instance = instance;
		w = 75;
		h = 75;

		hitbox = new Rectangle(x, y, w, h);

	}

	public Rectangle getHitbox() {
		return hitbox;
	}

	public void setHitbox(Rectangle hitbox) {
		this.hitbox = hitbox;
	}

	public void draw(Graphics g) {

		move();

//		int i = 0;
//		do {
//			if (instance.getFood().isCollided(hitbox)) {
//
//				instance.getFood().setX(randomGeneratorX);
//				instance.getFood().setY(randomGeneratorY);
//				instance.getFood().setWidth(100);
//				instance.getFood().setY(100);
//				instance.getFood().setY(100);
//
//			} else

		setXD(0);
		setYD(0);
//			i++;

		if (!instance.getFood().isCollided(hitbox) && Food.getEaten() == "yes") {
			Food.setEaten("no");
//			System.out.println("no");
		}

		else if (!instance.getFood().isCollided(hitbox) && Food.getEaten() == "no") {
			Food.setEaten("no");
//			System.out.println("no");
		}

		else if (instance.getFood().isCollided(hitbox) && Food.getEaten() == "no" && counter != 10) {
			instance.getFood().setX(instance.getFood().rollX());
			instance.getFood().setY(instance.getFood().rollY());
			instance.repaint();
			instance.getFood().draw(g);
			counter++;
			Food.setEaten("yes");
//			System.out.println("yes");
		}

		if (instance.getWalls().isCollidedLeft(hitbox)) {
			setXD(1);
		}
		if (instance.getWalls().isCollidedRight(hitbox)) {
			setXD(-1);
		}

		if (instance.getWalls().isCollidedTop(hitbox)) {
			setYD(1);
		}
		if (instance.getWalls().isCollidedBottom(hitbox)) {
			setYD(-1);
		}

		g.setColor(Color.yellow);
		g.fillArc(hitbox.x, hitbox.y, hitbox.width, hitbox.height, getArcStart(), getArcEnd());

//		} while (i < 10);
	}

	private void move() {
		hitbox.x += xd;
		hitbox.y += yd;
	}

	public void setXD(int value) {
		xd = value;
	}

	public void setYD(int value) {
		yd = value;
	}

	public int getArcStart() {
		return arcStart;
	}

	public void setArcStart(int arcStart) {
		this.arcStart = arcStart;
	}

	public static String getMouth() {
		return mouth;
	}

	public static void setMouth(String mouth) {
		Pacman.mouth = mouth;
	}

	public int getArcEnd() {
		return arcEnd;
	}

	public void setArcEnd(int arcEnd) {
		this.arcEnd = arcEnd;
	}

	public boolean isCollided(Rectangle entity) {
		return hitbox.intersects(entity);
	}

}
