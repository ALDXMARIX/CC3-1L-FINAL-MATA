import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import randomGen.Dice;

public class MainProg extends JPanel implements KeyListener {

	/**
	 * 
	 */
	private int[] randomGeneratorYarr;
	private int[] randomGeneratorXarr;
	private Dice dice = new Dice();

	int randomGeneratorX = 1 + dice.roll(850);
	int randomGeneratorY = 1 + dice.roll(710);

	int prevNumberX;
	int prevNumberY;

	Font myFont = new Font("Courier New", 20, 30);

	Font myFont2 = new Font("Monotype Corsiva", Font.BOLD, 50);

	Font myFontGO = new Font("Arial", Font.BOLD, 120);

	private static final long serialVersionUID = 1L;
	private Pacman player1;
	private Food food;
	private Walls walls;
	private int counter = 0;

	JLabel jlCounter;

	private String key;

//	private Walls left;
//
//	private Walls right;
//
//	private Walls top;
//
//	private Walls bottom;

	public MainProg() {

		randomGeneratorYarr = new int[10];
		randomGeneratorXarr = new int[10];

		setSize(new Dimension(880, 740));
		setPreferredSize(new Dimension(880, 740));

		setFocusable(true);
		addKeyListener(this);

		jlCounter = new JLabel("");
		setCounter(counter);

		player1 = new Pacman(this, 21, 21);
		food = new Food(this);
		walls = new Walls();
		for (int i = 0; i < 10; i++) {
			randomGeneratorXarr[i] = food.rollX();
		}

		for (int j = 0; j < 10; j++) {
			randomGeneratorYarr[j] = food.rollY();
		}

//		for (int i = 0; i < 10; i++) {
//			System.out.println(randomGeneratorXarr[i]);
//		}
//
//		for (int j = 0; j < 10; j++) {
//			System.out.println(randomGeneratorXarr[j]);
//		}

	}

	private void setCounter(int counter) {
		// TODO Auto-generated method stub
		this.counter = counter;
	}

	private int getCounter() {

		return counter;
	}

	public void update(Graphics g) {
		paint(g);
	}

	public void paint(Graphics g) {

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());

		Graphics2D g2d = (Graphics2D) g.create();
//		String text = "All your base are belong to us" + counter;
		g2d.setFont(myFont);
		FontMetrics fm = g2d.getFontMetrics();
		g2d.setColor(Color.WHITE);
		g2d.drawString("Counter: " + player1.getCounter(), 670, 70);
		g.setFont(myFont2);
		repaint();

		if (player1.getCounter() == 10) {

			g2d.setFont(myFontGO);
			g2d.drawString("GAME OVER!!!", 25, 350);
			g.dispose();
			g2d.dispose();

//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.exit(0);
		}

		player1.draw(g);
		walls.draw(g);
		food.draw(g);
		g.dispose();
		repaint();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainProg pac = new MainProg();

		JFrame frame = new JFrame("My PacMan");
		frame.setTitle("My PacMan");

		ImageIcon i = new ImageIcon("mypacman icon.jpg");
		frame.setIconImage((i.getImage()));
		frame.add(pac);
		frame.pack();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);

	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int c = e.getKeyCode();

//		do {
		if (c == KeyEvent.VK_W) {
			key = "w";

			if (key == "w" && Pacman.getMouth() == "close") {
				player1.setYD(-10);
//				if (player1.y < 0) {
//					player1.y = 700;
//				}
				player1.setArcStart(135);
				player1.setArcEnd(270);
				Pacman.setMouth("open");

			} else if (key == "w" && Pacman.getMouth() == "open") {
				player1.setYD(-10);
//				if (player1.y < 0) {
//					player1.y = 750;
				player1.setArcStart(0);
				player1.setArcEnd(360);
				Pacman.setMouth("close");
			}
		} else if (c == KeyEvent.VK_S) {
			key = "s";

			if (key == "s" && Pacman.getMouth() == "close") {
				player1.setYD(+10);
//				if (player1.y > 850) {
//					player1.y = 0;
//				}
				player1.setArcStart(315);
				player1.setArcEnd(270);
				Pacman.setMouth("open");
			} else if (key == "s" && Pacman.getMouth() == "open") {
				player1.setYD(+10);
//					if (player1.y > 850) {
//						player1.y = 0;
//					}
				player1.setArcStart(0);
				player1.setArcEnd(360);
				Pacman.setMouth("close");
			}
		} else if (c == KeyEvent.VK_D) {
			key = "d";

			if (key == "d" && Pacman.getMouth() == "close") {
				player1.setXD(+10);
//				if (player1.x > 850) {
//					player1.x = 0;
//				}
				player1.setArcStart(45);
				player1.setArcEnd(270);
				Pacman.setMouth("open");

			} else if (key == "d" && Pacman.getMouth() == "open") {
				player1.setXD(+10);
//				if (player1.x > 850) {
//					player1.x = 0;
//				}
				player1.setArcStart(0);
				player1.setArcEnd(360);
				Pacman.setMouth("close");

			}

		} else if (c == KeyEvent.VK_A) {
			key = "a";

			if (key == "a" && Pacman.getMouth() == "close") {
				player1.setXD(-10);
//				if (player1.x < 0) {
//					player1.x = 750;
//				}
				player1.setArcStart(225);
				player1.setArcEnd(270);
				Pacman.setMouth("open");

			} else if (key == "a" && Pacman.getMouth() == "open") {
				player1.setXD(-10);
//				if (player1.x < 0) {
//					player1.x = 750;
//				}
				player1.setArcStart(0);
				player1.setArcEnd(360);
				Pacman.setMouth("close");
			}

		}
	}

	public Food getFood() {
		return food;
	}

	public Walls getWalls() {
		return walls;
	}

	public Pacman getPacman() {
		return player1;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		player1.setXD(0);
		player1.setYD(0);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public int getRandomX() {
		int number;

		do {
			number = randomGeneratorXarr[dice.roll(10)];

		} while (number == prevNumberX);

		prevNumberX = number;
		return number;
	}

	public int getRandomY() {
		int number;

		do {
			number = randomGeneratorXarr[dice.roll(9)];

		} while (number == prevNumberY);

		prevNumberY = number;
		return number;
	}

//	&& Food.getEaten() == "no"

}
