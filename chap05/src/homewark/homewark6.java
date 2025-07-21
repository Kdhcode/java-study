package homewark;

import java.util.Scanner;

public class homewark6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				for (int n = 1; n <= i/2; n++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
