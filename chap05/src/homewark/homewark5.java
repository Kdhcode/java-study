package homewark;

import java.util.Scanner;

public class homewark5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자(0을 입력하면 종료) : ");
		int num = sc.nextInt();
		int sum = 0;
		while (!(num == 0)) {
			if (num > 0) sum += num;
			System.out.println("숫자(0을 입력하면 종료) : ");
			num = sc.nextInt();
		}
		System.out.println("양수의 합계 : " + sum);
		
	}

}
