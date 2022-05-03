package co.yong.notice.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yong.notice.dao.DataSource;
import co.yong.notice.service.NoticeService;
import co.yong.notice.service.NoticeVO;

public class NoticeSerivceImpl implements NoticeService {

	private DataSource dao = DataSource.getInstance();
	private Connection conn;// = dao.getConnection();

	private PreparedStatement psmt; // 실행시키고 결과를 받아올 때 쓰인다.
	private ResultSet rs;

	@Override
	public List<NoticeVO> noticeSelectList() {
		// 전체조회
		List<NoticeVO> list = new ArrayList<NoticeVO>();
		NoticeVO vo;
		String sql = "SELECT * FROM NOTICE";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new NoticeVO();
				vo.setId(rs.getInt("id"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setWdate(rs.getDate("wdate"));
				vo.setHit(rs.getInt("hit"));
				list.add(vo);
				hitUpdate(vo.getId());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
		close();
		}
		return list;
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		// 글 세부 조회(한개의 공지사항을 읽음)
		String sql = "SELECT * FROM NOTICE WHERE ID = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getId()); // 물음표에 담는 거
			rs = psmt.executeQuery();
			if (rs.next()) {
				vo = new NoticeVO();
				vo.setId(rs.getInt("id"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setSubject(rs.getString("subject"));
				vo.setWdate(rs.getDate("wdate"));
				vo.setHit(rs.getInt("hit"));
				
				hitUpdate(vo.getId());//조회수 증가
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return vo;
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		//추가
		int n = 0;
		
		String sql = "INSERT INTO NOTICE VALUES(B_ID.NEXTVAL,?,?,?,SYSDATE,0)";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1,vo.getWriter());
			psmt.setString(2,vo.getTitle());
			psmt.setString(3,vo.getSubject());
			n = psmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		int n = 0;
		String sql = "UPDATE NOTICE SET WRITER = ?, TITLE = ?, SUBJECT = ? WHERE ID = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,vo.getWriter());
			psmt.setString(2,vo.getTitle());
			psmt.setString(3,vo.getSubject());
			psmt.setInt(4,vo.getId());
			
			n= psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		int n =0;
		String sql = "DELET FROM NOTICE WHERE ID = ?";
		
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getId());
			n = psmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return n;
	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		//조회수증가
		private void hitUpdate(int id){
			String sql = "UPDATE NOTICE SET HIT = HIT + 1 WHERE ID = ?";
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, id);
				psmt.execute();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	
}
