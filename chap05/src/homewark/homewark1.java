package homewark;

import java.util.Scanner;

public class homewark1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("정수(1~50) : ");
		int num = sc.nextInt();
		
		while (0 > num || num >50) {
			System.out.println("1~50사이의 정수를 입력하세요.");
			System.out.print("정수(1~50) : ");
			num = sc.nextInt();
		} 
		for (int i = 0; i <= num; i+=2) {
			sum += i;
		}
		System.out.println("합계 :" + sum);
	}

}
