package co.edu.yong.game;

import java.util.Scanner;

public class Mabangjn {

	private Scanner scn = new Scanner(System.in);
	
	private void mabangjinGame() {
		System.out.println("홀수만 입력하세요");
		int size = scn.nextInt();
		int[][] arr = new int[size][size];
		int num = 1;
		System.out.println(size +" * "+ size+ "마방진");
		for(int i = 0,  j = size / 2;  num <= size * size; num++) {
			
		  arr[i][j] = num;
		
		  if(num % size == 0) {
			  i++;
		  }else {
			  i--;
			  j++;
			  if(i < 0) i = size -1;
			  if(j > size-1)j= 0;
				  }
		}
		toPrint(arr);
	}
	private void toPrint(int[][] result) {
		for(int[] num : result) {
			for(int n : num) {
				System.out.printf(" %2d",n);
			}
			System.out.println();
		}
	}
	
	
	
	
	
public void run() {
		
		System.out.println("마방진 게임");
		mabangjinGame();
		
	}
	
	
	
	
	
	
}
