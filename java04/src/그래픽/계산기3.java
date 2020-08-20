package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 1. 두개의 숫자 입력 받아서 버튼을 누르면 어떤 숫자가 더 큰 지 판별
// 2. 이름/태어난 연도를 입력 받아서 다음과 같이 출력되도록. 홍길동은 성인입니다.

public class 계산기3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(230, 230, 250));
		f.setSize(250, 600);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		JLabel l1 = new JLabel("숫자 1");
		l1.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 32));
		JLabel l2 = new JLabel("숫자 2");
		l2.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 32));
		JLabel result = new JLabel("----");
		result.setForeground(new Color(138, 43, 226));
		result.setFont(new Font("굴림", Font.PLAIN, 23));

		JTextField t1 = new JTextField(10);
		t1.setFont(new Font("굴림", Font.PLAIN, 25));
		t1.setBackground(new Color(216, 191, 216));
		JTextField t2 = new JTextField(10);
		t2.setFont(new Font("굴림", Font.PLAIN, 25));
		t2.setBackground(new Color(216, 191, 216));

		JButton btn = new JButton("판별");
		btn.setForeground(new Color(255, 255, 255));
		btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 20));
		btn.setBackground(new Color(123, 104, 238));
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				String s = "";
				
				if (num1 == num2) {
					s = "둘이 같네요";
				} else if (num1 > num2) {
					s = num1 + "이(가) 더 크네요.";
				} else {
					s = num2 + "이(가) 더 크네요.";
				}
				result.setText(s);
			}
		});

		JLabel l3 = new JLabel("이름");
		l3.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 32));
		JLabel l4 = new JLabel("출생연도");
		l4.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 32));
		JLabel result2 = new JLabel("----");
		result2.setForeground(new Color(138, 43, 226));
		result2.setFont(new Font("굴림", Font.PLAIN, 20));

		JTextField name = new JTextField(10);
		name.setFont(new Font("굴림", Font.PLAIN, 25));
		name.setBackground(new Color(216, 191, 216));
		JTextField birthYear = new JTextField(10);
		birthYear.setFont(new Font("굴림", Font.PLAIN, 25));
		birthYear.setBackground(new Color(216, 191, 216));
		birthYear.setToolTipText("4자리로 넣어주세요!");

		JButton btn2 = new JButton("판별");
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 20));
		btn2.setBackground(new Color(123, 104, 238));
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				int y = Integer.parseInt(birthYear.getText());
				String s = "";

				if (y <= 2001) { // 만 19세 이상(한국나이 20세)
					s = n + "님은 성인입니다.";
				} else {
					s = n + "님은 미성년입니다.";
				}
				result2.setText(s);
			}
		});

		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(btn);
		f.getContentPane().add(result);

		f.getContentPane().add(l3);
		f.getContentPane().add(name);
		f.getContentPane().add(l4);
		f.getContentPane().add(birthYear);
		f.getContentPane().add(btn2);
		f.getContentPane().add(result2);

		f.setVisible(true);
	}
}
