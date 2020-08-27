package 배열정리;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Movie extends JFrame {
	static int index = 2;

	public static void main(String[] args) {
		new Movie();
	}

	public Movie() {
		// 영화제목, 감독, 이미지, 평점
		String[] title = { "169세", "2다만 악에서 구하소서", "3테넷", "4오, 문희!", "5아메리칸 잡" };
		String[] img = { "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg" };
		String[] director = { "일자바", "이파이썬", "삼씨", "사자스", "오알" };
		double[] rate = { 2.1, 9.3, 8.8, 10, 4.9 };
		String ad = "D:/LSY/workspace/java09/images/";

		setSize(700, 900);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel title1 = new JLabel(title[2]);
		title1.setHorizontalAlignment(SwingConstants.CENTER);
		title1.setBackground(Color.PINK);
		title1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		title1.setBounds(189, 21, 323, 36);
		getContentPane().add(title1);

//		ImageIcon icon = new ImageIcon(ad+img[2]);

		JLabel imgs = new JLabel();
		imgs.setBounds(53, 147, 578, 704);
		getContentPane().add(imgs);
		imgs.setIcon(new ImageIcon(ad+img[2]));

		JLabel lbDirector = new JLabel("감독");
		lbDirector.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbDirector.setBounds(61, 73, 57, 27);
		getContentPane().add(lbDirector);

		JLabel director1 = new JLabel(director[2]);
		director1.setHorizontalAlignment(SwingConstants.CENTER);
		director1.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 15));
		director1.setBounds(115, 79, 102, 19);
		getContentPane().add(director1);

		JLabel lbRate = new JLabel("평점");
		lbRate.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbRate.setBounds(61, 110, 57, 27);
		getContentPane().add(lbRate);

		JLabel rate1 = new JLabel(String.valueOf(rate[2]));
		rate1.setHorizontalAlignment(SwingConstants.CENTER);
		rate1.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 15));
		rate1.setBounds(125, 116, 78, 19);
		getContentPane().add(rate1);

		JButton btnBefore = new JButton("<");
		btnBefore.setBounds(0, 390, 41, 80);
		getContentPane().add(btnBefore);
		btnBefore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index <= 0) {
					index = 4;
				} else {
					index--;

				}
				title1.setText(title[index]);
				director1.setText(director[index]);
				rate1.setText(String.valueOf(rate[index]));
				imgs.setIcon(new ImageIcon(ad+img[index]));
				
				director1.setText(director[index]);
			}
		});

		JButton btnAfter = new JButton(">");
		btnAfter.setBounds(643, 390, 41, 80);
		getContentPane().add(btnAfter);
		btnAfter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index >= 4) {
					index = 0;
				} else {
					index++;

				}
				title1.setText(title[index]);
				director1.setText(director[index]);
				rate1.setText(String.valueOf(rate[index]));
				imgs.setIcon(new ImageIcon(ad+img[index]));
				
				director1.setText(director[index]);
			}
		});

		setVisible(true);
	}
}









