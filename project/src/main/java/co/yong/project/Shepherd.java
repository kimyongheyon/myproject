package co.yong.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import co.yong.project.service.DogGameService;
import co.yong.project.service.DogSabiltyVO;
import co.yong.project.service.DogShopVO;
import co.yong.project.service.MonsterVO;
import co.yong.project.service.User_infoVO;
import co.yong.project.serviceImpl.DogGameServiceImpl;

public class Shepherd {

	Scanner scn = new Scanner(System.in);
	boolean run = true;

	public void shepherdMain() {
		shepherddogTitle();
	}

	Menu MianMenu = new Menu();
	DogGameService dogGame = new DogGameServiceImpl();
	DogSabiltyVO sabilty = new DogSabiltyVO();
	List<User_infoVO> list2 = new ArrayList<User_infoVO>();
	List<DogShopVO> list1 = new ArrayList<DogShopVO>();

	private void shepherddogTitle() {

		list1 = dogGame.dShopSelectList();
		System.out.println(
				"                                                          ███████╗███╗   ██╗████████╗███████╗██████╗     ██╗██████╗ \r\n"
						+ "                                                          ██╔════╝████╗  ██║╚══██╔══╝██╔════╝██╔══██╗    ██║██╔══██╗\r\n"
						+ "                                                          █████╗  ██╔██╗ ██║   ██║   █████╗  ██████╔╝    ██║██║  ██║\r\n"
						+ "                                                          ██╔══╝  ██║╚██╗██║   ██║   ██╔══╝  ██╔══██╗    ██║██║  ██║\r\n"
						+ "                                                          ███████╗██║ ╚████║   ██║   ███████╗██║  ██║    ██║██████╔╝\r\n"
						+ "                                                          ╚══════╝╚═╝  ╚═══╝   ╚═╝   ╚══════╝╚═╝  ╚═╝    ╚═╝╚═════╝ \r\n"
						+ "                                                                                                                    \r\n"
						+ "                                                          ");
		System.out.println("입력>>>>>>");
		System.out.printf("\n \n");
		sleeptime(1500);
		String name1 = scn.nextLine();
		DogSabiltyVO sabilty1 = dogGame.dSabiltySelect(name1);
		User_infoVO userinfo = new User_infoVO(name1);
		System.out.printf("\n \n \n \n \n \n \n \n \n \n \n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		User_infoVO info2 = null;
		list2 = dogGame.userSelectList();
		boolean yes = false;

		for (int i = 0; i < list2.size(); i++) {

			if (userinfo.getUser_name().equals(list2.get(i).getUser_name())) {
				info2 = list2.get(i);
				yes = true;
				break;
			} else {
			}
		}

		if (yes == false) {
			System.out.println("존재하지 않는 사용자입니다.");
			return;
		}

		User_infoVO info = dogGame.userSelect(userinfo);
		long money = info.getUser_money();
		int randomVal = 0;
		int randomVal2 = 0;
		int randomVal3 = 0;
		int happy = sabilty1.getHappy(), full = sabilty1.getFull(), cleanliness = sabilty1.getCleanliness(),
				stress = sabilty1.getStress(), health = sabilty1.getHealth(), braverry = sabilty1.getBravery();
		while (run) {
			for (int i = 0; i <= 5; i++) {
				randomVal = (int) (Math.random() * 5) + 1;
				randomVal2 = (int) (Math.random() * 5) + 1;
				randomVal3 = (int) (Math.random() * 6) + 1;
			}
			MonsterVO mon = new MonsterVO(randomVal3);
			MonsterVO monster = dogGame.monsterselect(mon);
			sleeptime(1000);

			System.out.println(
					"                       █████████  █████                                                                                       █████    ███                     \r\n"
							+ "                      ███░░░░░███░░███                                                                                       ░░███    ░░░                      \r\n"
							+ "                     ███     ░░░  ░███████    ██████   ██████   █████   ██████      ██████  ████████       ██████  ████████  ███████  ████   ██████  ████████  \r\n"
							+ "                    ░███          ░███░░███  ███░░███ ███░░███ ███░░   ███░░███    ░░░░░███░░███░░███     ███░░███░░███░░███░░░███░  ░░███  ███░░███░░███░░███ \r\n"
							+ "                    ░███          ░███ ░███ ░███ ░███░███ ░███░░█████ ░███████      ███████ ░███ ░███    ░███ ░███ ░███ ░███  ░███    ░███ ░███ ░███ ░███ ░███ \r\n"
							+ "                    ░░███     ███ ░███ ░███ ░███ ░███░███ ░███ ░░░░███░███░░░      ███░░███ ░███ ░███    ░███ ░███ ░███ ░███  ░███ ███░███ ░███ ░███ ░███ ░███ \r\n"
							+ "                     ░░█████████  ████ █████░░██████ ░░██████  ██████ ░░██████    ░░████████████ █████   ░░██████  ░███████   ░░█████ █████░░██████  ████ █████\r\n"
							+ "                      ░░░░░░░░░  ░░░░ ░░░░░  ░░░░░░   ░░░░░░  ░░░░░░   ░░░░░░      ░░░░░░░░░░░░ ░░░░░     ░░░░░░   ░███░░░     ░░░░░ ░░░░░  ░░░░░░  ░░░░ ░░░░░ \r\n"
							+ "                                                                                                                   ░███                                        \r\n"
							+ "                                                                                                                   █████                                       \r\n"
							+ "                                                                                                                  ░░░░░                                        \r\n"
							+ "                    ");
			System.out.println();
			System.out.println(
					"                                    ┌============================================================================================================┐ ");
			System.out.println();
			System.out.println(
					"                                              1.놀아주기  2.산책하기  3.씻겨주기  4.밥 주기  5.상점  6.상태확인  7.타이머   8.종료      ");
			System.out.println();
			System.out.println(
					"                                                          *정상적인 게임을 위해서는 7.타이머를 누르시고 게임을 즐겨주세요*");
			System.out.println();
			System.out.println(
					"                                    └============================================================================================================┘");
			System.out.println("\n\n\n");

			try {
				int chose = Integer.parseInt(scn.nextLine());

				if (chose == 1) { // 놀아주기 구현

					if (randomVal == 2) {
						System.out.println("                                                                  "
								+ sabilty1.getDname() + "가 갑자기 날뛰기 시작합니다 〣( ºΔº )〣.....");
						System.out.println();
						sleeptime(1000);
						System.out.println(
								"                                                   날뛰다가....조금에 부상을 입었습니다 놀이를 중단하고 강아지를 봐줘야겠네요 (｡T ω T｡)....");
						System.out.println();
						sleeptime(2000);
						if (happy > 0) {
							sabilty1.setHappy(happy -= randomVal);
						} else {
							sabilty1.setHappy(happy += 5); // 스탯 보정
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
							sabilty1.setCleanliness(cleanliness -= randomVal);
						} else {
							sabilty1.setCleanliness(cleanliness += 5);
						}
						if (stress > 0) {
							sabilty1.setStress(stress += randomVal);
						} else {
							sabilty1.setStress(stress += 5);
						}
						dogGame.dogsabiltyUpdate(sabilty1);
						sabilty1.toString();
						objective(sabilty1);
						disease(sabilty1, info);
					} else {
						System.out.println("                                                                       "
								+ sabilty1.getDname() + "가 아주 신나게 놀고있습니다  (●'◡'●)ﾉ♥");

						sleeptime(1000);
						System.out.println();
						System.out.println(
								"                                                                          다 놀고 이쪽으로 달려옵니다 ლ(♥0♥ )ლ    ");
						if (happy > 0) {
							sabilty1.setHappy(happy += randomVal);
						} else {
							sabilty1.setHappy(happy += 5);
						}
						if (health > 0) {
							sabilty1.setHealth(health += randomVal);
						} else {
							sabilty1.setHealth(health += 5);
						}
						if (full > 0) {
							sabilty1.setFull(full -= randomVal);
						} else {
							sabilty1.setFull(full += 5);
						}
						if (cleanliness > 0) {
							sabilty1.setCleanliness(cleanliness -= randomVal);
						} else {
							sabilty1.setCleanliness(cleanliness += 5);
						}
						if (stress > 0) {
							sabilty1.setStress(stress += randomVal);
						} else {
							sabilty1.setStress(stress += 5);
						}

						dogGame.dogsabiltyUpdate(sabilty1);
						sabilty1.toString();
						objective(sabilty1);
						disease(sabilty1, info);
					}
				}

//===================================================================================================================================================//
				else if (chose == 2) { // 산책하기 구현
					System.out.println(
							"                                                                    산책을 하러 밖으로 나왔습니다 ₍₍ (ง ˙ω˙)ว ⁾⁾");

					System.out.println();
					sleeptime(1000);

					if (happy > 0) {
						sabilty1.setHappy(happy += randomVal);
					} else {
						sabilty1.setHappy(happy += 5);
					}
					if (health > 0) {
						sabilty1.setHealth(health);
					} else {
						sabilty1.setHealth(health += 5);
					}
					if (full > 0) {
						sabilty1.setFull(full -= randomVal);
					} else {
						sabilty1.setFull(full += 5);
					}
					if (cleanliness > 0) {
						sabilty1.setCleanliness(cleanliness -= randomVal);
					} else {
						sabilty1.setCleanliness(cleanliness += 5);
					}
					if (stress > 0) {
						sabilty1.setStress(stress -= randomVal);
					} else {
						sabilty1.setStress(stress += 5);
					}
					dogGame.dogsabiltyUpdate(sabilty1);
					objective(sabilty1);
					disease(sabilty1, info);

					if (randomVal == 1) {

						System.out.println(
								"                                                                 Oh MY GOD 당신의 강아지가 돈을 물어왔습니다 ✧٩(ˊωˋ*)و✧");
						System.out.println();
						sleeptime(1000);
						System.out.println(
								"                                                                      돈을 들고 집으로 도망갑니다 ~~~~~~((ง ˙ω˙)ว ");
						if (randomVal2 == 1) {
							info.setUser_money(money += 1000);
							System.out.println("1000원");
						} else if (randomVal2 == 2) {
							info.setUser_money(money += 2000);
							System.out.println("2000원");
						} else if (randomVal2 == 3) {
							info.setUser_money(money += 3000);
							System.out.println("3000원");
						}
						info.setUser_money(money);
						dogGame.userUpdate(info);
						objective(sabilty1);
						disease(sabilty1, info);
					}

					else if (randomVal == 2) {
						System.out.println(
								"                                                                 야생동물이 당신의 강아지에게 전투를 신청했습니다");
						System.out.println();
						System.out.println(
								"                                                                         싸우시겠습니까??? 1.Yes 2.No");
						int num = Integer.parseInt(scn.nextLine());
						if (num == 1) {

							monster.getMonster_num();
							monster.toString();
							if (monster.getMonster_bravery() < sabilty1.getBravery()) {
								sleeptime(1000);
								System.out.println(
										"                                                             ██╗   ██╗██╗ ██████╗████████╗ ██████╗ ██████╗ ██╗   ██╗\r\n"
												+ "                                                             ██║   ██║██║██╔════╝╚══██╔══╝██╔═══██╗██╔══██╗╚██╗ ██╔╝\r\n"
												+ "                                                             ██║   ██║██║██║        ██║   ██║   ██║██████╔╝ ╚████╔╝ \r\n"
												+ "                                                             ╚██╗ ██╔╝██║██║        ██║   ██║   ██║██╔══██╗  ╚██╔╝  \r\n"
												+ "                                                              ╚████╔╝ ██║╚██████╗   ██║   ╚██████╔╝██║  ██║   ██║   \r\n"
												+ "                                                               ╚═══╝  ╚═╝ ╚═════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝   ╚═╝   \r\n"
												+ "                                                                                                                    \r\n"
												+ "                                                             ");
								sleeptime(1000);
								System.out.println(
										"                                                                      *.☆⸜(⑉˙ᗜ˙⑉)⸝♡.*     축하드립니다");
								System.out.println("\n");
								sabilty1.setHappy(happy += 10);
								sabilty1.setFull(full -= 5);
								sabilty1.setBravery(braverry += 10);
								info2.setUser_money(money += monster.getMonster_drop_money());
								objective(sabilty1);
								disease(sabilty1, info);
							} else {
								sleeptime(1000);
								System.out.println(
										"                                                             ██████╗ ███████╗███████╗███████╗ █████╗ ████████╗\r\n"
												+ "                                                             ██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗╚══██╔══╝\r\n"
												+ "                                                             ██║  ██║█████╗  █████╗  █████╗  ███████║   ██║   \r\n"
												+ "                                                             ██║  ██║██╔══╝  ██╔══╝  ██╔══╝  ██╔══██║   ██║   \r\n"
												+ "                                                             ██████╔╝███████╗██║     ███████╗██║  ██║   ██║   \r\n"
												+ "                                                             ╚═════╝ ╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   \r\n"
												+ "                                                                                                              \r\n"
												+ "                                                             ");
								sleeptime(1000);
								sabilty1.setHappy(happy -= 10);
								sabilty1.setFull(full -= 10);
								sabilty1.setHealth(health -= 10);
								sabilty1.setStress(stress += 10);
								sabilty1.setBravery(braverry += 1);
								objective(sabilty1);
								disease(sabilty1, info);
							}

						}
					}

					System.out.println("\n \n ");
					sleeptime(500);
					System.out.println(
							"                                                                산책을 끝내고 집으로 돌아갑니다   ｡:˚ ૮ ˶ ˆ ᴥ ˆ ˶ ა ˚ :｡");
					dogGame.dogsabiltyUpdate(sabilty1);
					sabilty1.toString();
				}
//===================================================================================================================================================//
				else if (chose == 3) { // 씻겨주기 구현
					System.out.println(
							"                                                                    강아지를 씻기려 욕실로 갑니다 ~~~~~~((ง ˙ω˙)ว");

					sleeptime(1000);
					if (randomVal == 1) {
						System.out.println();
						System.out.println(
								"                                                                 강아지가 목욕을 거부하고 도망갔습니다  (°ㅂ° ╬)");
						System.out.println("\n \n");
						sleeptime(1000);
						System.out.println(
								"                                                                   집이 엉망이 되어있습니다....(ﾉಠдಠ)ﾉ︵┻━┻");
						if (happy > 0) {
							sabilty1.setHappy(happy -= randomVal);
						} else {
							sabilty1.setHappy(happy += 5);
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
							sabilty1.setCleanliness(cleanliness -= randomVal);
						} else {
							sabilty1.setCleanliness(cleanliness += 5);
						}
						if (stress > 0) {
							sabilty1.setStress(stress += randomVal);
						} else {
							sabilty1.setStress(stress += 5);
						}
						dogGame.dogsabiltyUpdate(sabilty1);
						sabilty1.toString();
						objective(sabilty1);
						disease(sabilty1, info);
					} else {
						System.out.println();
						System.out.println(
								"                                                                 무사히 강아지 목욕을 끝냈습니다 ⎝̐̈⎛̐̈•̐̈‿̐̈•̐̈⎞̐̈⎠̐̈.");
						if (happy > 0) {
							sabilty1.setHappy(happy += randomVal);
						} else {
							sabilty1.setHappy(happy += 5);
						}
						if (health > 0) {
							sabilty1.setHealth(health += randomVal);
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
							sabilty1.setStress(stress -= randomVal);
						} else {
							sabilty1.setStress(stress += 5);
						}
						dogGame.dogsabiltyUpdate(sabilty1);
						sleeptime(1000);
						sabilty1.toString();
						objective(sabilty1);
						disease(sabilty1, info);
					}
//===================================================================================================================================================// 
				} else if (chose == 4) { // 밥 먹이기 구현

					System.out.println(
							"                                                            강아지 밥을 먹이기 위해서는 500원을 지출합니당 (*´ლ`*)냠냠 ");
					System.out.println();
					sleeptime(1000);
					info2.setUser_money(money -= 500);
					if (randomVal == 1) {
						System.out.println(
								"                                                               강아지가 입맛이 없는지 낑낑거립니다... ＼(º □ º l|l)/");
						System.out.println();
						sleeptime(1000);
						if (happy > 0) {
							sabilty1.setHappy(happy -= randomVal);
						} else {
							sabilty1.setHappy(happy += 5);
						}
						if (health > 0) {
							sabilty1.setHealth(health -= randomVal);
						} else {
							sabilty1.setHealth(health += 5);
						}
						if (full > 0) {
							sabilty1.setFull(full);
						} else {
							sabilty1.setFull(full += 5);
						}
						if (cleanliness > 0) {
							sabilty1.setCleanliness(cleanliness -= randomVal);
						} else {
							sabilty1.setCleanliness(cleanliness += 5);
						}
						if (stress > 0) {
							sabilty1.setStress(stress += randomVal);
						} else {
							sabilty1.setStress(stress += 5);
						}
						sabilty1.setDname(name1);
						dogGame.dogsabiltyUpdate(sabilty1);
						sabilty1.toString();
						objective(sabilty1);
						disease(sabilty1, info);
					} else {
						System.out.println(
								"                                                                     배가 고팠는지 아주 잘 먹습니다!! ૮ฅ・ﻌ・აฅ");
						if (happy > 1) {
							sabilty1.setHappy(happy += randomVal);
						} else {
							sabilty1.setHappy(happy += 5);
						}
						if (health > 1) {
							sabilty1.setHealth(health += randomVal);
						} else {
							sabilty1.setHealth(health += 5);
						}
						if (full > 1) {
							sabilty1.setFull(full -= randomVal);
						} else {
							sabilty1.setFull(full += 5);
						}
						if (cleanliness > 0) {
							sabilty1.setCleanliness(cleanliness -= randomVal);
						} else {
							sabilty1.setCleanliness(cleanliness += 5);
						}
						if (stress > 0) {
							sabilty1.setStress(stress -= randomVal);
						} else {
							sabilty1.setStress(stress += 5);
						}
						sabilty1.setDname(name1);
						dogGame.dogsabiltyUpdate(sabilty1);
						sleeptime(1000);
						sabilty1.toString();
						objective(sabilty1);
						disease(sabilty1, info);

					}
				}
//===================================================================================================================================================//
				else if (chose == 5) { // 상점 구현
					yes = false;
					System.out.println(
							"====================================================================안녕하세요 반갑습니다 천천히 둘러보세요 ๑•‿•๑====================================================================");

					sleeptime(500);
					shop();
					System.out.println("\n");
					System.out.println(
							"====================================================================원하시는 물건에 이름을 입력세요=================================================================================");
					System.out.println("입력>>>");
					String name = scn.nextLine();
					DogShopVO shop = new DogShopVO(name);
					DogShopVO shop1 = dogGame.dshopSelect(shop);
					long price = shop1.getPrice();
					if (shop1.getCount() <= 0) {
						System.out.println(
								"                                                            !수량이 부족합니다 운영자에게 문의바랍니다!");
						System.out.println("\n\n");
						break;
					}

					for (int i = 0; i < list1.size(); i++) {
						if (name.equals(list1.get(i).getName())) {
							yes = true;
							break;
						} else {
						}

					}
					if (yes == false) {
						System.out.println(
								"                                                               존재하지 않는 물건입니다 ⋋〳 ￣ ᴥ ￣ 〵⋌ ");
					} else if (yes == true) {
						System.out.println("                                                         " + name + ":"
								+ price + "₩을/를 구입하시겠습니가? 1.예, 2.아니오");
						int menu = Integer.parseInt(scn.nextLine());
						if (menu == 1) {
							int count = shop1.getCount();
							if (info.getUser_money() >= shop1.getPrice()) {
								shop1.setCount(count -= 1);
								shop1.setName(name);
								dogGame.dogshopUpdate(shop1);
								sleeptime(500);
								shop1.toString();
								money -= price;
								info.setUser_money(money);
								dogGame.userUpdate(info);
								System.out.println("\n");
								System.out.println(
										"                                                             이용해주셔서 감사합니당 (●'◡'●)ﾉ♥");
								System.out.println("\n");
								sleeptime(1000);
								System.out.println("                                                               "
										+ sabilty1.getDname() + "의 능력치가 올랐습니다.");

								DogShopVO shopability = new DogShopVO(name);
								DogShopVO shopability2 = dogGame.shopabilityselect(shopability);
								if (happy > 0) {
									sabilty1.setHappy(happy += shopability2.getHappy());
								} else {
									sabilty1.setHappy(happy += 5);
								}
								if (stress > 0) {
									sabilty1.setStress(stress += shopability2.getStress());
								} else {
									sabilty1.setStress(stress += 5);
								}
								if (health > 0) {
									sabilty1.setHealth(health += shopability2.getHealth());
								} else {
									sabilty1.setHealth(health += 5);
								}
								if (full > 0) {
									sabilty1.setFull(full += shopability2.getFull());
								} else {
									sabilty1.setFull(full += 5);
								}
								if (cleanliness > 0) {
									sabilty1.setCleanliness(cleanliness += shopability2.getCleanliness());
								} else {
									sabilty1.setCleanliness(cleanliness += 5);
								}
								sabilty1.setBravery(braverry += shopability2.getBravery());

								dogGame.dogsabiltyUpdate(sabilty1);
								objective(sabilty1);
							}

							else {
								System.out.println(
										"                                                  소지금이 부족하여 구매가 불가능합니다 산책으로 돈을 좀 벌어보세요");
							}
						}
					}

//===================================================================================================================================================//
				} else if (chose == 6) { // 상태 확인창 구현
					System.out.println(
							"                                                                         1. 강아지 상태창 | 2.자신의 상태창");
					int num = Integer.parseInt(scn.nextLine());
					if (num == 1) {

						System.out.println(
								"                                                                                "
										+ sabilty1.getDname() + "상태창 입니다 ◤◡ᴥ◡◥ ");
						sabilty1.toString();
					} else if (num == 2) {
						info.getUser_name();
						sleeptime(500);
						System.out.println();
						info.toString();
					}
				} else if (chose == 7) {

					System.out.println(
							"                                                                  이제부터 게임시간이 적용되었습니다...⏳");
					sleeptime(1000);
					Timer m_timer = new Timer();
					TimerTask m_task = new TimerTask() {
						int count1 = 0;

						public void run() {
							count1++;
							int randomVal = 0;
							int count = 10;
							int happy = sabilty1.getHappy(), full = sabilty1.getFull(),
									cleanliness = sabilty1.getCleanliness(), stress = sabilty1.getStress(),
									health = sabilty1.getHealth();

							for (int i = 0; i <= 5; i++) {
								randomVal = (int) (Math.random() * 5) + 1;
							}

							System.out.println("\n \n");
							System.out.println(
									"                                                                     다음날 아침이 밝았습니다 "
											+ count1 + "일 차입니다.");
							System.out.println();
							sleeptime(1000);
							System.out.println();
							System.out.println("  \r\n"
									+ "                                                                             `.    \\     )    /    .'\r\n"
									+ "                                                                                `.   \\   (    /   .'\r\n"
									+ "                                                                                 `.  .-''''-.  .'\r\n"
									+ "                                                                           `~._    .'/_    _\\`.    _.~'\r\n"
									+ "                                                                               `~ /  / \\  / \\  \\ ~'\r\n"
									+ "                                                                          _ _ _ _|  _\\O/  \\O/_  |_ _ _ _\r\n"
									+ "                                                                                 | (_)  /\\  (_) |\r\n"
									+ "                                                                              _.~ \\  \\      /  / ~._\r\n"
									+ "                                                                           .~'     `. `.__.' .'     `~.\r\n"
									+ "                                                                                 .'  `-,,,,-'  `.\r\n"
									+ "                                                                               .'   /    )   \\   `.\r\n"
									+ "                                                                             .'    /    (     \\    `.\r\n"
									+ "                                                                                  /      )     \\        \r\n"
									+ "                                                                                        (");
							System.out.println();
							System.out.println(
									"                                                                         전체적으로 강아지 스탯이 낮아졌습니다");
							if (happy > 0) {
								sabilty1.setHappy(happy -= randomVal);
							} else {
								sabilty1.setHappy(happy += 5);
							}
							if (health > 0) {
								sabilty1.setHealth(health -= randomVal);
							} else {
								sabilty1.setHealth(health -= 5);
							}
							if (full > 0) {
								sabilty1.setFull(full += randomVal);
							} else {
								sabilty1.setFull(full += 5);
							}
							if (cleanliness > 0) {
								sabilty1.setCleanliness(cleanliness -= randomVal);
							} else {
								sabilty1.setCleanliness(cleanliness += 5);
							}
							if (stress > 0) {
								sabilty1.setStress(stress += randomVal);
							} else {
								sabilty1.setStress(stress += 5);
							}

							dogGame.dogsabiltyUpdate(sabilty1);
							sabilty1.toString();
							System.out.println();
							objective(sabilty1);
							sleeptime(500);
							System.out.println(
									"                       █████████  █████                                                                                       █████    ███                     \r\n"
											+ "                      ███░░░░░███░░███                                                                                       ░░███    ░░░                      \r\n"
											+ "                     ███     ░░░  ░███████    ██████   ██████   █████   ██████      ██████  ████████       ██████  ████████  ███████  ████   ██████  ████████  \r\n"
											+ "                    ░███          ░███░░███  ███░░███ ███░░███ ███░░   ███░░███    ░░░░░███░░███░░███     ███░░███░░███░░███░░░███░  ░░███  ███░░███░░███░░███ \r\n"
											+ "                    ░███          ░███ ░███ ░███ ░███░███ ░███░░█████ ░███████      ███████ ░███ ░███    ░███ ░███ ░███ ░███  ░███    ░███ ░███ ░███ ░███ ░███ \r\n"
											+ "                    ░░███     ███ ░███ ░███ ░███ ░███░███ ░███ ░░░░███░███░░░      ███░░███ ░███ ░███    ░███ ░███ ░███ ░███  ░███ ███░███ ░███ ░███ ░███ ░███ \r\n"
											+ "                     ░░█████████  ████ █████░░██████ ░░██████  ██████ ░░██████    ░░████████████ █████   ░░██████  ░███████   ░░█████ █████░░██████  ████ █████\r\n"
											+ "                      ░░░░░░░░░  ░░░░ ░░░░░  ░░░░░░   ░░░░░░  ░░░░░░   ░░░░░░      ░░░░░░░░░░░░ ░░░░░     ░░░░░░   ░███░░░     ░░░░░ ░░░░░  ░░░░░░  ░░░░ ░░░░░ \r\n"
											+ "                                                                                                                   ░███                                        \r\n"
											+ "                                                                                                                   █████                                       \r\n"
											+ "                                                                                                                  ░░░░░                                        \r\n"
											+ "                    ");
							System.out.println();
							System.out.println(
									"                                    ┌============================================================================================================┐ ");
							System.out.println();
							System.out.println(
									"                                              1.놀아주기  2.산책하기  3.씻겨주기  4.밥 주기  5.상점  6.상태확인  7.타이머   8.종료      ");
							System.out.println();
							System.out.println(
									"                                                          *정상적인 게임을 위해서는 7.타이머를 누르시고 게임을 즐겨주세요*");
							System.out.println();
							System.out.println(
									"                                    └============================================================================================================┘");
							System.out.println("\n\n\n");
						}
					};

					m_timer.schedule(m_task, 60 * 3000, 60 * 3000);
				} else {
					return;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요");
			}
		}

	}

	private void shop() {
		for (DogShopVO vo : list1) {
			vo.toString();
		}

	}

	public int sleeptime(int sc) {
		try {
			Thread.sleep(sc);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return sc;
	}

	private void disease(DogSabiltyVO sabilty1, User_infoVO info) {
		int random = (int) (Math.random() * 3) + 1;
		int random1 = (int) (Math.random() * 3) + 1;
		long money = info.getUser_money();
		int cleanliness = sabilty1.getCleanliness();
		int stress = sabilty1.getStress();

		if (sabilty1.getStress() >= 50 && sabilty1.getCleanliness() <= 5) {

			if (random == 1) {
				sleeptime(1000);
				System.out.println("                                                                         엥? "
						+ sabilty1.getDname() + "가 몸이 안 좋은가? 비틀비틀거리네?");
				sleeptime(1000);
				System.out.println();
				System.out.println("                                                                            털썩...."
						+ sabilty1.getDname() + "야 정신차려 왜그래....");
				System.out.println();
				sleeptime(2000);
				System.out.println(
						"                                                                                    🏥 후송중~~~~~🚑🚑🚑");
				System.out.println(""
						+ "                                                                                                             ░░░░░\r\n"
						+ "                                                                            ░░░░░░                            ░░░░\r\n"
						+ "                                                                          ░░░░░░░░░                          ░░░░░░\r\n"
						+ "                                                                          ░░░░░░░░░░                         ░░░░░░░    \r\n"
						+ "                                                                         ░░░░░░░░░░░░                    ░░░░░░░░░░░\r\n"
						+ "                                                                        ░░░░░░░░░░░░░                   ░░░░░░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░░░░░░░                 ░░░░░░░░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░           ░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░      ░░░░░░    ░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░       ░░░░░░          ░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░         ░░░░░░          ░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░          ░░░░░░           ░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░          ░░░░░░            ░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░           ░░░░░░            ░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░           ░░░░░░            ░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░     ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░     ░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░     ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░\r\n"
						+ "                                                                        ░░░░░░░░░    ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░\r\n"
						+ "                                                                        ░░░░░░░░░    ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░\r\n"
						+ "                                                                         ░░░░░░░░    ░░░░░░░░░░░░░░░░░░░░    ░░░░░░░░   \r\n"
						+ "                                                                          ░░░░░░░░          ░░░░░░           ░░░░░░░    \r\n"
						+ "                                                                          ░░░░░░░░          ░░░░░░          ░░░░░░░░\r\n"
						+ "                                                                           ░░░░░░░░         ░░░░░░          ░░░░░░░     \r\n"
						+ "                                                                            ░░░░░░░░        ░░░░░░         ░░░░░░░░\r\n"
						+ "                                                                            ░░░░░░░░░       ░░░░░░        ░░░░░░░░\r\n"
						+ "                                                                             ░░░░░░░░░      ░░░░░░       ░░░░░░░░\r\n"
						+ "                                                                               ░░░░░░░░░░   ░░░░░░   ░░░░░░░░░░\r\n"
						+ "                                                                                ░░░░░░░░░░░░░     ░░░░░░░░░░░░\r\n"
						+ "                                                                                 ░░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                                  ░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                                       ░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                                              ░░░░\r\n"
						+ "");
				sleeptime(5000);
				System.out.println(
						"                                                                                        "
								+ sabilty1.getDname() + "가   독감에 걸렸네요....");
				System.out.println();
				System.out.println(
						"                                    병원비로 20000원이 나왔습니다....지불하시겠습니까??(강아지 상태가 좋지 않을 경우는 사망할 수도 있습니다.) 1. Yes 2. No");
				int num = Integer.parseInt(scn.nextLine());
				if (num == 1) {
					if (money >= 20000) {
						info.setUser_money(money -= 20000);
						System.out.println(
								"                                                            돈을 지불하셨습니다 건강하게 키우시길 바랍니다");
						sleeptime(1000);
						sabilty1.setCleanliness(cleanliness += 10);
						sabilty1.setStress(stress -= 10);
						System.out.println("다시 건강을 찾았습니다");
					} else if (money < 20000) {
						System.out.println(
								"                                                                                         돈이 부족합니다");
						if (random1 == 1) {
							System.out.println("                                                                     "
									+ sabilty1.getDname() + "가 병을 이겨내지 못하고 무지개다리를 건넜습니다....");
							System.out.println();
							sleeptime(1000);
							System.out.println(
									"                                                                           사망신고를 위해서 유저의 이름을 입력해주세요");
							System.out.println();
							System.out.println("입력>>>>");
							sleeptime(1000);
							System.out.println(
									"                                                                               당신은 강아지를 키울 자격이 없습니다.");
							String name = scn.nextLine();
							info.setUser_name(name);
							dogGame.userdelete(info);
							run = false;

						} else if (random1 == 2) {
							System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
							sleeptime(20000);
							System.out.println(
									"                                                    강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
							sabilty1.setCleanliness(cleanliness += 10);
							sabilty1.setStress(stress -= 10);
						} else if (random1 == 3) {
							System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
							sleeptime(20000);
							System.out.println(
									"                                                     강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
							sabilty1.setCleanliness(cleanliness += 10);
							sabilty1.setStress(stress -= 10);
						}

					}

				} else if (num == 2) {
					if (random1 == 1) {
						System.out.println("                                                                  "
								+ sabilty1.getDname() + "가 병을 이겨내지 못하고 무지개다리를 건넜습니다....");
						System.out.println();
						sleeptime(1000);
						System.out.println(
								"                                                                           사망신고를 위해서 유저의 이름을 입력해주세요");
						System.out.println();
						System.out.println("입력>>>>");
						sleeptime(1000);
						System.out.println(
								"                                                                                당신은 강아지를 키울 자격이 없습니다.");
						String name = scn.nextLine();
						info.setUser_name(name);
						dogGame.userdelete(info);
						run = false;

					} else if (random1 == 2) {
						System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
						sleeptime(20000);
						System.out.println(
								"                                                    강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
						sabilty1.setCleanliness(cleanliness += 10);
						sabilty1.setStress(stress -= 10);
					} else if (random1 == 3) {
						System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
						sleeptime(20000);
						System.out.println(
								"                                                     강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
						sabilty1.setCleanliness(cleanliness += 10);
						sabilty1.setStress(stress -= 10);
					}

				}
			
			}

			else if (random == 2) {
				sleeptime(1000);
				System.out.println("                                                                         엥? "
						+ sabilty1.getDname() + "가 몸이 안 좋은가? 비틀비틀거리네?");
				sleeptime(1000);
				System.out.println();
				System.out.println("                                                                            털썩...."
						+ sabilty1.getDname() + "야 정신차려 왜그래....");
				System.out.println();
				sleeptime(2000);
				System.out.println(
						"                                                                                    🏥 후송중~~~~~🚑🚑🚑");
				System.out.println(""
						+ "                                                                                                             ░░░░░\r\n"
						+ "                                                                            ░░░░░░                            ░░░░\r\n"
						+ "                                                                          ░░░░░░░░░                          ░░░░░░\r\n"
						+ "                                                                          ░░░░░░░░░░                         ░░░░░░░    \r\n"
						+ "                                                                         ░░░░░░░░░░░░                    ░░░░░░░░░░░\r\n"
						+ "                                                                        ░░░░░░░░░░░░░                   ░░░░░░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░░░░░░░                 ░░░░░░░░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░           ░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░      ░░░░░░    ░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░       ░░░░░░          ░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░         ░░░░░░          ░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░          ░░░░░░           ░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░          ░░░░░░            ░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░           ░░░░░░            ░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░           ░░░░░░            ░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░     ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░     ░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░     ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░\r\n"
						+ "                                                                        ░░░░░░░░░    ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░\r\n"
						+ "                                                                        ░░░░░░░░░    ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░\r\n"
						+ "                                                                         ░░░░░░░░    ░░░░░░░░░░░░░░░░░░░░    ░░░░░░░░   \r\n"
						+ "                                                                          ░░░░░░░░          ░░░░░░           ░░░░░░░    \r\n"
						+ "                                                                          ░░░░░░░░          ░░░░░░          ░░░░░░░░\r\n"
						+ "                                                                           ░░░░░░░░         ░░░░░░          ░░░░░░░     \r\n"
						+ "                                                                            ░░░░░░░░        ░░░░░░         ░░░░░░░░\r\n"
						+ "                                                                            ░░░░░░░░░       ░░░░░░        ░░░░░░░░\r\n"
						+ "                                                                             ░░░░░░░░░      ░░░░░░       ░░░░░░░░\r\n"
						+ "                                                                               ░░░░░░░░░░   ░░░░░░   ░░░░░░░░░░\r\n"
						+ "                                                                                ░░░░░░░░░░░░░     ░░░░░░░░░░░░\r\n"
						+ "                                                                                 ░░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                                  ░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                                       ░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                                              ░░░░\r\n"
						+ "");
				sleeptime(5000);
				System.out.println(
						"                                                                                        "
								+ sabilty1.getDname() + "가   피부병에 걸렸네요....");
				System.out.println();
				System.out.println(
						"                                    병원비로 20000원이 나왔습니다....지불하시겠습니까??(강아지 상태가 좋지 않을 경우는 사망할 수도 있습니다.) 1. Yes 2. No");
				int num = Integer.parseInt(scn.nextLine());
				if (num == 1) {
					if (money >= 20000) {
						info.setUser_money(money -= 20000);
						System.out.println(
								"                                                            돈을 지불하셨습니다 건강하게 키우시길 바랍니다");
						sleeptime(1000);
						sabilty1.setCleanliness(cleanliness += 10);
						sabilty1.setStress(stress -= 10);
						System.out.println("다시 건강을 찾았습니다");
					} else if (money < 20000) {
						System.out.println(
								"                                                                                         돈이 부족합니다");
						if (random1 == 1) {
							System.out.println("                                                                     "
									+ sabilty1.getDname() + "가 병을 이겨내지 못하고 무지개다리를 건넜습니다....");
							System.out.println();
							sleeptime(1000);
							System.out.println(
									"                                                                           사망신고를 위해서 유저의 이름을 입력해주세요");
							System.out.println();
							System.out.println("입력>>>>");
							sleeptime(1000);
							System.out.println(
									"                                                                               당신은 강아지를 키울 자격이 없습니다.");
							String name = scn.nextLine();
							info.setUser_name(name);
							dogGame.userdelete(info);
							run = false;

						} else if (random1 == 2) {
							System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
							sleeptime(20000);
							System.out.println(
									"                                                    강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
							sabilty1.setCleanliness(cleanliness += 10);
							sabilty1.setStress(stress -= 10);
						} else if (random1 == 3) {
							System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
							sleeptime(20000);
							System.out.println(
									"                                                     강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
							sabilty1.setCleanliness(cleanliness += 10);
							sabilty1.setStress(stress -= 10);
						}

					}

				} else if (num == 2) {
					if (random1 == 1) {
						System.out.println("                                                                  "
								+ sabilty1.getDname() + "가 병을 이겨내지 못하고 무지개다리를 건넜습니다....");
						System.out.println();
						sleeptime(1000);
						System.out.println(
								"                                                                           사망신고를 위해서 유저의 이름을 입력해주세요");
						System.out.println();
						System.out.println("입력>>>>");
						sleeptime(1000);
						System.out.println(
								"                                                                                당신은 강아지를 키울 자격이 없습니다.");
						String name = scn.nextLine();
						info.setUser_name(name);
						dogGame.userdelete(info);
						run = false;

					} else if (random1 == 2) {
						System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
						sleeptime(20000);
						System.out.println(
								"                                                    강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
						sabilty1.setCleanliness(cleanliness += 10);
						sabilty1.setStress(stress -= 10);
					} else if (random1 == 3) {
						System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
						sleeptime(20000);
						System.out.println(
								"                                                     강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
						sabilty1.setCleanliness(cleanliness += 10);
						sabilty1.setStress(stress -= 10);
					}

				
			
				}
			} else if (random == 3) {
				sleeptime(1000);
				System.out.println("                                                                         엥? "
						+ sabilty1.getDname() + "가 몸이 안 좋은가? 비틀비틀거리네?");
				sleeptime(1000);
				System.out.println();
				System.out.println("                                                                            털썩...."
						+ sabilty1.getDname() + "야 정신차려 왜그래....");
				System.out.println();
				sleeptime(2000);
				System.out.println(
						"                                                                                    🏥 후송중~~~~~🚑🚑🚑");
				System.out.println(""
						+ "                                                                                                             ░░░░░\r\n"
						+ "                                                                            ░░░░░░                            ░░░░\r\n"
						+ "                                                                          ░░░░░░░░░                          ░░░░░░\r\n"
						+ "                                                                          ░░░░░░░░░░                         ░░░░░░░    \r\n"
						+ "                                                                         ░░░░░░░░░░░░                    ░░░░░░░░░░░\r\n"
						+ "                                                                        ░░░░░░░░░░░░░                   ░░░░░░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░░░░░░░                 ░░░░░░░░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░░░        ░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░░░░░           ░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░░      ░░░░░░    ░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░░░       ░░░░░░          ░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░░         ░░░░░░          ░░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░          ░░░░░░           ░░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░░          ░░░░░░            ░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░           ░░░░░░            ░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░░           ░░░░░░            ░░░░░░░░░░\r\n"
						+ "                                                                      ░░░░░░░░░░     ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░     ░░░░░░░░░░░░░░░░░░░░      ░░░░░░░░\r\n"
						+ "                                                                       ░░░░░░░░░     ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░\r\n"
						+ "                                                                        ░░░░░░░░░    ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░\r\n"
						+ "                                                                        ░░░░░░░░░    ░░░░░░░░░░░░░░░░░░░░     ░░░░░░░░\r\n"
						+ "                                                                         ░░░░░░░░    ░░░░░░░░░░░░░░░░░░░░    ░░░░░░░░   \r\n"
						+ "                                                                          ░░░░░░░░          ░░░░░░           ░░░░░░░    \r\n"
						+ "                                                                          ░░░░░░░░          ░░░░░░          ░░░░░░░░\r\n"
						+ "                                                                           ░░░░░░░░         ░░░░░░          ░░░░░░░     \r\n"
						+ "                                                                            ░░░░░░░░        ░░░░░░         ░░░░░░░░\r\n"
						+ "                                                                            ░░░░░░░░░       ░░░░░░        ░░░░░░░░\r\n"
						+ "                                                                             ░░░░░░░░░      ░░░░░░       ░░░░░░░░\r\n"
						+ "                                                                               ░░░░░░░░░░   ░░░░░░   ░░░░░░░░░░\r\n"
						+ "                                                                                ░░░░░░░░░░░░░     ░░░░░░░░░░░░\r\n"
						+ "                                                                                 ░░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                                  ░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                                       ░░░░░░░░░░░░░░░░\r\n"
						+ "                                                                                              ░░░░\r\n"
						+ "");
				sleeptime(5000);
				System.out.println(
						"                                                                                        "
								+ sabilty1.getDname() + "가   탈장에 걸렸네요....");
				System.out.println();
				System.out.println(
						"                                    병원비로 20000원이 나왔습니다....지불하시겠습니까??(강아지 상태가 좋지 않을 경우는 사망할 수도 있습니다.) 1. Yes 2. No");
				int num = Integer.parseInt(scn.nextLine());
				if (num == 1) {
					if (money >= 20000) {
						info.setUser_money(money -= 20000);
						System.out.println(
								"                                                            돈을 지불하셨습니다 건강하게 키우시길 바랍니다");
						sleeptime(1000);
						sabilty1.setCleanliness(cleanliness += 10);
						sabilty1.setStress(stress -= 10);
						System.out.println("다시 건강을 찾았습니다");
					} else if (money < 20000) {
						System.out.println(
								"                                                                                         돈이 부족합니다");
						if (random1 == 1) {
							System.out.println("                                                                     "
									+ sabilty1.getDname() + "가 병을 이겨내지 못하고 무지개다리를 건넜습니다....");
							System.out.println();
							sleeptime(1000);
							System.out.println(
									"                                                                           사망신고를 위해서 유저의 이름을 입력해주세요");
							System.out.println();
							System.out.println("입력>>>>");
							sleeptime(1000);
							System.out.println(
									"                                                                               당신은 강아지를 키울 자격이 없습니다.");
							String name = scn.nextLine();
							info.setUser_name(name);
							dogGame.userdelete(info);
							run = false;

						} else if (random1 == 2) {
							System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
							sleeptime(20000);
							System.out.println(
									"                                                    강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
							sabilty1.setCleanliness(cleanliness += 10);
							sabilty1.setStress(stress -= 10);
						} else if (random1 == 3) {
							System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
							sleeptime(20000);
							System.out.println(
									"                                                     강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
							sabilty1.setCleanliness(cleanliness += 10);
							sabilty1.setStress(stress -= 10);
						}

					}

				} else if (num == 2) {
					if (random1 == 1) {
						System.out.println("                                                                  "
								+ sabilty1.getDname() + "가 병을 이겨내지 못하고 무지개다리를 건넜습니다....");
						System.out.println();
						sleeptime(1000);
						System.out.println(
								"                                                                           사망신고를 위해서 유저의 이름을 입력해주세요");
						System.out.println();
						System.out.println("입력>>>>");
						sleeptime(1000);
						System.out.println(
								"                                                                                당신은 강아지를 키울 자격이 없습니다.");
						String name = scn.nextLine();
						info.setUser_name(name);
						dogGame.userdelete(info);
						run = false;

					} else if (random1 == 2) {
						System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
						sleeptime(20000);
						System.out.println(
								"                                                    강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
						sabilty1.setCleanliness(cleanliness += 10);
						sabilty1.setStress(stress -= 10);
					} else if (random1 == 3) {
						System.out.println("                                                                         아픈 강아지를 그냥 바라보는 중");
						sleeptime(20000);
						System.out.println(
								"                                                     강아지에 상태는 매우 좋지 못하지만 다행이도 살아서 돌아왔습니다 많은 관심을 부탁드립니다....");
						sabilty1.setCleanliness(cleanliness += 10);
						sabilty1.setStress(stress -= 10);
					}

				}
			}

		}
	}

	private void objective(DogSabiltyVO sabilty1) {
		int health = sabilty1.getHealth();

		int happy = sabilty1.getHappy();
		if (health >= 100 && happy >= 200) {
			Menu menu = new Menu();
			sleeptime(4000);
			System.out.println(
					"                                                                                            졸업을 축하합니다!!!");
			System.out.println();
			System.out.println(
					"                                                                             이제 강아지는 스스로의 힘으로  원합니다 놓아주세요");
			System.out.println();
			System.out.println(
					"                                                                                   이제는 다른 캐릭터로 게임을 즐겨보세요!!!");
			sleeptime(3000);
			run = false;

		}

	}

}
