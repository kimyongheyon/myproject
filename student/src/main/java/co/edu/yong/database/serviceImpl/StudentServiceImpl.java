package co.edu.yong.database.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.yong.database.dao.DataSource;
import co.edu.yong.database.dto.StudentVO;
import co.edu.yong.database.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private DataSource dataSource = DataSource.getInstance();
	private Connection conn = dataSource.getConnection();// connection을 연결
	private PreparedStatement psmt;  // sql명령실행
	private ResultSet rs; //select 결과를 담음
	
	@Override
	public List<StudentVO> selectListStudent() {
		//전체 학생 목록 가져오기
		List<StudentVO> students = new ArrayList<StudentVO>();
		StudentVO student;
		String sql = "SELECT * FROM STUDENT";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); //sql을 실행하고 결과를 담음
			while(rs.next()) {
				
				student = new StudentVO(); //초기화를 먼저 시키고
				student.setStudent_id(rs.getString("student_id")); //값들을 담아주고
				student.setName(rs.getString("name"));
				student.setBirthday(rs.getDate("birthday"));
				student.setMajor(rs.getString("major"));
				student.setAddress(rs.getString("address"));
				student.setTel(rs.getString("tel"));
				students.add(student); //리스트에 추가해준다
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public StudentVO selectStudent(StudentVO student) {
		//한명조회
		StudentVO vo =new StudentVO();
		String sql = "select * from student where student_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, student.getStudent_id());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setStudent_id(rs.getString("student_id"));
				vo.setName(rs.getString("name"));
				vo.setBirthday(rs.getDate("birthday"));
				vo.setMajor(rs.getString("major"));
				vo.setAddress(rs.getString("address"));
				vo.setTel(rs.getString("tel"));
			
			}
			
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public int insertStudent(StudentVO student) {
		int n =0;
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, student.getStudent_id());
			psmt.setString(2, student.getName());
			psmt.setDate(3, student.getBirthday());
			psmt.setString(4, student.getMajor());
			psmt.setString(5, student.getAddress());
			psmt.setString(6, student.getTel());
			n = psmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int updateStudent(StudentVO student) {
		int n = 0;
		String sql = "UPDATE STUDENT SET MAJOR = ?, ADDRESS = ?,"
				     + " TEL = ? WHERE STUDENT_ID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, student.getMajor());
			psmt.setString(2, student.getAddress());
			psmt.setString(3, student.getTel());
			psmt.setString(4, student.getStudent_id());
			
			n = psmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return n;
	}

	@Override
	public int deleteStudent(StudentVO student) {
		
		int n = 0;
		String  sql = "DELET FROM STUDENT WHERE STUDET_ID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, student.getStudent_id());
			n= psmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return n;
	}

}
