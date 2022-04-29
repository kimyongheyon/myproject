package co.edu.yong.database;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import co.edu.yong.database.dto.StudentVO;
import co.edu.yong.database.service.StudentService;
import co.edu.yong.database.serviceImpl.StudentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	
//
    	StudentService dao = new StudentServiceImpl();
    	List<StudentVO> list = new ArrayList<StudentVO>();
    	list= dao.selectListStudent();
    	
   	for(StudentVO vo : list) {
   		vo.toString();
   		}
//    	System.out.println("===================================");
//    	StudentVO student = new StudentVO();
//    	student.setStudent_id("9986");
//    	student = dao.selectStudent(student);
//    	student.toString();
//    	
//    	StudentVO vo = new StudentVO();
//    	vo.setStudent_id("6666"); 
//    	vo.setName("김승리");
//    	vo.setBirthday(Date.valueOf("2000-01-01")); //문자열을 날짜 타입으로 바꾸는 거
//        vo.setMajor("경영학과");
//        vo.setAddress("대구광역시 이곡동");
//        vo.setTel("010-8884-4685");
//        int n = dao.insertStudent(vo);
//        if( n != 0) {
//        	System.out.println("정상적으로 입력이 되었습니다.");
//        }else {
//        	System.out.println("입력이 실패 했습니다.");
//        }
    	
    }
}
//procedure == java(void)
//function == return value