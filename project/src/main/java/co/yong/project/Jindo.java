package co.yong.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import co.yong.project.service.DogGameService;
import co.yong.project.service.DogSabiltyVO;
import co.yong.project.service.DogShopVO;
import co.yong.project.serviceImpl.DogGameServiceImpl;

public class Jindo {

	Scanner scn = new  Scanner(System.in);
	public void jindoMain() {
		jindodogTitle();
	}
	
	private void jindodogTitle() {
		DogGameService dogGame = new DogGameServiceImpl();
		DogSabiltyVO dogsabilty = new DogSabiltyVO();
		while (true) {
			System.out.println("1.놀아주기 | 2.산책하기 | 3.씻겨주기 | 4.밥 먹이기 5.상점가기 6.상태확인 | 7.돌아가기");
			int chose = Integer.parseInt(scn.nextLine());
			if (chose == 1) {
				System.out.println("당신은 놀아주기를 선택했습니다.");
			} else if (chose == 2) {
				System.out.println("당신은 산책하기를 선택했습니다.");
			} else if (chose == 3) {
				System.out.println("당신은 삭책하기를 선택했습니다.");
			} else if (chose == 4) {
				System.out.println("당신은 밥 먹이기를 선택했습니다.");
			} else if (chose == 5) {
				System.out.println("당신은 상점 가기를 선택했습니다.");
				shop();

			} else if (chose == 6) {
				System.out.println("당신은 강아지 상태를 확인하기를 원합니다.");
				dogsabilty.setDname("진돗개");
				dogsabilty = dogGame.dSabiltySelect(dogsabilty);
				dogsabilty.toString();

			} else if (chose == 7) {
				break;
			}
		}
	}
	
	
	
	
	private void shop() {
		DogGameService dogGame = new DogGameServiceImpl();
		List<DogShopVO> list = new ArrayList<DogShopVO>();
		list = dogGame.dShopSelectList();
		System.out.println("안녕하세요 상점입니다.");
		for (DogShopVO vo : list) {
			vo.toString();
		}

	}

 private void timer() {
	Timer m_timer = new Timer();
	TimerTask m_task = new TimerTask() {
		public void run() {
			
			System.out.println("다음날 아침이 밝았습니다");
			System.out.println("전체적으로 강아지 스탯이 낮아졌습니다");
			
		}
	};
	m_timer.schedule(m_task,60*3000);
	}
	
}
