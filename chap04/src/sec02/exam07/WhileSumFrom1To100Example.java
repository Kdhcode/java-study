package sec02.exam07;

import java.util.Scanner;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		// 1부터 100까지 합
		int i = 1;
		int sum = 0;
		
		while (i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ " + (i-1) + " 합: " + sum);
		
		//(참고) 무한루프
		int count = 1;
		while (true) {
			System.out.println("무한 반복" + count);
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				break;
			}
			count ++;
		}
		
		count = 1;
		boolean flag = true;
		while (flag) {
			System.out.println("무한 반복" + count);
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				flag = false;
			}
			count ++;
		}
				
		// do-while문으로 작성
		// 1부터 100까지 합
		sum = 0;
		i = 1;
		
		do {// 처음 한번은 무조건 실행 
			sum += i;
			i++;
		} while (i <= 100); // 세미콜론 필수!
		System.out.println("1 ~ " + (i-1) + " 합: " + sum);
				
		//최소 한번은 실행해야 하는 로직에 유요하지만, 실무에서는 거의 사용되지 않음
		
		// Quiz1: 1부터 100까지 홀수의 합
		
		sum = 0;
		i = 1;
		while (i <= 100) {
			if(i % 2 == 1) {
				sum += i;
			}
			i++;
		}
		System.out.println("1 ~ 100 까지 홀수의 합 : " + sum);
		
		
				// Quiz2:
//				화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
		//
//				[입력]    [출력]
//				 123   =>  6
//				 12345 =>  15
//				
//				힌트: 
//				1) 마지막 자리 수 더하기
//				2) 마지막 자리 제거
				
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요: ");
		int num = sc.nextInt();
		sum = 0;
		while (num > 0) { 
			sum += num % 10; //마지막 자리 수 더하기 
			num /= 10; //마지막 자리 제거
			}	
		System.out.println("더한 값은 : " + sum);
	}
}
