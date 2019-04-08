import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Walls {

	private Rectangle left = new Rectangle(0, 0, 20, 740);
	private Rectangle right = new Rectangle(870, 0, 20, 740);
	private Rectangle top = new Rectangle(0, 0, 890, 20);
	private Rectangle bottom = new Rectangle(0, 730, 890, 20);

	public Walls() {

	}

	public Walls getWalls() {
		return this;
	}

	public boolean isCollidedTop(Rectangle entity) {
		return top.intersects(entity);
	}

	public boolean isCollidedBottom(Rectangle entity) {
		return bottom.intersects(entity);
	}

	public boolean isCollidedRight(Rectangle entity) {
		return right.intersects(entity);
	}

	public boolean isCollidedLeft(Rectangle entity) {
		return left.intersects(entity);
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(left.x, left.y, left.width, left.height);

		g.setColor(Color.white);
		g.fillRect(right.x, right.y, right.width, right.height);

		g.setColor(Color.white);
		g.fillRect(top.x, top.y, top.width, top.height);

		g.setColor(Color.white);
		g.fillRect(bottom.x, bottom.y, bottom.width, bottom.height);
	}

//	public Rectangle getWallsTop() {
//		return top;
//	}
//
//	public Rectangle getWallsLeft() {
//		return left;
//	}
//
//	public Rectangle getWallsRight() {
//		return right;
//	}
//
//	public Rectangle getWallsBottom() {
//		return bottom;
//	}

}
