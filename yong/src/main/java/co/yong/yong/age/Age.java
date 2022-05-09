package co.yong.yong.age;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		while(true) {
		Scanner scn = new Scanner(System.in);
		int manAge = 0;

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String str = sdf.format(now);

		int todayYear = Integer.parseInt(str.substring(0,2));
		int todayMonth= Integer.parseInt(str.substring(2,4));
		int todayDay = Integer.parseInt(str.substring(4));
 
		System.out.println("주민 앞자리 입력");
		String n1 = scn.nextLine();

		String n2 = n1.substring(0, 2);
		String n3 = n1.substring(2);

		int yy = Integer.parseInt(n2);
		int md = Integer.parseInt(n3);
		
		if(md>=todayMonth && yy>20) {
			System.out.println("#나이 결과");
			System.out.print("입력하신 생년월일"+n1);
			System.out.println("나이: "+(121-yy));
		}
		else if(md>=todayMonth && yy<=20) {
			System.out.println("#나이 결과");
			System.out.print("입력하신 생년월일"+n1);
			System.out.println("나이: "+(21-yy));
		}
		else if(md<todayMonth && yy>20) {
			System.out.println("#나이 결과");
			System.out.print("입력하신 생년월일"+n1);
			System.out.println("나이: "+(122-yy));
		}
		else if(md<todayMonth && yy<20) {
			System.out.println("#나이 결과");
			System.out.print("입력하신 생년월일"+n1);
			System.out.println("나이: "+(22-yy));
		}
		else {
			break;
		}
	}
	}
}
