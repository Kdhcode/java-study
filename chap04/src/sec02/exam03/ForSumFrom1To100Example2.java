package sec02.exam03;

import java.util.Scanner;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + (i - 1) + " 합: " + sum);
	
		// (참고) 무한 루프
		int count = 0;
		for (;;) {
			System.out.println("무한 반복");
			count++;
		// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				break;
			}
		}
		
		// Quiz1: 1부터 100까지 짝수의 합
		
		int count1 = 0;
			for (int j = 1; j <= 100; j+=1) {
				if(j % 2 == 0) {
					count1 += j;
				}
					
			}
			System.out.println(count1);
		
		// Quiz2: 
//		숫자를 입력받아 입력받은 수가 
//		짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//		홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//		을 구하는 프로그램을 구현하시오
//
//		[입력]  [출력]
//		 10  => 30
//		 11  => 36
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); 
		int count2 = 0;
		if (num%2 == 0) {
			for (int j = 2; j <= num; j+=2) {
				count2 += j;
			}
			System.out.println(count2);
		} else {
			for (int j = 1; j <= num; j+=2) {
				count2 += j;
			}
			System.out.println(count2);
		}
		
		
		
	}
}
