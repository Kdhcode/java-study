package homework;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int a = sc.nextInt();
		if (a < 3) {
			System.out.println("당신의 놀이동산 요금은 무료 입니다.");
		} else if (a <= 3 && a < 13) {
			System.out.println("당신의 놀이동산 요금은 10000 입니다.");
		} else if (a <= 13 && a < 19) {
			System.out.println("당신의 놀이동산 요금은 20000 입니다.");
		} else if (a <= 19 && a <65 ) {
			System.out.println("당신의 놀이동산 요금은 30000 입니다.");
		} else {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		}
	}

}
