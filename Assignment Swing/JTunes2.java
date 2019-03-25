import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTunes2 {

	static JLabel lblSelectSong, lblPrice;

	static JButton btnSearchSong, btnClear;

	static JComboBox<String> cbSongList;
	static JTextField txtPrice, txtSearchSong;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Hello");
		frame.setVisible(true);
		frame.setLayout(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(250, 40);
		frame.setSize(650, 650);

		lblSelectSong = new JLabel("Select Song from drop down list or search bar");

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

		frame.add(cbSongList);
		frame.add(lblSelectSong);

		cbSongList.setVisible(true);
		cbSongList.setLocation(160, 200);
		cbSongList.setSize(200, 50);
		cbSongList.setEnabled(true);

		Font monotypeC = new Font("Monotype Corsiva", Font.BOLD, 20);
		lblSelectSong.setFont(monotypeC);
		lblSelectSong.setEnabled(true);
		lblSelectSong.setVisible(true);
		lblSelectSong.setLocation(160, 100);
		lblSelectSong.setSize(400, 30);

		Font arial = new Font("Arial", Font.BOLD, 15);
		lblPrice = new JLabel("Price: ");// note keep this blank later
		frame.add(lblPrice);
		lblPrice.setFont(arial);
		lblPrice.setEnabled(true);
		lblPrice.setVisible(true);
		lblPrice.setLocation(160, 270);
		lblPrice.setSize(100, 30);

		txtPrice = new JTextField("");// note keep this blank later
		frame.add(txtPrice);
		txtPrice.setFont(arial);
		txtPrice.setEnabled(true);
		txtPrice.setVisible(true);
		txtPrice.setLocation(210, 270);
		txtPrice.setSize(100, 30);

		txtSearchSong = new JTextField("");
		frame.add(txtSearchSong);
		txtSearchSong.setFont(arial);
		txtSearchSong.setEnabled(true);
		txtSearchSong.setVisible(true);
		txtSearchSong.setLocation(160, 150);
		txtSearchSong.setSize(200, 30);

		btnSearchSong = new JButton("Search");
		frame.add(btnSearchSong);

		btnSearchSong.setFont(arial);
		btnSearchSong.setEnabled(true);
		btnSearchSong.setVisible(true);
		btnSearchSong.setLocation(365, 150);
		btnSearchSong.setSize(100, 30);

		btnSearchSong.addActionListener(new searchButton());
		cbSongList.addActionListener(new searchList());

	}

	static class searchButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnSearchSong) {
				String op = txtSearchSong.getText();

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
					JOptionPane.showMessageDialog(null, "Song not found!");
					txtPrice.setText(" ");
					break;
				}
			} else {

			}
		}
	}

	static class searchList implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == cbSongList) {
				String op = cbSongList.getSelectedItem().toString();

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

}
