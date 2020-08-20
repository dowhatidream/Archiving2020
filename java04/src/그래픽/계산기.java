package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 600);

		FlowLayout layout = new FlowLayout();
		f.getContentPane().setLayout(layout);

		JTextField f1 = new JTextField(10);
		f1.setForeground(new Color(255, 255, 224));
		f1.setBackground(new Color(135, 206, 250));
		f1.setFont(new Font("굴림", Font.PLAIN, 25));
		JTextField f2 = new JTextField(10);
		f2.setForeground(new Color(255, 255, 224));
		f2.setBackground(new Color(135, 206, 250));
		f2.setFont(new Font("굴림", Font.PLAIN, 25));

		JButton b1 = new JButton("+");

		b1.setBackground(new Color(0, 255, 255));
		b1.setForeground(new Color(0, 0, 0));
		b1.setFont(new Font("굴림", Font.PLAIN, 30));

		ImageIcon img = new ImageIcon("sky.jpg");

		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel("숫자1");
		l2.setForeground(new Color(75, 0, 130));
		l2.setBackground(new Color(147, 112, 219));
		l2.setFont(new Font("굴림", Font.PLAIN, 30));
		JLabel l3 = new JLabel("숫자2");
		l3.setForeground(new Color(75, 0, 130));
		l3.setBackground(new Color(147, 112, 219));
		l3.setFont(new Font("굴림", Font.PLAIN, 30));
		JLabel l4 = new JLabel();
		l4.setForeground(new Color(255, 0, 0));
		l4.setFont(new Font("굴림", Font.PLAIN, 38));
		l1.setIcon(img);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(f1.getText());
				int num2 = Integer.parseInt(f2.getText());
				int result = num1 + num2;
				l4.setText(result + "");
			}
		});

		JButton b2 = new JButton("-");
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("굴림", Font.PLAIN, 30));
		b2.setBackground(Color.CYAN);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(f1.getText());
				int num2 = Integer.parseInt(f2.getText());
				int result = num1 - num2;
				l4.setText(result + "");
			}
		});

		JButton b3 = new JButton("*");
		b3.setForeground(Color.BLACK);
		b3.setFont(new Font("굴림", Font.PLAIN, 30));
		b3.setBackground(Color.CYAN);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(f1.getText());
				int num2 = Integer.parseInt(f2.getText());
				int result = num1 * num2;
				l4.setText(result + "");
			}
		});

		JButton b4 = new JButton("/");
		b4.setForeground(Color.BLACK);
		b4.setFont(new Font("굴림", Font.PLAIN, 30));
		b4.setBackground(Color.CYAN);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(f1.getText());
				int num2 = Integer.parseInt(f2.getText());
				double result = (double) num1 / num2;
				l4.setText(result + "");
			}
		});

		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(f1);
		f.getContentPane().add(l3);
		f.getContentPane().add(f2);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);
		f.getContentPane().add(l4);
		f.setVisible(true);
	}

}
