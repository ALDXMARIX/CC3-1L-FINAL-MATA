import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTunes extends JFrame implements ActionListener {

	static JLabel lblSelectSong, lblPrice;

	static JButton btnSearchSong, btnClear;

	static JComboBox<String> cbSongList;
	static JTextField txtPrice, txtSearchSong;

	public JTunes() {
		// JFrame frame = new JFrame("Hello");

		setVisible(true);
		setLayout(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(250, 40);
		setSize(650, 650);

		lblSelectSong = new JLabel("Select Song");

		btnClear = new JButton("Clear");
		cbSongList = new JComboBox<String>();

		cbSongList.addItem("Please select the song");
		cbSongList.addItem("Shape of You");
		cbSongList.addItem("Perfect");
		cbSongList.addItem("Lego House");
		cbSongList.addItem("SuperMarket Flowers");
		cbSongList.addItem("Thinking Out Loud");
		cbSongList.addItem("Photograph");
		cbSongList.addItem("Happier");
		cbSongList.addItem("Dive");
		cbSongList.addItem("All of the Stars");
		cbSongList.addItem("Dont");
		cbSongList.addItem("Castle on the Hill");
		cbSongList.addItem("One");

		add(cbSongList);
		add(lblSelectSong);

		cbSongList.setVisible(true);
		cbSongList.setLocation(160, 200);
		cbSongList.setVisible(true);
		cbSongList.setSize(200, 50);
		cbSongList.setEnabled(true);

		Font monotypeC = new Font("Monotype Corsiva", Font.BOLD, 20);
		lblSelectSong.setFont(monotypeC);
		lblSelectSong.setEnabled(true);
		lblSelectSong.setVisible(true);
		lblSelectSong.setLocation(160, 160);
		lblSelectSong.setSize(400, 30);

		Font arial = new Font("Arial", Font.BOLD, 15);
		lblPrice = new JLabel("Price: ");// note keep this blank later
		add(lblPrice);
		lblPrice.setFont(arial);
		lblPrice.setEnabled(true);
		lblPrice.setVisible(true);
		lblPrice.setLocation(160, 270);
		lblPrice.setSize(100, 30);

		txtPrice = new JTextField("");// note keep this blank later
		add(txtPrice);
		txtPrice.setFont(arial);
		txtPrice.setEnabled(true);
		txtPrice.setVisible(true);
		txtPrice.setLocation(210, 270);
		txtPrice.setSize(100, 30);

		cbSongList.addActionListener(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JTunes();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//
		if (e.getSource() == cbSongList) {
			String op = cbSongList.getSelectedItem().toString();

			// "Shape of You"
			// "Perfect"
			// "Lego House"
			// "SuperMarket Flowers"
			switch (op) {

			case "Shape of You":
				txtPrice.setText("18$");
				break;

			case "Perfect":
				txtPrice.setText("21$");
				break;
			case "Lego House":
				txtPrice.setText("19$");
				break;

			case "SuperMarket Flowers":
				txtPrice.setText("22$");
				break;

			case "Thinking Out Loud":
				txtPrice.setText("23$");
				break;

			case "Photograph":
				txtPrice.setText("20$");
				break;
			case "Happier":
				txtPrice.setText("17$");
				break;

			case "Dive":
				txtPrice.setText("16$");
				break;

			case "All of the Stars":
				txtPrice.setText("15$");
				break;

			case "Dont":
				txtPrice.setText("12$");
				break;
			case "Castle on the Hill":
				txtPrice.setText("13$");
				break;

			case "One":
				txtPrice.setText("14$");
				break;

			default:
				txtPrice.setText(" ");
				break;
			}
		} else {

		}
	}

}
