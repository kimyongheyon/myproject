package co.yong.project.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yong.project.dao.DataSource;
import co.yong.project.service.DogGameService;
import co.yong.project.service.DogKindVO;
import co.yong.project.service.DogSabiltyVO;
import co.yong.project.service.DogShopVO;

public class DogGameServiceImpl implements DogGameService {
	private DataSource dao = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	@Override
	public List<DogKindVO> dkindSelectList() {
		List<DogKindVO> list = new ArrayList<DogKindVO>();
		DogKindVO vo;
		String sql = "SELECT * FROM DOGKIND";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new DogKindVO();
				vo.setDname(rs.getString("dname"));
				vo.setDage(rs.getInt("dage"));
				vo.setDcharacter(rs.getString("dcharacter"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	@Override
	public List<DogSabiltyVO> dSabiltySelectList() {
		List<DogSabiltyVO> list = new ArrayList<DogSabiltyVO>();
		DogSabiltyVO vo;
		String sql = "SELECT * FROM DOGSABILTY";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new DogSabiltyVO();
				vo.setDname(rs.getString("dname"));
				vo.setHappy(rs.getInt("happy"));
				vo.setHealth(rs.getInt("health"));
				vo.setFull(rs.getInt("full"));
				vo.setStress(rs.getInt("stress"));
				vo.setCleanliness(rs.getInt("cleanliness"));
				list.add(vo);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return list;
	}

	@Override
	public List<DogShopVO> dShopSelectList() {
		List<DogShopVO> list = new ArrayList<DogShopVO>();
		DogShopVO vo;
		String sql = "SELECT * FROM SHOP";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				
				vo = new DogShopVO();
				vo.setName(rs.getString("name"));
				vo.setAbility(rs.getString("ability"));
				vo.setCount(rs.getInt("count"));
				vo.setPrice(rs.getInt("price"));
				list.add(vo);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return list;
	}

	@Override
	public DogKindVO dKindSelect(DogKindVO vo) {
		
		String sql = "SELECT * FROM DOGKIND WHERE DNAME = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getDname());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo = new DogKindVO();
				vo.setDname(rs.getString("dname"));
				vo.setDage(rs.getInt("dage"));
				vo.setDcharacter(rs.getString("dcharacter"));
			}
			
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return vo;
	}

	@Override
	public DogSabiltyVO dSabiltySelect(DogSabiltyVO vo) {
		String sql = "SELECT * FROM DOGSABILITY WHERE DNAME = ?";
		try {
			conn=dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,vo.getDname());
			rs  =psmt.executeQuery();
			if(rs.next()) {
				vo = new DogSabiltyVO();
				vo.setDname(rs.getString("dname"));
				vo.setHappy(rs.getInt("happy"));
				vo.setStress(rs.getInt("stress"));
				vo.setFull(rs.getInt("full"));
				vo.setHealth(rs.getInt("health"));
				vo.setCleanliness(rs.getInt("cleanliness"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	
	@Override
	public int dogsabiltyInsert(DogSabiltyVO vo) {
		return 0;
	}

	@Override
	public int dogshopInsert(DogShopVO vo) {
		return 0;
	}

	@Override
	public int dogsabiltyUpdate(DogSabiltyVO vo) {
		
		
		return 0;
	}

	@Override
	public int dogshopUpdate(DogShopVO vo) {
		return 0;
	}

	@Override
	public int dogsabiltyDelete(DogSabiltyVO vo) {
		return 0;
	}

	@Override
	public int dogshopDelete(DogShopVO vo) {
		return 0;
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

}
