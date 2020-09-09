package db처리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	public void create(MemberVO vo) {
		try {
			String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=Asia/Seoul&useSSL=false/useUnicode=true&characterEncoding=utf8";
			String user = "root";
			String password = "1234";

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "INSERT INTO member VALUES (?, ?, ?, ?) ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPw());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getTel());
			ps.executeUpdate();
			System.out.println("[CREATE] completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public MemberVO read(String id) throws Exception {
		String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=Asia/Seoul&useSSL=false";
		String user = "root";
		String password = "1234";

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, user, password);

		String sql = "SELECT * FROM member WHERE id=? ";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);

		ResultSet rs = ps.executeQuery();

		MemberVO vo = new MemberVO();
		
		if (rs.next()) {
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			
			vo.setId(id2);
			vo.setPw(pw);
			vo.setName(name);
			vo.setTel(tel);
			
			System.out.println("{" + id2 + "," + pw + "," + name + "," + tel + "}");
		} else {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}

		System.out.println("[READ] completed.");

		return vo;
	}

	public void update(String tel, String id) {
		try {
			String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=Asia/Seoul&useSSL=false";
			String user = "root";
			String password = "1234";

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "UPDATE member SET tel=? WHERE id=? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, tel);
			ps.setString(2, id);
			ps.executeUpdate();
			System.out.println("[UPDATE] completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(String id) {
		try {
			String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=Asia/Seoul&useSSL=false";
			String user = "root";
			String password = "1234";

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "DELETE FROM member WHERE id=? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, id);

			ps.executeUpdate();
			System.out.println("[DELETE] completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// login
	public boolean login(String id, String pw) throws Exception {
		String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=Asia/Seoul&useSSL=false";
		String user = "root";
		String password = "1234";

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, user, password);

		String sql = "SELECT * FROM member WHERE id=? AND pw=?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);
		ps.setString(2, pw);

		ResultSet rs = ps.executeQuery();

		boolean result = false; // login failed.
		if (rs.next()) {
			result = true; // 있음
			System.out.println("login successfully.");
		} else {
			System.out.println("login failed.");
		}

		System.out.println("[READ] completed.");

		return result; // 여기서 바로 String[]로 넘기면 메모리 낭비가 심해짐. DTO 필요
	}
	
	// id 중복체크
	public int checkId(String id) throws Exception { 
		String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=Asia/Seoul&useSSL=false";
		String user = "root";
		String password = "1234";

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, user, password);

		String sql = "SELECT * FROM member WHERE id=? ";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);

		ResultSet rs = ps.executeQuery();

		int result = 0;
		if (rs.next()) {
			result = 1; // 있음

			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");

			System.out.println("검색 결과가 존재합니다.");
			System.out.println("{" + id2 + "," + pw + "," + name + "," + tel + "}");
		} else {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}

		System.out.println("[READ] completed.");

		return result; // 여기서 바로 String[]로 넘기면 메모리 낭비가 심해짐
	}
}
