package dbÃ³¸®;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MemberCRUD extends JFrame {

	public static void main(String[] args) {
		new MemberCRUD();
	}

	public MemberCRUD() {

		JLabel lb1 = new JLabel("ID");
		lb1.setHorizontalAlignment(SwingConstants.RIGHT);
		lb1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lb1.setBounds(12, 25, 80, 25);

		JTextField t1 = new JTextField();
		t1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		t1.setBounds(115, 25, 150, 30);

		JLabel lb2 = new JLabel("PW");
		lb2.setHorizontalAlignment(SwingConstants.RIGHT);
		lb2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lb2.setBounds(12, 65, 80, 25);

		JTextField t2 = new JTextField();
		t2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		t2.setBounds(115, 65, 150, 30);

		JLabel lb3 = new JLabel("NAME");
		lb3.setHorizontalAlignment(SwingConstants.RIGHT);
		lb3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lb3.setBounds(12, 105, 80, 25);

		JTextField t3 = new JTextField();
		t3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		t3.setBounds(115, 105, 150, 30);

		JLabel lb4 = new JLabel("TEL");
		lb4.setHorizontalAlignment(SwingConstants.RIGHT);
		lb4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		lb4.setBounds(12, 145, 80, 25);

		JTextField t4 = new JTextField();
		t4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		t4.setBounds(115, 145, 150, 30);

		JButton btnC = new JButton("CREATE");
		btnC.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		btnC.setBounds(38, 210, 100, 50);
		btnC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();

				try {
					dao.create(id, pw, name, tel);
					
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
		btnR.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		btnR.setBounds(149, 210, 100, 50);
		btnR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				String id = t1.getText();

				try {
					int result = dao.read(id);
					if (result == 1) {
						
					} else {
						t1.setText("¾øÀ½");
						t1.setBackground(Color.yellow);
						t2.setText("¾øÀ½");
						t2.setBackground(Color.yellow);
						t3.setText("¾øÀ½");
						t3.setBackground(Color.yellow);
						t4.setText("¾øÀ½");
						t4.setBackground(Color.yellow);
					}
					
					
					
//					String result = String.valueOf(dao.read(id));
//					
//					t1.setText(result);
//					t2.setText(result);
//					t3.setText(result);
//					t4.setText(result);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btnU = new JButton("UPDATE");
		btnU.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		btnU.setBounds(38, 270, 100, 50);
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
		btnD.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		btnD.setBounds(149, 270, 100, 50);
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
		
		getContentPane().add(lb1);
		getContentPane().add(t1);
		getContentPane().add(lb2);
		getContentPane().add(t2);
		getContentPane().add(lb3);
		getContentPane().add(t3);
		getContentPane().add(lb4);
		getContentPane().add(t4);
		getContentPane().add(btnC);
		getContentPane().add(btnR);
		getContentPane().add(btnU);
		getContentPane().add(btnD);
		
		setSize(300, 400);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
