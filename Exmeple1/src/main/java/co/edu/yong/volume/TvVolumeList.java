package co.edu.yong.volume;

import java.util.Scanner;

import co.edu.yong.Exmeple1.InterfaceExam;

public class TvVolumeList implements InterfaceExam{

	Scanner scn = new Scanner(System.in);
	int menu;
	boolean turn = true;
	@Override
	public void turnOn() {
		System.out.println("치치직 TV를 켭니다.");
		while (turn) {
			System.out.println("채널을 고르세요");
			 menu = Integer.parseInt(scn.next());
			
			if(menu == MBC) {
				System.out.println("MBC입니다~~");
			}
			else if(menu == SBS) {
				System.out.println("SBS입니다~~");
			}
			else if(menu == KBS) {
				System.out.println("KBS입니다~~");
			}
			else if(menu == NETFLIX) {
				System.out.println("NETFLIX입니다~~");
			}
			else if(menu == DISNEY) {
				System.out.println("디지니+입니다~~");
			}
			else if(menu == EXIT) {
				turnOff();
			}
			
			
		}
	}

	@Override
	public void turnOff() {
		System.out.println("치지직 TV를 끕니다.");
			turn = false;
	}
	
	
	
	

}
