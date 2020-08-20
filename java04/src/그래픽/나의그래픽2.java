package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 나의그래픽2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 100);

		FlowLayout layout = new FlowLayout();
		f.getContentPane().setLayout(layout);

		JButton b1 = new JButton();
		b1.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 30));
		JButton b2 = new JButton();
		b2.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 30));
		b1.setText("봄");
		b1.setBackground(new Color(123, 104, 238));
		b1.setForeground(new Color(255, 255, 255));
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "날씨가 좋네요");
			}
		});
		b2.setText("여름");
		b2.setBackground(new Color(0, 139, 139));
		b2.setForeground(new Color(255, 255, 240));
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "더워요!!!");
			}
		});

		f.add(b1);
		f.add(b2);
		f.setVisible(true);

	}

}
