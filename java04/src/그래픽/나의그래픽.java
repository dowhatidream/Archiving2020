package 그래픽;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 나의그래픽 {

	public static void main(String[] args) {
		// 자바는 부품조립식 코드 -> 객체지향형프로그래밍(OOP)
		// ctrl + shift + o: 자동 import
		// new는 복사의 의미(원본을 복사해서 가져와~~~~~~~~)
		JFrame f = new JFrame("승연이네");
		f.setSize(650, 600);
		
		FlowLayout layout = new FlowLayout();
		f.getContentPane().setLayout(layout);

		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "안녕!");
				
			}
		});
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "안녕하세요!");
				
			}
		});
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "잘가~~");
				
			}
		});
		ImageIcon img = new ImageIcon("sky.jpg");
		b1.setText("눌러");
		b2.setText("눌러보라고");
		b3.setIcon(img);

		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("하하");
		f.getContentPane().add(b4, BorderLayout.NORTH);
		f.setVisible(true);
	}

}
