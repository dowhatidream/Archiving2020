package 순차문;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 너의윈도우 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(700, 800);
		
		JButton btnNewButton_1 = new JButton("가");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "좌측");
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("집");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "상단");
			}
		});
		f.getContentPane().add(btnNewButton_2, BorderLayout.NORTH);
		
		JButton btnNewButton_3 = new JButton("싶어");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "하단");
			}
		});
		f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("고");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "우측");
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("ㅠㅠ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "중앙");
			}
		});
		f.getContentPane().add(btnNewButton_4, BorderLayout.CENTER);
		
		f.setVisible(true);
	}

}
