import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CharacterGraphics extends JPanel implements MouseMotionListener, ActionListener, KeyListener {
	int x = 0;
	int y = 0;
	MaleNinja character1 = new MaleNinja();
	JPanel jp;
	JPanel jpCharacterType;
	JLabel jlCursor = new JLabel();
	JLabel jlName;
	JButton jbMale, jbFemale, jbOKContinue;
	String name;
	FemaleNinja character2 = new FemaleNinja();
	static String color;

//	public CharacterGraphics() {
//
////		jl.setIcon(new ImageIcon("F:\\DREAM ARCHITECTURE\\NINJA.jpg"));

	////
////		validate();
////		jp2.setLocation(250, 250);
////		jp2.setVisible(true);
////		jp2.setSize(200, 200);
////		jp2.setBackground(Color.RED);
////		add(jp2, BorderLayout.SOUTH);
//
//	}

	public CharacterGraphics() {
		setcolor();
		jp = new JPanel();
		jpCharacterType = new JPanel();
		JFrame frame = new JFrame("My Character");

		character1 = new MaleNinja();
		character2 = new FemaleNinja();

//		Container pane = this.getContentPane();
//
//		pane.setLayout(new FlowLayout());

		frame.addMouseMotionListener(this);
		frame.addKeyListener(this);
		frame.setSize(1200, 1100);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLocation(100, 300);

		frame.add(jp);
		frame.add(jpCharacterType);
		frame.add(new MaleNinja());

		jpCharacterType.setVisible(true);
		jpCharacterType.add(jlCursor);
		jpCharacterType.setSize(1200, 100);
		jpCharacterType.setBackground(Color.RED);
		jpCharacterType.setLocation(0, 830);
		jp.setLocation(0, 0);
		jp.setSize(1200, 100);
		jp.setBackground(Color.BLUE);
		jp.setVisible(true);
//		jp.setLayout(new FlowLayout(FlowLayout.CENTER, 1200, 20));

		// validate();
		jlName = new JLabel("");
		setname();

		jlName.setIcon(new ImageIcon("F:\\DREAM ARCHITECTURE\\NINJA.jpg"));
		jlName.setIconTextGap(10);
		jlName.setFont(new Font("Monotype Corsiva", Font.BOLD, 50));
		jlName.setVisible(true);

		jbOKContinue = new JButton("Click OK to Continue");

		jbMale = new JButton("Male");
		jbFemale = new JButton("Female");

		jbMale.addActionListener(this);
		jbFemale.addActionListener(this);
		jbOKContinue.addActionListener(this);
		jbMale.setVisible(true);
		jbFemale.setVisible(true);

		jp.add(jlName);
		jpCharacterType.add(jbMale);
		jpCharacterType.add(jbFemale);
		jpCharacterType.add(jlCursor);

	}

//	public void update(Graphics g) {
//		g.dispose();
//	}
//
//	public void paint(Graphics g) {
//
////		g.setClip(600, 600,700, 700);
//		character1.repaint();
//		character1.paint(g);
//
//		g.dispose();
//
//	}
	public void update(Graphics g) {
		paint(g);
	}

	public void paint(Graphics g) {
		character1.paint(g);
		g.dispose();
		repaint();

	}

	void setname() {
		this.name = JOptionPane.showInputDialog("What is your name : ");
		jlName.setText(name);

	}

	String getname() {
		return name;
	}

	void setcolor() {
		String colorlist[] = { "RED", "BLUE", "YELLOW", "GREEN" };
		color = (String) JOptionPane.showInputDialog(null, "Chose your color", "Color Selection",
				JOptionPane.QUESTION_MESSAGE, null, colorlist, "SELECT COLOR");

		// cbColorList = new JComboBox<String>(colorlist);u can reuse
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CharacterGraphics myRPG = new CharacterGraphics();

	}

	public void mouseDragged(MouseEvent e) {

	}

	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		jlCursor.setText("mouse moved at (" + x + "," + y + ")");
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == jbMale) {
			jlName.setIcon(new ImageIcon("F:\\DREAM ARCHITECTURE\\NINJA.jpg"));

		} else if (e.getSource() == jbFemale && e.getActionCommand().toString().equals("Female")) {
			jlName.setIcon(new ImageIcon("F:\\DREAM ARCHITECTURE\\NINJA-female.jpg"));
		}
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int c = e.getKeyCode();

		if (c == KeyEvent.VK_W) {

			character1.y -= 5;
//			character1.repaint();

//			System.out.println(character1.y);

		}
		if (c == KeyEvent.VK_A) {
			character1.x -= 5;
			character1.repaint();
		}

		if (c == KeyEvent.VK_S) {
			character1.y += 5;
			character1.repaint();
		}
		if (c == KeyEvent.VK_D) {
			character1.x += 5;
			character1.repaint();
		}

	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
