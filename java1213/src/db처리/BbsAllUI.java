package db√≥∏Æ;

import java.util.ArrayList;

public class BbsAllUI {

	public static void main(String[] args) {
		BbsDAO dao = new BbsDAO();
		ArrayList<BbsVO> bbsList = dao.read();

		for (int i = 0; i < bbsList.size(); i++) {
			BbsVO vo = bbsList.get(i);
			System.out.println("no: " + vo.getNo());
			System.out.println("title: " + vo.getTitle());
			System.out.println("writer: " + vo.getWriter());
			System.out.println("con: " + vo.getContent());
			System.out.println();
		}

	}

}
