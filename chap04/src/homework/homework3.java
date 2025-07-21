package homework;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수: ");
		int c = sc.nextInt();
		int d = 0;
		
		if (num1 <= num2 && num1 <= c) {
			d = num1;
		} else if (num2 <= num1 && num2 <= c) {
			d = num2;
		} else if (c <= num1 && c <= num2) {
			d = c;
		}
		System.out.println("세수 중에서 가장 작은 수는 " + d + "입니다.");
	}

}
