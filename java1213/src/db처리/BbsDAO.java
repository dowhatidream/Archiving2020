package dbó��;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDAO {
	String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=Asia/Seoul&useSSL=false";
	String user = "root";
	String password = "1234";

	public void create(BbsVO vo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "INSERT INTO bbs VALUES (?, ?, ?, ?) ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getNo());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getContent());
			ps.setString(4, vo.getWriter());
			ps.executeUpdate();

			System.out.println("[CREATE] completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<BbsVO> read() {
		// ������ �ִ� �����̳� ������ �ϰ� ��
		// <>�ȿ��� �����̳ʿ� ������ ������ ����!
		ArrayList<BbsVO> bbsList = new ArrayList<BbsVO>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "SELECT * FROM bbs ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BbsVO vo = new BbsVO(); // ������ ������ �ϴϱ� while�� ������ �ֱ�
				String no2 = rs.getString("no");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");

				vo.setNo(Integer.valueOf(no2)); // dto�� set
				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(writer);
				
				bbsList.add(vo); // vo ��� ����Ʈ
			}

			System.out.println("[READ ALL]completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bbsList;
	}

	public BbsVO read(int no) {
		BbsVO vo = new BbsVO();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "SELECT * FROM bbs WHERE no=? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String no2 = rs.getString("no");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");

				vo.setNo(Integer.valueOf(no2));
				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(writer);
			}

			System.out.println("[READ] completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	public void update(BbsVO vo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "UPDATE bbs SET content=? WHERE no=? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getContent());
			ps.setInt(2, vo.getNo());
			ps.executeUpdate();

			System.out.println("[UPDATE] completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(BbsVO vo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "DELETE FROM bbs WHERE no=? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getNo());
			ps.executeUpdate();

			System.out.println("[DELETE] completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
