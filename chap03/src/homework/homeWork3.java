package homework;

import java.util.Scanner;

public class homeWork3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("친구수 : ");
		int a = sc.nextInt();
		System.out.print("사탕의 수 : ");
		int ca = sc.nextInt();
		int b = ca / a;
		int c = ca % a;
		System.out.println("1인당 사탕 개수: " + b + "개");
		System.out.println("남는 사탕 개수: " + c+ "개");
	}

}
