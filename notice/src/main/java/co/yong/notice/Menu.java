package co.yong.notice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.yong.notice.service.NoticeService;
import co.yong.notice.service.NoticeVO;
import co.yong.notice.serviceImpl.NoticeSerivceImpl;

public class Menu {

	private Scanner scn = new Scanner(System.in);

	private void mainTitle() {
		System.out.println("==============================");
		System.out.println("1.학생관리 2.공지사항 3.종료");
		System.out.println("==============================");

	}

	private void studentTitle() {
		System.out.println("=====================================================================================");
		System.out.println("1.전체학생 조회 | 2.한 학생 조회 | 3.학생등록 | 4.학생삭제 | 5.학생수정 | 6.돌아가기");
		System.out.println("=====================================================================================");

	}

	private void noticeTitle() {
		System.out.println("==================================================================================================");
		System.out.println("1.공지사항목록 | 2.공지사항조회 | 3.공지사항등록 | 4.공지사항수정 | 5.공지사항삭제 | 6.돌아가기");
		System.out.println("==================================================================================================");
	}

	public void mainMenu() {	
		while(true){
			mainTitle();
			System.out.println("선택>>>");
			int chose = Integer.parseInt(scn.nextLine());
			if(chose == 1) {
				mainStudetnMenu();
			}
			else if(chose == 2) {
				mainNoticeMenu();
			}
			else if(chose == 3) {
				break;
			}
		}
		
	}
		private void mainStudetnMenu() {
			while(true) {
				studentTitle();
				System.out.println("선택>>>");
				int chose = Integer.parseInt(scn.nextLine());
				if(chose == 1) {
					System.out.println("전체학생을 조회합니다.");
					
				}
				else if(chose == 2) {
					System.out.println("한 학생을 조회합니다.");
				}
				else if(chose == 3) {
					System.out.println("등록할 학생에 정보를 입력하시오");
				}
				else if(chose == 4) {
					System.out.println("삭제할 학생에 학번을 입력하시오");
				}
			else if(chose == 5) {
				System.out.println("수정할 학생에 학번을 입력하시오");
			}
			else if(chose == 6) {
				System.out.println("돌아가기.");
				break;
			}
			}
		}
		private void mainNoticeMenu() {
			while(true){
				NoticeService notice = new NoticeSerivceImpl();
				List<NoticeVO> list = new ArrayList<NoticeVO>();
				list = notice.noticeSelectList();
			noticeTitle();
			System.out.println("선택>>>");
			int chose = Integer.parseInt(scn.nextLine());
			if(chose == 1) {
				NoticeVO notice1 = new NoticeVO();
				System.out.println("공지목록 입니다.");
				for(NoticeVO vo : list) {
					vo.toString();
				}
			}
			else if(chose == 2) {
				NoticeVO notice1 = new NoticeVO();
				System.out.println("보실 공지사항 번호를 입력하시오");
				int num = Integer.parseInt(scn.nextLine());
				notice1.setId(num);
				notice1 = notice.noticeSelect(notice1);
				notice1.toString();
			}
			else if(chose == 3) {
				NoticeVO notice1 = new NoticeVO();
				System.out.println("작성자를 입력");
				String num = scn.nextLine();
				notice1.setWriter(num);
				System.out.println("제목을 입력");
				String num1 = scn.nextLine();
				notice1.setWriter(num1);
				System.out.println("내용을 입력");
				String num2 = scn.nextLine();
				notice1.setWriter(num2);
				int n = notice.noticeInsert(notice1);
				if(n != 0) {
					System.out.println("정상적으로 입력되었습니다.");
				}
				else {
					System.out.println("입력이 실패했씁니다.");
				}



				
				
			}
			else if(chose == 4) {
				System.out.println("수정할 공지 번호를 입력하시오");
			}
		else if(chose == 5) {
			System.out.println("삭제할 공지 번호를 입력하시오");
		}
		else if(chose == 6) {
			System.out.println("돌아가기.");
			break;
		}
		}
		}
		}

