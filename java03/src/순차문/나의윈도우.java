package 순차문;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 나의윈도우 {

	public static void main(String[] args) {
		// 틀 역할을 하는 부품 필요
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("눌러");
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "뭐하세요?");
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true);
	}

}
