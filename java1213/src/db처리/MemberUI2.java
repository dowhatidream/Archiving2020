package db√≥∏Æ;

import javax.swing.JOptionPane;

public class MemberUI2 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("ID");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPw(pw);
		vo.setName(name);
		vo.setTel(tel);
		
		MemberDAO dao = new MemberDAO();
		dao.create(vo);
	}

}
