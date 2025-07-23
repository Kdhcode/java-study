package homewark;

import java.util.Scanner;

public class homewark2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		while(num != 0) {
			while (0 > num || num > 9) {
				if (0 > num) {
					System.out.println("양수만 입력해주세요.");
				} else {
					System.out.print("9이하의 숫자를 입력해주세요.");
				}
				System.out.print("숫자 : ");
				num = sc.nextInt();
			} 
				for (int i = num; i <= 9; i++) {
					System.out.println();
					System.out.println("=== " + i + " 단 ===");
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i * j);
					}
				}
				System.out.print("숫자 : ");
				num = sc.nextInt();
			}
		
	}

}
