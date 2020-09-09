package db√≥∏Æ;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class BbsUI extends JFrame {
	BbsDAO dao = new BbsDAO();
	BbsVO vo = new BbsVO();

	public static void main(String[] args) {
		new BbsUI();
	}

	public BbsUI() {
		getContentPane().setBackground(new Color(230, 230, 250));
		JLabel lbNo = new JLabel();
		lbNo.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 14));
		lbNo.setText("No");
		lbNo.setBounds(10, 10, 50, 30);

		JTextField tfNo = new JTextField();
		tfNo.setBounds(72, 10, 300, 30);

		JLabel lbTitle = new JLabel();
		lbTitle.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 14));
		lbTitle.setText("Title");
		lbTitle.setBounds(10, 50, 50, 30);

		JTextField tfTitle = new JTextField();
		tfTitle.setBounds(72, 50, 300, 30);

		JLabel lbCon = new JLabel();
		lbCon.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 14));
		lbCon.setText("Con");
		lbCon.setBounds(10, 130, 50, 30);

		JTextArea taCon = new JTextArea();
		taCon.setBounds(72, 130, 300, 199);

		JLabel lbWriter = new JLabel();
		lbWriter.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 14));
		lbWriter.setText("Writer");
		lbWriter.setBounds(10, 90, 50, 30);

		JTextField tfWriter = new JTextField();
		tfWriter.setBounds(72, 90, 300, 30);

		JButton btnC = new JButton("CREATE");
		btnC.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		btnC.setForeground(new Color(255, 255, 255));
		btnC.setBackground(new Color(95, 158, 160));
		btnC.setBounds(12, 350, 360, 30);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String no = tfNo.getText();
					String title = tfTitle.getText();
					String content = taCon.getText();
					String writer = tfWriter.getText();

					vo.setNo(Integer.valueOf(no));
					vo.setTitle(title);
					vo.setContent(content);
					vo.setWriter(writer);

					dao.create(vo);

					tfNo.setText(null);
					tfTitle.setText(null);
					taCon.setText(null);
					tfWriter.setText(null);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});

		JButton btnR = new JButton("READ");
		btnR.setBackground(new Color(100, 149, 237));
		btnR.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		btnR.setBounds(197, 430, 175, 30);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = tfNo.getText();
				try {
					BbsVO vo = dao.read(Integer.valueOf(no));

					tfNo.setText(vo.getNo() + "");
					tfTitle.setText(vo.getTitle());
					taCon.setText(vo.getContent());
					tfWriter.setText(vo.getWriter());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JButton btnU = new JButton("UPDATE");
		btnU.setBackground(new Color(255, 215, 0));
		btnU.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		btnU.setBounds(12, 390, 360, 30);
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String no = tfNo.getText();
					String content = taCon.getText();

					vo.setNo(Integer.valueOf(no));
					vo.setContent(content);

					dao.update(vo);

					tfNo.setText(null);
					tfTitle.setText(null);
					taCon.setText(null);
					tfWriter.setText(null);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});

		JButton btnD = new JButton("DELETE");
		btnD.setForeground(new Color(255, 255, 255));
		btnD.setBackground(new Color(255, 99, 71));
		btnD.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		btnD.setBounds(12, 470, 175, 30);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String no = tfNo.getText();

					vo.setNo(Integer.valueOf(no));

					dao.delete(vo);

					tfNo.setText(null);
					tfTitle.setText(null);
					taCon.setText(null);
					tfWriter.setText(null);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});

		JTextArea taAll = new JTextArea();
		taAll.setBounds(384, 10, 338, 491);
		taAll.setFocusable(false);

		JButton btnRAll = new JButton("READ ALL");
		btnRAll.setBackground(new Color(100, 149, 237));
		btnRAll.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		btnRAll.setBounds(12, 430, 175, 30);
		btnRAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BbsDAO dao = new BbsDAO();
					ArrayList<BbsVO> bbsList = dao.read();

					for (int i = 0; i < bbsList.size(); i++) {
						BbsVO vo = bbsList.get(i);
						taAll.append(vo.getNo() + ", " 
								   + vo.getTitle() +  ", " 
								   + vo.getWriter() +  ", " 
								   + vo.getContent()+"\n");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});

		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(119, 136, 153));
		btnReset.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		btnReset.setBounds(197, 470, 175, 30);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNo.setText(null);
				tfTitle.setText(null);
				taCon.setText(null);
				tfWriter.setText(null);
				taAll.setText(null);
			}
		});

		getContentPane().add(btnRAll);
		getContentPane().add(lbNo);
		getContentPane().add(tfNo);
		getContentPane().add(lbTitle);
		getContentPane().add(tfTitle);
		getContentPane().add(lbCon);
		getContentPane().add(taCon);
		getContentPane().add(lbWriter);
		getContentPane().add(tfWriter);
		getContentPane().add(btnC);
		getContentPane().add(btnR);
		getContentPane().add(btnU);
		getContentPane().add(btnD);
		getContentPane().add(btnReset);
		getContentPane().add(taAll);

		getContentPane().setLayout(null);

		setSize(750, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
