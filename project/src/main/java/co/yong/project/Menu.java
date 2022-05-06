package co.yong.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.yong.project.service.DogGameService;
import co.yong.project.service.DogSabiltyVO;
import co.yong.project.service.DogShopVO;
import co.yong.project.serviceImpl.DogGameServiceImpl;

public class Menu {
	
	private Scanner scn = new Scanner(System.in);
	
	private void mainTitle() {
		System.out.println("============================================================");
		System.out.println("==============1.캐릭터 생성 | 2.불러오기 3.종료=============");
		System.out.println("============================================================");
	}
	private void charactersTitle() {
		System.out.println("-------------------------------");
		System.out.println("원하시는 강아지를 선택해주세요");
		System.out.println("1.셰퍼드 | 2.불독 | 3.진돗개");
		System.out.println("-------------------------------");
	}
	private void shepherd() {
		System.out.println("   ......                  ............. \r\n"
				+ "            .....;;...                ................ \r\n"
				+ "         .......;;;;;/mmmmmmmmmmmmmm\\/.................. \r\n"
				+ "       ........;;;mmmmmmmmmmmmmmmmmmm..................... \r\n"
				+ "     .........;;m/;;;;\\mmmmmm/;;;;;\\m...................... \r\n"
				+ "  ..........;;;m;;mmmm;;mmmm;;mmmmm;;m...................... \r\n"
				+ "..........;;;;;mmmnnnmmmmmmmmmmnnnmmmm\\.................... \r\n"
				+ ".........  ;;;;;n/#####\\nmmmmn/#####\\nmm\\................. \r\n"
				+ ".......     ;;;;n##...##nmmmmn##...##nmmmm\\............. \r\n"
				+ "....        ;;;n#.....|nmmmmn#.....#nmmmmm,l......... \r\n"
				+ " ..          mmmn\\.../nmmmmmmn\\.../nmmmm,m,lll..... \r\n"
				+ "          /mmmmmmmmmmmmmmmmmmmmmmmmmmm,mmmm,llll.. \r\n"
				+ "      /mmmmmmmmmmmmmmmmmmmmmmm\\nmmmn/mmmmmmm,lll/ \r\n"
				+ "   /mmmmm/..........\\mmmmmmmmmmnnmnnmmmmmmmmm,ll \r\n"
				+ "  mmmmmm|...........|mmmmmmmmmmmmmmmmmmmmmmmm,ll \r\n"
				+ "  \\mmmmmmm\\......./mmmmmmmmmmmmmmmmmmmmmmmmm,llo \r\n"
				+ "    \\mmmmmmm\\.../mmmmmmmmmmmmmmmmmmmmmmmmmm,lloo \r\n"
				+ "      \\mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm,ll/oooo \r\n"
				+ "         \\mmmmmmmmmmll..;;;.;;;;;;/mmm,lll/oooooo\\ \r\n"
				+ "                   ll..;;;.;;;;;;/llllll/ooooooooo \r\n"
				+ "                   ll.;;;.;;;;;/.llll/oooooooooo..o \r\n"
				+ "                   ll;;;.;;;;;;..ll/ooooooooooo...oo \r\n"
				+ "                   \\;;;;.;;;;;..ll/ooooo...ooooo..oo\\ \r\n"
				+ "                 ;;;;;;;;;;;;..ll|oooo.....oooooooooo \r\n"
				+ "                ;;;;;;.;;;;;;.ll/oooo.....ooooooo....\\ \r\n"
				+ "                ;;;;;.;;;;;;;ll/ooooooooooooo.....oooo \r\n"
				+ "                 \\;;;.;;;;;;/oooooooooooo.....oooooooo\\ \r\n"
				+ "                  \\;;;.;;;;/ooooooooo.....ooooooooooooo \r\n"
				+ "                    \\;;;;/ooooooo.....ooooooooooo...ooo\\ \r\n"
				+ "                    |o\\;/oooo.....ooooooooooooo......ooo \r\n"
				+ "                    oooooo....ooooooooooooooooooo.....oo\\ \r\n"
				+ "                   oooo....oooooooooooooooooooooooo..oooo \r\n"
				+ "                  ___.oooooooooooooo....ooooooooooooooooo\\ \r\n"
				+ "                 /XXX\\oooooooooooo.....ooooooooooooooooooo \r\n"
				+ "                 |XXX|ooooo.oooooo....ooooooooooooooooooooo \r\n"
				+ "               /oo\\X/oooo..ooooooooooooooooooo..oooooooooooo \r\n"
				+ "             /ooooooo..ooooo..oooooooooooooo.....ooooooooo... \r\n"
				+ "           /ooooo...ooooo.....oooooooooooo.......ooooooo.....o");
		System.out.println("멍멍~~~~");
	}
	private void bulldog () {
		System.out.println("                                     .,cc,ccccc,\r\n"
				+ "                                , ,d$$$$$?$$$$L  .zcc\r\n"
				+ "                       .,d$P\"\")\",d$$P\".,   `$$Lc$$$$$$.\r\n"
				+ "                      $P\"\" ,c$c$$P\",c$$$  .d$$$$$\"\"`\"?$c\r\n"
				+ "                       _,,ccc=\" xx-$$??\".,$$$$$\" ,P   $$h\r\n"
				+ "                     =`\"'.,,,,,,,`-      `\"?$$F.$$   ,$$$`c\r\n"
				+ "                .,,&lt;&lt;CCCCCCCCCCCCCC :       \"?,$$$c, J$$',$r\r\n"
				+ "            .,&lt;CCCCCCCCCCCCCCCCCCCC&gt;    -:  ., ?$$$$ $$$ $$F\r\n"
				+ "         .,&lt;C&gt;''`&lt;CCCCCCCCCCCCCCC&gt;'.,C&gt;&gt;&gt;,,,`CC.\"??' $$F $$ J\r\n"
				+ "       ,&lt;C&gt;'.,CC&gt;.`&gt;&gt;''')CCC,cccc.'&lt;CCCCCCCC CCC  ==-3$h $$.$h\r\n"
				+ "     ,&lt;C&gt;',CCCCCCC&gt; 4M\",CC&gt;'`&lt;.`',C&lt;CCCCCCCC&gt;CCC.,`$$.?$$$$c$$L\r\n"
				+ "    &lt;CC&gt; &lt;CCCCCCCCCC,. '.::::::: &lt;CCCCCCCCCCCCCCCC&gt;.?$ $$$$$$$$\r\n"
				+ "   &lt;CC&gt; &lt;CCCCCCCCCCCCC,``::::::::`CCCCC'`CCCCCCCCCCC, ?$$$$$$$$F&lt;cccc,\r\n"
				+ ",r CC&gt; CCCCCCCCCCCCCCCCC,.`'::::: CCCC dr`CCCCCCCCCCC&gt;.`?$$$$$$F&lt;$$$$$$\r\n"
				+ "$',CC'.CCCCCCCCCCCCCCCCCCC&gt;,,..``. `' `Mb CC`&lt;CCCCCCCCC&gt;.\"$$$$$h`P\"  $$$$c\r\n"
				+ "$ &lt;CC.`CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC,,.`&lt;C,.`CCCCCCCCC,`?$$$$  &lt;! ?$$$$\r\n"
				+ "$ CCC&gt; CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC,`&lt;CCCCCCCCCCCCC.\"$$F;!!  `$$P'\r\n"
				+ "$ CCCC.`CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC&gt; CCCCCCCCCCCCCC,`$F'`    `\"\r\n"
				+ "$ CCCCC.`&lt;CCCCCC&lt;CCCCCCCCCCCCCCCCCCCCCCCCCCCC,`CCCCCCCCCCCCCC,`F\r\n"
				+ "$.&lt;CCCCC&gt;.`&lt;CCCC CCCCCCCCCCCCCCCCCCCCCCCCCCCC',CCCCCCCCCCCCCCCC.\r\n"
				+ "$.`CCCCCCC&gt;.`&lt;CC &lt;CCCCCCCCCCCCCCCCCCCCCCCCCCC &lt;CCCCCCCCCCCCCCCCC.\r\n"
				+ "$$.`CCCCCCCC&gt;-.` 'CCCCCCCCCCCCCCCCCCCCCCCCCCC &lt;CCCCCCCCCCCCCCCCC&gt;\r\n"
				+ "$$$.`CCCCCC',&lt;$$hc`&lt;CCCCCCCCCCCCCCCCCCCCCCCCC CCCCCCCCCCCCCCCCCCC\r\n"
				+ "$$$$c.`''',c$ $$$$h.`&lt;CCCCCCCCCCCCCCCCCCCCCCC CCCCCCCCCCCCCCCCCCC\r\n"
				+ "$$$$$$ $$$$$$ $$$$$$h.`'&lt;CCCCCCCCCCCCCCCCCCC&gt;,CCCCCCCCCCCCCCCCCC'\r\n"
				+ "$$$$$$.?$$$$$ $$$$$$$$ hc,`&lt;CCCCCCCCCCCCCCCC &lt;CCCCCCCCCCCCCCCCC&gt;\r\n"
				+ "$$$$$$h $$$$$.?$$$$$$$.`$$$c,.`&lt;&lt;CCCCCCCCCCC &lt;CCCCCCCCCCCCCCCC'\r\n"
				+ "$$$$$$$c $$$$$`$$$$$$$$ $$$$$$$cc,..````&lt;&lt;&lt;&lt;&lt;'CCCCCCCCCCCCCCC'c\r\n"
				+ "$$$$$$$$.`$$$$L`$$$$$$$.?$$$$$$$$$$$$$$$$$ccc CCCCCCCCCCCCCC c$\r\n"
				+ "$$$$$$$$$ $$$$$h`$$$$$$h $$$$$$$$$$$$$$$$$$$$.`CCCCCCCCCCC&gt; d$F\r\n"
				+ "$$$$$$$$F,$$$$$$h.$$$$$$c`$$$$$$$$$$$$$$$$$$$$c`&lt;CCCCCCCC&gt;.d$$F\r\n"
				+ "$$$$$$$F $$$$$$$$$$$$$$$$.\"$$$$$$$$$$$$$$$$$$$$$.`&lt;CCCCC&gt;.d$$$'\r\n"
				+ "$$$$$$',$$$$$$$$$$$$$$$$$$c`?$$$$$$$$$$$$$$$$$$$$hc,``''.$$$$$");
		System.out.println("크르르릉~~~");
	}
private void Jindo_dog() {
	System.out.println("                                                   u\"\r\n"
			+ "                                                  d\"\r\n"
			+ "                                                 J\"                  ,f\r\n"
			+ "                                                4\" u                d$\r\n"
			+ "                                               ,\" z$              ;$$$\r\n"
			+ "                                              '  d$$             .$$$$\r\n"
			+ "                                    .          u$$$$L           .$$$$$.\r\n"
			+ "                                   4$   bec,,,..   `'           d$$$$$k\r\n"
			+ "                                  ,`\"   $$$$$$$$$$$$$be.        $$$$$$$,\r\n"
			+ "                                 ;  '\" &lt;$$$$$$$$$$$$$$$$$bc  $  $$$$$$$F\r\n"
			+ "                                ;'    .$$$$$$$$$$$$$$$$$$$$ d$  $$$$$$$\r\n"
			+ "                              ,z,dP\" d$$\"9$$$$PPFF\"\"??$$$$F d$L ?$$$$F\r\n"
			+ "        .....  \"?$$$$bc.     ''` .zd$$$$ \"\"           \"$$$$ $$$  $P\"  &gt;\r\n"
			+ "      `!!!!!!!!:  `?$$$$$$$$$$$$h'?$$$$$F      $c $$b  $$$$k$$$- .ed$\"\r\n"
			+ "    !;. `'!!!!!!!!:  \"$$$$$$$$$$$h ?$$$P  .,,e$$$ $$$.$$$$$$$$$ :$$\"\r\n"
			+ "    !!!!;. `'!!!!!!i  3$$$$$$$$$$$F $$F %.`?$$$P\"z$$$$$$$$$$$$$x$$e'\r\n"
			+ " :r  !!!!!!!; `'!!!!!  $$$$$$$$$$$$ 4$b '$$ec,cd$$$$$$$$$$$$$$$$$$.\r\n"
			+ " d$L `!!!!!!!!i `!!' .$$$$$$$$$$$$$  $$$c,,CB$$$$$$$$$$$$$$$$$$$$$\"\r\n"
			+ " $$$k `!!!!!!''''  .d$$$$$$$$$$$$$$L 9$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
			+ "4$$$$$r       ..e$$$$$$$$$$$$$$$$$$$L ?$$$$$$$$$$$$$$$$$$$$$$$$$$F\r\n"
			+ "4$$$$$ $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$c ?$$$$$$$$$$$$$$?3$$$$$$$$$\r\n"
			+ "`$$$$F4$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$r $$$$$$$$$$P\"\",d$$$$$$$$$\"\r\n"
			+ " 9$$$bd$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ $$$$$P\"\"   =\"3$$$$$$$$$P\r\n"
			+ " `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$F P\"   ,u,,zc$$$$$$$$$$$$\r\n"
			+ "  9$P?$$$$$$$$$$$$$$$$$$$$$$$$$$$$$P\"\"  .ue$$$$$$$$$$$$$$$$$$$F\r\n"
			+ "       `?$$$$$$$$$$$$$$$$$$$$$$$P\"  .e$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
			+ "         .\"$$$$$$$$$$$$$$$$$$$\"  zd$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
			+ "         ;;,?$$$$$$$$$$$$$$$F  z$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
			+ "         (;&lt;;.?$$$$$$$$$$$F   :$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
			+ "          \"+;;==\"$$$$$$P\"     $$$$$$$$$$$$$$$$$$$$$$$$$$$F  '\r\n"
			+ "                  \"\"\"        d$$$$$$$$$$$$$$$$$$$$$$$$$$\" ,'\r\n"
			+ "                            d$$$$$$$$$$$$$$$$$$$$$$$$P\"_,' .\r\n"
			+ "                         : $$$$$$$$$$$$$$$$$$$$$$P\" _+'  zd$b\r\n"
			+ "                         ; \"$$$$$$$$$$$$$$$$PF\" _.-` .zd$$$$$$c\r\n"
			+ "                       : ';: `??$$$$PPFF\"\" __,-`  ,c$$$\"$$$$$$$c\r\n"
			+ "                      J$$.`';;:...._....--`   ,c$$$$$F d$$$$$$$$b\r\n"
			+ "                    .d$$$$$eu. ````    .,ce$$$$$$$$$\" d$$$$$$$$$$b\r\n"
			+ "                   z$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\"  d$$$$$$$$$$$$b\r\n"
			+ "                  d$$$$$$$$$$$$$$$$$$$$$$$$$$$$$F  .$$$$$$$$$$$$$$$b.\r\n"
			+ "                u$$$$$$$$$$$$$$$$$$$$$$$$$$$$$F   d$$$$$$$$$$$$$$$$$$.");
	
	System.out.println("컹컹컹컹~!!!");
}
private void shepherddogTitle() {
	DogGameService dogGame = new DogGameServiceImpl();
	DogSabiltyVO dogsabilty = new DogSabiltyVO();
	while(true) {
		System.out.println("1.놀아주기 | 2.산책하기 | 3.씻겨주기 | 4.밥 먹이기 5.상점가기 6.상태확인 | 7.돌아가기");
		int chose = Integer.parseInt(scn.nextLine());
		if(chose == 1) {
			System.out.println("당신은 놀아주기를 선택했습니다.");
		}
		else if(chose == 2) {
			System.out.println("당신은 산책하기를 선택했습니다.");
		}
		else if(chose == 3) {
			System.out.println("당신은 삭책하기를 선택했습니다.");
		}
		else if(chose == 4) {
			System.out.println("당신은 밥 먹이기를 선택했습니다.");
		}
		else if(chose == 5) {
			System.out.println("당신은 상점 가기를 선택했습니다.");
			shop();
		}
		else if(chose == 6) {
			System.out.println("당신은 강아지 상태를 확인하기를 원합니다.");
			
			dogsabilty.setDname("셰퍼드");
			dogsabilty = dogGame.dSabiltySelect(dogsabilty);
			dogsabilty.toString();
		}
		else if(chose == 7) {
			break;
		}
	}
}
private void bulldogTitle() {
	DogGameService dogGame = new DogGameServiceImpl();
	DogSabiltyVO dogsabilty = new DogSabiltyVO();
	while(true) {
		System.out.println("1.놀아주기 | 2.산책하기 | 3.씻겨주기 | 4.밥 먹이기 5.상점가기 6.상태확인 | 7.돌아가기");
		int chose = Integer.parseInt(scn.nextLine());
		if(chose == 1) {
			System.out.println("당신은 놀아주기를 선택했습니다.");
		}
		else if(chose == 2) {
			System.out.println("당신은 산책하기를 선택했습니다.");
		}
		else if(chose == 3) {
			System.out.println("당신은 삭책하기를 선택했습니다.");
		}
		else if(chose == 4) {
			System.out.println("당신은 밥 먹이기를 선택했습니다.");
		}
		else if(chose == 5) {
			System.out.println("당신은 상점 가기를 선택했습니다.");
			shop();
		}
		else if(chose == 6) {
			System.out.println("당신은 강아지 상태를 확인하기를 원합니다.");
			dogsabilty.setDname("불독");
			dogsabilty = dogGame.dSabiltySelect(dogsabilty);
			dogsabilty.toString();
			
		}
		else if(chose == 7) {
			break;
		}
	}
}



private void jindodogTitle() {
	DogGameService dogGame = new DogGameServiceImpl();
	DogSabiltyVO dogsabilty = new DogSabiltyVO();
	while(true) {
		System.out.println("1.놀아주기 | 2.산책하기 | 3.씻겨주기 | 4.밥 먹이기 5.상점가기 6.상태확인 | 7.돌아가기");
		int chose = Integer.parseInt(scn.nextLine());
		if(chose == 1) {
			System.out.println("당신은 놀아주기를 선택했습니다.");
		}
		else if(chose == 2) {
			System.out.println("당신은 산책하기를 선택했습니다.");
		}
		else if(chose == 3) {
			System.out.println("당신은 삭책하기를 선택했습니다.");
		}
		else if(chose == 4) {
			System.out.println("당신은 밥 먹이기를 선택했습니다.");
		}
		else if(chose == 5) {
			System.out.println("당신은 상점 가기를 선택했습니다.");
			shop();
			
		}
		else if(chose == 6) {
			System.out.println("당신은 강아지 상태를 확인하기를 원합니다.");
			dogsabilty.setDname("진돗개");
			dogsabilty = dogGame.dSabiltySelect(dogsabilty);
			dogsabilty.toString();
			
		}
		else if(chose == 7) {
			break;
		}
	}
}




	public void mainRun() {
		while(true) {
			mainTitle();
			int menu = Integer.parseInt(scn.nextLine());
			if(menu == 1 ) {
				dogMenu();
			}
		}
	}
	
	
	
	private void dogMenu() {
		while(true) {
		charactersTitle();
		System.out.println("선택>>>");
		int menu = Integer.parseInt(scn.nextLine());
		if(menu == 1 ) {
			shepherd();
			System.out.println("당신은 셰퍼드를 선택하셨습니다");
			System.out.println("정성을 다 해서 키워주세요!!!");
			shepherddogTitle();
			
		}else if(menu == 2) {
			bulldog();
			System.out.println("당신은 불독을 선택하셨습니다");
			System.out.println("정성을 다 해서 키워주세요!!!");
			bulldogTitle();
		}
		else if(menu == 3) {
			Jindo_dog();
			System.out.println("당신은 진돗개를 선택하셨습니다");
			System.out.println("정성을 다 해서 키워주세요!!!");
			jindodogTitle();
		}
		}
	}
	
	private void shop() {
		DogGameService dogGame = new DogGameServiceImpl();
		List<DogShopVO>list = new ArrayList<DogShopVO>();
		list = dogGame.dShopSelectList();
		System.out.println("안녕하세요 상점입니다.");
		DogShopVO shop = new DogShopVO();
		for(DogShopVO vo : list) {
			vo.toString();
		}
		
		}

	
	
}
