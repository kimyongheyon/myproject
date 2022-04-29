package co.edu.yong.database.service;

import java.util.List;

import co.edu.yong.database.dto.StudentVO;

public interface StudentService {

	//crud
	List<StudentVO> selectListStudent(); //전체 학생목록
	StudentVO selectStudent(StudentVO student); //한명에 정보를 조회하겠다는 의미
	int insertStudent(StudentVO student); //한명 추가
	int updateStudent(StudentVO student); //한명 수정
	int deleteStudent(StudentVO student); //한명 삭제
	
	
}
