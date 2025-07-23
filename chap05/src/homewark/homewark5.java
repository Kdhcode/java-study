package homewark;

import java.util.Scanner;

public class homewark5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while (true) {
			System.out.println("숫자(0을 입력하면 종료) : ");
			int num = sc.nextInt();
			
			if(num < 0) {
				continue;
			} else if(num == 0) {
				break;
				} else sum += num;
		}
		System.out.println("양수의 합계 : " + sum);
		
	}

}
