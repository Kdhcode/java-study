package sec02.exam08;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			if (num == 6) {
				break; 
			}
		}
		System.out.println("프로그램 종료");
		
		// Quiz
//		1에서 n까지의 합을 구하는 중 합계가 1000이 넘는 순간의 
//		n과 n까지의 합을 출력하는 프로그램을 구현하시오.
//		
//		[출력]
//		45까지의 합: 1035
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
			if (sum > 1000) {
				break;
			}
		}
		System.out.println("출력 :" + sum);
		
		
	}

}
