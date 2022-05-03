package co.yong.notice;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import co.yong.notice.service.NoticeService;
import co.yong.notice.service.NoticeVO;
import co.yong.notice.serviceImpl.NoticeSerivceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	Menu menu = new Menu();
    	menu.mainMenu();
    	
//    	NoticeService noticeDao = new NoticeSerivceImpl();
//    	List<NoticeVO> nlist = new ArrayList<NoticeVO>();
//    	nlist = noticeDao.noticeSelectList();
//    	
//    	for(NoticeVO nvo : nlist) {
//    		nvo.toString();
//    	}
////    		
//		NoticeVO notice = new StudentVO();
//
//		student.setStudent_id("9986");
//		student = dao.selectStudent(student);
//		student.toString();
    	
    	
    }
}
