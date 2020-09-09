package db처리;

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
		// 가방을 넣는 컨테이너 역할을 하게 됨
		// <>안에는 컨테이너에 무엇을 넣을지 지정!
		ArrayList<BbsVO> bbsList = new ArrayList<BbsVO>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "SELECT * FROM bbs ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BbsVO vo = new BbsVO(); // 여러번 만들어야 하니까 while문 안으로 넣기
				String no2 = rs.getString("no");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");

				vo.setNo(Integer.valueOf(no2)); // dto에 set
				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(writer);
				
				bbsList.add(vo); // vo 묶어서 리스트
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
