package homework;

import java.util.Scanner;


public class homeWork5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-) : ");
		char a = sc.nextLine().charAt(7);
		int c = a - '0';
		String b = (0 > c || c > 5) ?  "잘못된 값": 
					(c == 1 || c == 3) ? "남성" : "여성";
		
		
		System.out.println("입력하신 주민번호는 " + b + "입니다" );
	}

}
