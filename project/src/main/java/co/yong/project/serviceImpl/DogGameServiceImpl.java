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
import co.yong.project.service.MonsterVO;
import co.yong.project.service.User_infoVO;

public class DogGameServiceImpl implements DogGameService {
	private DataSource dao = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
//===========================================================================================================전체 검색==================================

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
				vo.setBravery(rs.getInt("bravery"));
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
	public List<User_infoVO> userSelectList() {
		List<User_infoVO> list = new ArrayList<User_infoVO>();
		User_infoVO vo;
		String sql = "SELECT * FROM USER_INFO";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new User_infoVO();
				vo.setUser_name(rs.getString("user_name"));
				vo.setUser_money(rs.getLong("user_money"));
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
	public List<MonsterVO> monsterList() {
		List<MonsterVO> list = new ArrayList<MonsterVO>();
		MonsterVO vo;
		String sql = "SELECT * FROM MONSTER ";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new MonsterVO();
				vo.setMonster_num(rs.getInt("monster_num"));
				vo.setMonster_name(rs.getString("monster_name"));
				vo.setMonster_drop_money(rs.getLong("monster_drop_money"));
				vo.setMonster_bravery(rs.getInt("monster_bravery"));
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
		

	
	
//==================================================================================================================부분 검색==========================	

	@Override
	public DogSabiltyVO dSabiltySelect(String  name) {
		String sql = "SELECT * FROM DOGSABILITY WHERE USER_NAME = ?";
		DogSabiltyVO vo = new DogSabiltyVO();
		try {
			conn=dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,name);
			rs  =psmt.executeQuery();
			if(rs.next()) {
				vo.setDname(rs.getString("dname"));
				vo.setHappy(rs.getInt("happy"));
				vo.setStress(rs.getInt("stress"));
				vo.setFull(rs.getInt("full"));
				vo.setHealth(rs.getInt("health"));
				vo.setCleanliness(rs.getInt("cleanliness"));
				vo.setBravery(rs.getInt("bravery"));
				vo.setUser_name(rs.getString("user_name"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return vo;
	}

	
	@Override
	public User_infoVO userSelect(User_infoVO vo) {
		String sql = "SELECT * FROM USER_INFO WHERE USER_NAME = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,vo.getUser_name());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo = new User_infoVO();
				vo.setUser_name(rs.getString("user_name"));
				vo.setUser_money(rs.getLong("user_money"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return vo;
	}
	
	@Override
	public DogShopVO dshopSelect(DogShopVO vo) {
		String sql = "SELECT * FROM SHOP WHERE NAME = ?";
		try {
			conn=dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,vo.getName());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo = new DogShopVO();
				vo.setName(rs.getString("name"));
				vo.setAbility(rs.getString("ability"));
				vo.setCount(rs.getInt("count"));
				vo.setPrice(rs.getInt("price"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return vo;
	}


	@Override
	public DogShopVO shopabilityselect(DogShopVO vo) {
		
		String sql = "SELECT * FROM SHOP WHERE NAME = ?";
		try {
			conn=dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,vo.getName());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo = new DogShopVO();
				vo.setName(rs.getString("name"));
				vo.setHappy(rs.getInt("happy"));
				vo.setStress(rs.getInt("stress"));
				vo.setFull(rs.getInt("full"));
				vo.setHealth(rs.getInt("health"));
				vo.setCleanliness(rs.getInt("cleanliness"));
				vo.setBravery(rs.getInt("bravery"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return vo;
	}
		
	@Override
	public MonsterVO monsterselect(MonsterVO vo) {

		String sql = "select * from monster where monster_num = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getMonster_num());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo = new MonsterVO();
				vo.setMonster_num(rs.getInt("monster_num"));
				vo.setMonster_name(rs.getString("monster_name"));
				vo.setMonster_drop_money(rs.getLong("monster_drop_money"));
				vo.setMonster_bravery(rs.getInt("monster_bravery"));
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		
		return vo;
	}
	



	
//======================================================================================================================추가============================


	@Override
	public int userInsert(User_infoVO vo) {
		int n = 0;
		String sql = "INSERT INTO USER_INFO VALUES(?,?)";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1,vo.getUser_name());
			psmt.setLong(2, vo.getUser_money());
			n = psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return n;
	}
	
	@Override
	public int dogInsert(DogSabiltyVO vo) {
		int n =0;
		String sql = "INSERT INTO DOGSABILITY VALUES(?,?,?,?,?,?,?,?)";
		try {
			conn =dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getDname());
			psmt.setInt(2,vo.getHappy());
			psmt.setInt(3,vo.getStress());
			psmt.setInt(4, vo.getHealth());
			psmt.setInt(5,vo.getFull());
			psmt.setInt(6,vo.getCleanliness());
			psmt.setString(7, vo.getUser_name());
			psmt.setInt(8, vo.getBravery());
			
			n=psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return n;
	}

	
//======================================================================================================================수정============================
	@Override
	public int dogsabiltyUpdate(DogSabiltyVO vo) {
		int n =0;
		String sql = "UPDATE DOGSABILITY SET HAPPY = ?, STRESS=?, HEALTH = ?, FULL =?, CLEANLINESS = ?, BRAVERY = ?  WHERE DNAME = ?";
		try {
			
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1,vo.getHappy());
			psmt.setInt(2,vo.getStress());
			psmt.setInt(3, vo.getHealth());
			psmt.setInt(4,vo.getFull());
			psmt.setInt(5,vo.getCleanliness());
			psmt.setInt(6, vo.getBravery());
			psmt.setString(7, vo.getDname());
			n = psmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return n;
	}

	@Override
	public int dogshopUpdate(DogShopVO vo) {
		int n =0;
		String sql = "UPDATE SHOP SET COUNT = ? WHERE NAME = ?";
		try {
		conn = dao.getConnection();
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1,vo.getCount());
		psmt.setString(2,vo.getName());
		n = psmt.executeUpdate();
		}catch(Exception e ) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		return n;
	}
	
	
	@Override
	public int userUpdate(User_infoVO vo) {
		int n =0;
		String sql = "UPDATE USER_INFO SET  USER_MONEY = ? where  user_name = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setLong(1,vo.getUser_money());
			psmt.setString(2,vo.getUser_name());
			n = psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			close();
		}
		return n;
	}

	
	
//============================================================================================================삭제======================================


	@Override
	public int userdelete(User_infoVO vo) {
		int n = 0;
		String sql = "DELETE FROM USER_INFO WHERE USER_NAME = ? ";
		
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUser_name());
			n = psmt.executeUpdate();
		}catch(Exception e) {
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

	




	





}