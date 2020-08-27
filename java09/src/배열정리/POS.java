package 배열정리;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class POS extends JFrame {
	static int count = 0;
	static int price = 0;
	static int menu1 = 22190;
	static int menu2 = 11000;
	static int menu3 = 18000;

	public POS() {
		getContentPane().setBackground(new Color(173, 216, 230));
		setSize(600, 500);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JTextField countMenu = new JTextField();
		countMenu.setText("0");
		countMenu.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		countMenu.setBounds(418, 10, 154, 47);
		getContentPane().add(countMenu);
		countMenu.setColumns(10);

		JLabel pic = new JLabel();
		pic.setBounds(12, 67, 397, 384);
		getContentPane().add(pic);

		JTextArea order = new JTextArea();
		order.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		order.setBounds(418, 67, 154, 220);
		getContentPane().add(order);

		JTextField totalPrice = new JTextField();
		totalPrice.setText("0");
		totalPrice.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		totalPrice.setColumns(10);
		totalPrice.setBounds(418, 297, 154, 54);
		getContentPane().add(totalPrice);
		setVisible(true);

		JButton btnMenu1 = new JButton("연어");
		btnMenu1.setForeground(new Color(255, 255, 255));
		btnMenu1.setBackground(new Color(95, 158, 160));
		btnMenu1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnMenu1.setBounds(12, 10, 125, 47);
		getContentPane().add(btnMenu1);
		btnMenu1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				price += menu1;
				pic.setIcon(new ImageIcon("D:/LSY/workspace/java09/images/salmon.jpg"));
				countMenu.setText(String.valueOf(count));
				order.append("연어" + "\n");
				totalPrice.setText(String.valueOf(price));

			}
		});

		JButton btnMenu2 = new JButton("망고");
		btnMenu2.setForeground(new Color(255, 255, 255));
		btnMenu2.setBackground(new Color(95, 158, 160));
		btnMenu2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnMenu2.setBounds(149, 10, 125, 47);
		getContentPane().add(btnMenu2);
		btnMenu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				price += menu1;
				pic.setIcon(new ImageIcon("D:/LSY/workspace/java09/images/mango.jpg"));
				countMenu.setText(String.valueOf(count));
				order.append("망고" + "\n");
				totalPrice.setText(String.valueOf(price));
			}
		});

		JButton btnMenu3 = new JButton("치킨");
		btnMenu3.setForeground(new Color(255, 255, 255));
		btnMenu3.setBackground(new Color(95, 158, 160));
		btnMenu3.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnMenu3.setBounds(286, 10, 125, 47);
		getContentPane().add(btnMenu3);

		btnMenu3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				price += menu1;
				pic.setIcon(new ImageIcon("D:/LSY/workspace/java09/images/chicken.jpg"));
				countMenu.setText(String.valueOf(count));
				order.append("치킨" + "\n");
				totalPrice.setText(String.valueOf(price));
			}
		});

		JButton btnReset = new JButton("초기화");
		btnReset.setBackground(new Color(219, 112, 147));
		btnReset.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnReset.setBounds(418, 361, 154, 90);
		getContentPane().add(btnReset);
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				price = 0;
				count = 0;
				order.setText(null);
				totalPrice.setText(null);
				pic.setIcon(null);
				countMenu.setText(null);
			}
		});
	}

	public static void main(String[] args) {
		new POS();
	}
}
