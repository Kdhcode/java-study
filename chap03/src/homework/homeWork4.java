package homework;

import java.util.Scanner;

public class homeWork4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int ko = sc.nextInt();
		System.out.print("수학 : ");
		int ma = sc.nextInt();
		System.out.print("영어 : ");
		int en = sc.nextInt();
		
		int to = ko + ma + en;
		int avg = to/3;
		
		String b = (ko >= 60 & ma >= 60 & en >= 60) || avg > 90 ? "있" : "없";
		
		System.out.println("합계 " + to + "점" );
		System.out.println("평균 " + avg + "점" );
		System.out.println("휴대폰을 바꿀 수 " + b + "습니다." );
	}

}
