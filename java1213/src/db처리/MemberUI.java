package db√≥∏Æ;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MemberUI extends JFrame {

	public static void main(String[] args) {
		new MemberUI();
	}

	public MemberUI() {

		JLabel lb1 = new JLabel("ID");
		lb1.setHorizontalAlignment(SwingConstants.RIGHT);
		lb1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 25));
		lb1.setBounds(12, 25, 80, 25);

		JTextField t1 = new JTextField();
		t1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		t1.setBounds(115, 25, 257, 30);

		JLabel lb2 = new JLabel("PW");
		lb2.setHorizontalAlignment(SwingConstants.RIGHT);
		lb2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 25));
		lb2.setBounds(12, 65, 80, 25);

		JTextField t2 = new JTextField();
		t2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		t2.setBounds(115, 65, 257, 30);

		JLabel lb3 = new JLabel("NAME");
		lb3.setHorizontalAlignment(SwingConstants.RIGHT);
		lb3.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 25));
		lb3.setBounds(12, 105, 80, 25);

		JTextField t3 = new JTextField();
		t3.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		t3.setBounds(115, 105, 257, 30);

		JLabel lb4 = new JLabel("TEL");
		lb4.setHorizontalAlignment(SwingConstants.RIGHT);
		lb4.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 25));
		lb4.setBounds(12, 145, 80, 25);

		JTextField t4 = new JTextField();
		t4.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		t4.setBounds(115, 145, 257, 30);

		JTextField tfResult = new JTextField();
		tfResult.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
		tfResult.setBounds(12, 241, 360, 44);
		tfResult.setColumns(10);
		tfResult.setFocusable(false);

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 15));
		btnLogin.setBounds(12, 195, 360, 36);
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				String id = t1.getText();
				String pw = t2.getText();

				try {
					boolean result = dao.login(id, pw);

					if (result) {
						tfResult.setText("Login successfully.");
					} else {
						tfResult.setText("Login failed!");
					}
					t1.setText(null);
					t2.setText(null);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btnC = new JButton("CREATE");
		btnC.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 15));
		btnC.setBounds(33, 325, 100, 50);
		btnC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();

				try {
					MemberVO vo = new MemberVO();
					vo.setId(id);
					vo.setPw(pw);
					vo.setName(name);
					vo.setTel(tel);
					
					dao.create(vo);
					
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
					t4.setText(null);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btnR = new JButton("READ");
		btnR.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 15));
		btnR.setBounds(254, 325, 100, 50);

		btnR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				String id = t1.getText();

				try {
					MemberVO vo = dao.read(id);

					t1.setText(vo.getId());
					t2.setText(vo.getPw());
					t3.setText(vo.getName());
					t4.setText(vo.getTel());
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		JButton btnU = new JButton("UPDATE");
		btnU.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 15));
		btnU.setBounds(144, 325, 100, 50);
		btnU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				String tel = t4.getText();
				String id = t1.getText();

				try {
					dao.update(tel, id);

					t4.setText(null);
					t1.setText(null);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btnD = new JButton("DELETE");
		btnD.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 15));
		btnD.setBounds(33, 385, 100, 50);
		btnD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				String id = t1.getText();

				try {
					dao.delete(id);

					t1.setText(null);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btnCheck = new JButton("CHECK");
		btnCheck.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 15));
		btnCheck.setBounds(144, 385, 100, 50);
		btnCheck.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				String id = t1.getText();

				try {
					int result = dao.checkId(id);

					t1.setText(null);
					tfResult.setText(result + "");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 15));
		btnReset.setBounds(256, 385, 100, 50);
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				tfResult.setText(null);
			}
		});

		getContentPane().add(lb1);
		getContentPane().add(t1);
		getContentPane().add(lb2);
		getContentPane().add(t2);
		getContentPane().add(lb3);
		getContentPane().add(t3);
		getContentPane().add(lb4);
		getContentPane().add(t4);
		getContentPane().add(btnLogin);
		getContentPane().add(tfResult);
		getContentPane().add(btnC);
		getContentPane().add(btnR);
		getContentPane().add(btnU);
		getContentPane().add(btnD);
		getContentPane().add(btnCheck);
		getContentPane().add(btnReset);

		setSize(400, 500);
		getContentPane().setLayout(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
