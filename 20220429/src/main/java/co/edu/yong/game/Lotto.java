package co.edu.yong.game;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lotto {
	private Scanner scn = new Scanner(System.in);
	private int[] lottoArry = new int[6];

	private void money() {

		System.out.println("로또 게임");

		System.out.println("충전할 금액을 입력하시오");
		int lottoNum = scn.nextInt();
		if (lottoNum < 1000) {
			System.out.println("돈이 부족합니다 최소 1000원부터 입니다.");
		}
		int price = (lottoNum / 1000);
		if (price % 1000 != 0) {
			System.out.println("거스름돈은 없어요");
		}
		for (int i = 1; i <= price; i++) {
			System.out.println("===========LOTTO NUMBER===========");
			lottoGame();
			System.out.println("==================================");
		}
	}

	private void lottoGame() {

		for (int i = 0; i < lottoArry.length; i++) {

			lottoArry[i] = (int) ((Math.random() * 45) + 1);

			for (int j = 0; j < i; j++) {
				if (lottoArry[i] == lottoArry[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lottoArry);
		
		for (int i = 0; i < lottoArry.length; i++) {
			System.out.print(lottoArry[i] + " " );
			}
		System.out.println();
		
	}
	
	
	
	
	
	
	public void run() {

		money();
	}

}
