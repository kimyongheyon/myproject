package co.yong.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import co.yong.project.service.DogGameService;
import co.yong.project.service.DogSabiltyVO;
import co.yong.project.service.DogShopVO;
import co.yong.project.service.InventoryVO;
import co.yong.project.service.MonsterVO;
import co.yong.project.service.User_infoVO;
import co.yong.project.serviceImpl.DogGameServiceImpl;

public class Shepherd {

	Scanner scn = new Scanner(System.in);

	public void shepherdMain() {
		shepherddogTitle();
	}

	
	
	
	
	
	private void shepherddogTitle() {
		Menu MianMenu = new Menu();
		DogGameService dogGame = new DogGameServiceImpl();
		User_infoVO userinfo = new User_infoVO("김용현");
		User_infoVO info2 = dogGame.userSelect(userinfo);
		DogSabiltyVO sabilty = new DogSabiltyVO("셰퍼드");
		DogSabiltyVO sabilty1 = dogGame.dSabiltySelect(sabilty);

		List<InventoryVO> list = new ArrayList<InventoryVO>();
		list = dogGame.invenSelectList();

		MonsterVO monster = new MonsterVO();
		MonsterVO monsterinfo = dogGame.monsterSelect(monster);


		long money = info2.getUser_money();
		int randomVal = 0;
		int randomVal2 = 0;
		int randomVal3 = 0;
		int happy = sabilty1.getHappy(), full = sabilty1.getFull(), cleanliness = sabilty1.getCleanliness(),
				stress = sabilty1.getStress(), health = sabilty1.getHealth();
		while (true) {
			for (int i = 0; i <= 5; i++) {
				randomVal = (int) (Math.random() * 5) + 1;
				randomVal2 = (int) (Math.random() * 3) + 1;
			}
			sleeptime(1000);

			System.out.println("\r\n"
					+ "                         _    _                       _             _             \r\n"
					+ "                        | |  (_)                     | |           (_)            \r\n"
					+ "            __ _   ___ | |_  _   ___   _ __     ___ | |__    ___   _   ___   ___ \r\n"
					+ "            / _` | / __|| __|| | / _ \\ | '_ \\   / __|| '_ \\  / _ \\ | | / __| / _ \\\r\n"
					+ "           | (_| || (__ | |_ | || (_) || | | | | (__ | | | || (_) || || (__ |  __/\r\n"
					+ "            \\__,_| \\___| \\__||_| \\___/ |_| |_|  \\___||_| |_| \\___/ |_| \\___| \\___|\r\n"
					+ "                                                                                  \r\n"
					+ "                                                                                  \r\n"
					+ "           ");
			System.out.println("┌===================================================================================================┐ ");
			System.out.println(); 
			System.out.println("      1.놀아주기  2.산책하기  3.씻겨주기  4.밥 먹이기  5.상점가기  6.상태확인  7.타이머   8.종료      ");
			System.out.println();
			System.out.println("              (╭☞•́⍛•̀)╭☞  정상적인 게임을 위해서는 7.타이머를 누르시고 게임을 즐겨주세요");
			System.out.println();
			System.out.println("└===================================================================================================┘");
			int chose = Integer.parseInt(scn.nextLine());
//===================================================================================================================================================//
			if (chose == 1) { // 놀아주기 구현

				if (randomVal == 2) {
					System.out.println("                       강자지가 갑자기 날뛰기 시작합니다 〣( ºΔº )〣.....");
					System.out.println();
					sleeptime(1000);
					System.out.println("                 날뛰다가....조금에 부상을 입었습니다 놀이를 중단하고 강아지를 봐줘야겠네요 (｡T ω T｡)....");
					System.out.println();
					MianMenu.shepherd_img();
					sleeptime(2000);
					if (happy > 0) {
						sabilty1.setHappy(happy -= randomVal);
					} else {
						sabilty1.setHappy(happy += 5);   //스탯 보정
					}
					if (health > 0) {
						sabilty1.setHealth(health -= randomVal);
					} else {
						sabilty1.setHealth(health += 5);
					}

					if (full > 0) {
						sabilty1.setFull(full -= randomVal);
					} else {
						sabilty1.setFull(full += 5);
					}
					if (cleanliness > 0) {
						sabilty1.setCleanliness(cleanliness += randomVal);
					} else {
						sabilty1.setCleanliness(cleanliness += 5);
					}
					if (stress > 0) {
						sabilty1.setStress(stress += randomVal);
					} else {
						sabilty1.setStress(stress += 5);
					}
					sabilty1.setDname("셰퍼드");
					dogGame.dogsabiltyUpdate(sabilty1);
					sabilty1.toString();
				} else {
					System.out.println("                                 강아지가 아주 신나게 놀고있습니다  (●'◡'●)ﾉ♥");
			
					sleeptime(1000);
					 System.out.println();
					System.out.println("                                 다 놀고 이쪽으로 달려옵니다 ლ(♥0♥ )ლ    ");
					if (happy > 0) {
						sabilty1.setHappy(happy += randomVal);
					}else {
						sabilty1.setHappy(happy += 5);
					}
					if (health > 0) {
						sabilty1.setHealth(health += randomVal);
					} else {
						sabilty1.setHealth(health += 5);
					}
					if (full > 0) {
						sabilty1.setFull(full -= randomVal);
					}else {
						sabilty1.setFull(full += 5);
					}
					if (cleanliness > 0) {
						sabilty1.setCleanliness(cleanliness +=randomVal);
					}else {
						sabilty1.setCleanliness(cleanliness += 5);
					}
					if (stress > 0) {
						sabilty1.setStress(stress -= randomVal);
					} else {
						sabilty1.setStress(stress += 5);
					}
					sabilty1.setDname("셰퍼드");
					dogGame.dogsabiltyUpdate(sabilty1);
					sabilty1.toString();
				}
//===================================================================================================================================================//
			} else if (chose == 2) { // 산책하기 구현
				System.out.println("                                       산책을 하러 밖으로 나왔습니다 ₍₍ (ง ˙ω˙)ว ⁾⁾");
				System.out.println();
				sleeptime(1000);

				if (happy > 0) {
					sabilty1.setHappy(happy += randomVal);
				}else {
					sabilty1.setHappy(happy += 5);
				}
				if (health > 0) {
					sabilty1.setHealth(health);
				}else {
					sabilty1.setHealth(health += 5);
				}
				if (full > 0) {
					sabilty1.setFull(full -= randomVal);
				}else {
					sabilty1.setFull(full += 5);
				}
				if (cleanliness > 0) {
					sabilty1.setCleanliness(cleanliness += randomVal);
				}else {
					sabilty1.setCleanliness(cleanliness += 5);
				}
				if (stress > 0) {
					sabilty1.setStress(stress -= randomVal);
				} else {
					sabilty1.setStress(stress += 5);
				}
				sabilty1.setDname("셰퍼드");
				dogGame.dogsabiltyUpdate(sabilty1);

				if (randomVal == 1) {

					System.out.println("                                    Oh MY GOD 당신의 강아지가 돈을 물어왔습니다 ✧٩(ˊωˋ*)و✧");
					System.out.println();
					sleeptime(1000);
					System.out.println("                                        돈을 들고 집으로 도망갑니다 ~~~~~~((ง ˙ω˙)ว ");
					if (randomVal2 == 1) {
						info2.setUser_money(money += 1000);
						System.out.println("1000원");
					} else if (randomVal2 == 2) {
						info2.setUser_money(money += 2000);
						System.out.println("2000원");
					} else if (randomVal2 == 3) {
						info2.setUser_money(money += 3000);
						System.out.println("3000원");
					}
					info2.setUser_money(money);
					dogGame.userUpdate(info2);
				}

				else {
					
					System.out.println("                                     산책을 끝내고 집으로 돌아갑니다   ｡:˚ ૮ ˶ ˆ ᴥ ˆ ˶ ა ˚ :｡");
				}
				sleeptime(500);
				sabilty1.toString();
			}
//===================================================================================================================================================//
			else if (chose == 3) { // 씻겨주기 구현
				System.out.println("                                강아지를 씻기려 욕실로 갑니다 ~~~~~~((ง ˙ω˙)ว");
				
				sleeptime(1000);
				if (randomVal == 1) {
					System.out.println();
					System.out.println("                            강아지가 목욕을 거부하고 도망갔습니다  (°ㅂ° ╬)");
					System.out.println();
					System.out.println("                                 집이 엉망이 되어있습니다....(ﾉಠдಠ)ﾉ︵┻━┻");
					if (happy > 0) {
						sabilty1.setHappy(happy -=randomVal);
					}else {
						sabilty1.setHappy(happy += 5);
					}
					if (health > 0) {
						sabilty1.setHealth(health -= randomVal);
					}else {
						sabilty1.setHealth(health += 5);
					}
					if (full > 0) {
						sabilty1.setFull(full -= randomVal);
					}else {
						sabilty1.setFull(full += 5);
					}
					if (cleanliness > 0) {
						sabilty1.setCleanliness(cleanliness -= randomVal);
					}else {
						sabilty1.setCleanliness(cleanliness += 5);
					}
					if (stress > 0) {
						sabilty1.setStress(stress += randomVal);
					} else {
						sabilty1.setStress(stress += 5);
					}
					sabilty1.setDname("셰퍼드");
					dogGame.dogsabiltyUpdate(sabilty1);
					sabilty1.toString();
				} else {
					System.out.println();
					System.out.println("                          무사히 강아지 목욕을 끝냈습니다 ⎝̐̈⎛̐̈•̐̈‿̐̈•̐̈⎞̐̈⎠̐̈.");
					if (happy > 0) {
						sabilty1.setHappy(happy += randomVal);
					}else {
						sabilty1.setHappy(happy += 5);
					}
					if (health > 0) {
						sabilty1.setHealth(health += randomVal);
					}else {
						sabilty1.setHealth(health += 5);
					}
					if (full > 0) {
						sabilty1.setFull(full -= randomVal);
					}else {
						sabilty1.setFull(full += 5);
					}
					if (cleanliness > 0) {
						sabilty1.setCleanliness(cleanliness -= randomVal);
					}else {
						sabilty1.setCleanliness(cleanliness += 5);
					}
					if (stress > 0) {
						sabilty1.setStress(stress -= randomVal);
					} else {
						sabilty1.setStress(stress += 5);
					}
					sabilty1.setDname("셰퍼드");
					dogGame.dogsabiltyUpdate(sabilty1);
					sleeptime(1000);
					sabilty1.toString();
				}
//===================================================================================================================================================// 
			} else if (chose == 4) { // 밥 먹이기 구현

				System.out.println("                            강아지 밥을 먹이기 위해서는 500원을 지출합니당 (*´ლ`*)냠냠 ");
				System.out.println();
				sleeptime(1000);
				info2.setUser_money(money-=500);
				if (randomVal == 1) {
					System.out.println("                           강아지가 입맛이 없는지 낑낑거립니다... ＼(º □ º l|l)/");
					System.out.println();
					System.out.println("                                이럴땐 간식이라도 사서 먹이면 좋을 거 같아요!!");
					if (happy > 0) {
						sabilty1.setHappy(happy -= randomVal);
					}else {
						sabilty1.setHappy(happy += 5);
					}
					if (health > 0) {
						sabilty1.setHealth(health -= randomVal);
					}else {
						sabilty1.setHealth(health += 5);
					}
					if (full > 0 ) {
						sabilty1.setFull(full);
					}else {
						sabilty1.setFull(full += 5);
					}
					if (cleanliness > 0) {
						sabilty1.setCleanliness(cleanliness += randomVal);
					}else {
						sabilty1.setCleanliness(cleanliness += 5);
					}
					if (stress > 0) {
						sabilty1.setStress(stress += randomVal);
					} else {
						sabilty1.setStress(stress += 5);
					}
					sabilty1.setDname("셰퍼드");
					dogGame.dogsabiltyUpdate(sabilty1);
					sabilty1.toString();
				} else {
					System.out.println("                                  배가 고팠는지 아주 잘 먹습니다!! ૮ฅ・ﻌ・აฅ");
					if (happy >1 ) {
						sabilty1.setHappy(happy += randomVal);
					}else {
						sabilty1.setHappy(happy += 5);
					}
					if (health > 1) {
						sabilty1.setHealth(health+=randomVal);
					}else {
						sabilty1.setHealth(health += 5);
					}
					if (full > 1) {
						sabilty1.setFull(full -= randomVal);
					}else {
						sabilty1.setFull(full += 5);
					}
					if (cleanliness > 0 ) {
						sabilty1.setCleanliness(cleanliness += randomVal);
					}else {
						sabilty1.setCleanliness(cleanliness += 5);
					}
					if (stress > 0) {
						sabilty1.setStress(stress -= randomVal);
					} else {
						sabilty1.setStress(stress += 5);
					}
					sabilty1.setDname("셰퍼드");
					dogGame.dogsabiltyUpdate(sabilty1);
					sleeptime(1000);
					sabilty1.toString();

				}
			}
//===================================================================================================================================================//
			else if (chose == 5) { // 상점 구현
				System.out.println("                      안녕하세요 반갑습니다 천천히 둘러보세요 ๑•‿•๑");
				sleeptime(500);
				shop();
				System.out.println();
				System.out.println("                           원하시는 물건에 이름을 입력세요");
				String name = scn.nextLine();
				DogShopVO shop = new DogShopVO(name);
				DogShopVO shop1 = dogGame.dshopSelect(shop);
				long price = shop1.getPrice();
				shop.setName(name);
				System.out.println("              "+name + ":" + price + "₩을/를 구입하시겠습니가? 1.예, 2.아니오");
				int menu = Integer.parseInt(scn.nextLine());
				if (menu == 1) {
					int count = shop1.getCount();
					if (info2.getUser_money() >= shop1.getPrice()) {
						System.out.println("물건을 구매하셨습니다.");
						shop1.setCount(count -= 1);
						shop1.setName(name);
						dogGame.dogshopUpdate(shop1);
						sleeptime(500);
						shop1.toString();
						money -= price;
						info2.setUser_money(money);
						dogGame.userUpdate(info2);
						System.out.println("                      이용해주셔서 감사합니당 (●'◡'●)ﾉ♥");

						System.out.println("                   "+sabilty1.getDname()+"의 능력치가 올랐습니다.");

					} else {
						System.out.println("                  소지금이 부족하여 구매가 불가능합니다  ㄴ（°□。）ㄱ   ");
					}
				}
//===================================================================================================================================================//
			} else if (chose == 6) { // 상태 확인창 구현
				System.out.println("1. 강아지 상태창 | 2.자신의 상태창");
				int num = Integer.parseInt(scn.nextLine());
				if (num == 1) {
					
					System.out.println("                             당신의 강아지 상태창 입니다 ◤◡ᴥ◡◥ ");
					sabilty1.toString();
				} 
				else if (num == 2) {
					System.out.println("                                        이름을 입력하시오 ");
					String name = scn.nextLine();
					System.out.println();
					System.out.println("                                       당신의 상태창입니다.");
					userinfo.setUser_name(name);
					sleeptime(500);
					System.out.println();
					info2.toString();
				}
			} else if (chose == 7) {
				
				System.out.println("                             이제부터 게임시간이 적용되었습니다⏳");
		Timer m_timer = new Timer();
		TimerTask m_task = new TimerTask() {
			public void run() {
				int randomVal = 0;
				int happy = sabilty1.getHappy(), full = sabilty1.getFull(), cleanliness = sabilty1.getCleanliness(),
				stress = sabilty1.getStress(), health = sabilty1.getHealth();
				for (int i = 0; i <= 5; i++) {
					randomVal = (int) (Math.random() * 5) + 1;
				}
				System.out.println("                    다음날 아침이 밝았습니다");
				sleeptime(1000);
				System.out.println();
				System.out.println("                  \\     (      /\r\n"
						+ "                `.    \\     )    /    .'\r\n"
						+ "                  `.   \\   (    /   .'\r\n"
						+ "                    `.  .-''''-.  .'\r\n"
						+ "              `~._    .'/_    _\\`.    _.~'\r\n"
						+ "                  `~ /  / \\  / \\  \\ ~'\r\n"
						+ "             _ _ _ _|  _\\O/  \\O/_  |_ _ _ _\r\n"
						+ "                    | (_)  /\\  (_) |\r\n"
						+ "                 _.~ \\  \\      /  / ~._\r\n"
						+ "              .~'     `. `.__.' .'     `~.\r\n"
						+ "                    .'  `-,,,,-'  `.\r\n"
						+ "                  .'   /    )   \\   `.\r\n"
						+ "                .'    /    (     \\    `.\r\n"
						+ "                     /      )     \\        \r\n"
						+ "                           (");
				System.out.println("전체적으로 강아지 스탯이 낮아졌습니다");
				if (happy > 0) {
					sabilty1.setHappy(happy -= randomVal);
				}else {
					sabilty1.setHappy(happy += 5);
				}
				if (health > 0) {
					sabilty1.setHealth(health -= randomVal);
				}else {
					sabilty1.setHealth(health -= 5);
				}
				if (full > 0) {
					sabilty1.setFull(full -= randomVal);
				}else {
					sabilty1.setFull(full += 5);
				}
				if (cleanliness > 0) {
					sabilty1.setCleanliness(cleanliness -= randomVal);
				}else {
					sabilty1.setCleanliness(cleanliness += 5);
				}
				if (stress > 0) {
					sabilty1.setStress(stress -= randomVal);
				} else {
					sabilty1.setStress(stress += 5);
				}
				dogGame.dogsabiltyUpdate(sabilty1);
				sabilty1.setDname("셰퍼드");
				sabilty1.toString();
				System.out.println();
				sleeptime(500);
				System.out.println("\r\n"
						+ "                         _    _                       _             _             \r\n"
						+ "                        | |  (_)                     | |           (_)            \r\n"
						+ "            __ _   ___ | |_  _   ___   _ __     ___ | |__    ___   _   ___   ___ \r\n"
						+ "            / _` | / __|| __|| | / _ \\ | '_ \\   / __|| '_ \\  / _ \\ | | / __| / _ \\\r\n"
						+ "           | (_| || (__ | |_ | || (_) || | | | | (__ | | | || (_) || || (__ |  __/\r\n"
						+ "            \\__,_| \\___| \\__||_| \\___/ |_| |_|  \\___||_| |_| \\___/ |_| \\___| \\___|\r\n"
						+ "                                                                                  \r\n"
						+ "                                                                                  \r\n"
						+ "           ");
				System.out.println("┌===================================================================================================┐ ");
				System.out.println(); 
				System.out.println("       1.놀아주기  2.산책하기  3.씻겨주기  4.밥 먹이기  5.상점가기  6.상태확인  7.돌아가기 8.종료        ");
				System.out.println();
				System.out.println("└===================================================================================================┘");

				
				
				
			}
		};
		
		m_timer.schedule(m_task,60*3000,60*3000);
			}
			else {
				return;
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

//=====================================================================================================================================================================//	
		
	
	
	public int sleeptime(int sc) {
		try {
			Thread.sleep(sc);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return sc;
	}
	
	private void disease() {
		int random=0;
		DogGameService dogGame = new DogGameServiceImpl();
		DogSabiltyVO sabilty = new DogSabiltyVO("셰퍼드");
		DogSabiltyVO sabilty1 = dogGame.dSabiltySelect(sabilty);
		for(int i =0; i < 10; i++) {
			 random = (int) (Math.random()*10+1);
		}

		if(sabilty1.getStress() == 150 && sabilty1.getCleanliness() == 170 ) {
			if(random == 1) {
				System.out.println("               당신의 강아지가 너무 더럽습니다 이러다 병이라도 걸리겠어요....");
				sleeptime(1000);
				System.out.println("                      이런....강아지가 감기에 걸렸습니다...૮ ◞ ع ◟ ა");
				System.out.println();
				System.out.println("                      상점에서 약이라도 사서 먹일까요?? 1.Yes 2. No");
				
			}
			
		}
	}
	
		
	
}
