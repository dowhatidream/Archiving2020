package db처리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	public void create(String id, String pw, String name, String tel) {
		try {
			String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=Asia/Seoul&useSSL=false";
			String user = "root";
			String password = "1234";

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "INSERT INTO member VALUES (?, ?, ?, ?) ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setNString(1, id);
			ps.setNString(2, pw);
			ps.setNString(3, name);
			ps.setNString(4, tel);
			ps.executeUpdate();
			System.out.println("[CREATE] completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int read(String id) throws Exception {
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

	public void update(String tel, String id) {
		try {
			String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=Asia/Seoul&useSSL=false";
			String user = "root";
			String password = "1234";

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "UPDATE member SET tel=? WHERE id=? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setNString(1, tel);
			ps.setNString(2, id);
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

			ps.setNString(1, id);

			ps.executeUpdate();
			System.out.println("[DELETE] completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
