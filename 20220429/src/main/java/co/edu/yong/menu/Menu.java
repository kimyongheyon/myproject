package co.edu.yong.menu;

import java.util.Scanner;

import co.edu.yong.game.Lotto;
import co.edu.yong.game.Mabangjn;
import co.edu.yong.game.Tetris;

public class Menu {

	private Scanner scn = new Scanner(System.in);
	private Lotto lotto = new Lotto();
	private Mabangjn mabangjin = new Mabangjn();
	private Tetris tetris = new Tetris();
	
	
	private void mainTitle() {
		
		System.out.println("***********************************************");
		System.out.println("==================게 임 모 음==================");
		System.out.println("=== 1. 로또 게임 2.마방진 3.테트리스 4.종료====");
		System.out.println("***********************************************");
		System.out.println("하고 싶은 게임을 선택하세요");
		
	}
	private void mainMenu() {
		boolean b = true;
		
		do {
			mainTitle();
			int key = scn.nextInt();
			switch (key) {
			case 1:
				lotto.run();
				break;
				
			case 2:
				mabangjin.run();
				break;
				
			case 3:
				tetris.run();
				break;
				
			case 4:
				b = false;
				System.out.println("프로그램 종료");
				scn.close();
				break;	

			}
		}while(b);
		
	}
	public void run () {
		mainMenu();
		
	}
	
	
	
	
	
	
}
