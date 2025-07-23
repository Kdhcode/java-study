package homewark;

import java.util.Scanner;

public class homewark6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int n = 1; n <= num - i; n++) {
				System.out.print(" ");
			} 
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
