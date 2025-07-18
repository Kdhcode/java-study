package homework;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수: ");
		int b = sc.nextInt();
		System.out.print("세번째 정수: ");
		int c = sc.nextInt();
		int d = 0;
		
		if (a <= b && a <= c) {
			d = a;
		} else if (b <= a && b <= c) {
			d = b;
		} else if (c <= a && c <= b) {
			d = c;
		}
		System.out.println("세수 중에서 가장 작은 수는 " + d + "입니다.");
	}

}
