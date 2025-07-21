package homewark;

import java.util.Scanner;

public class homewark3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String word = sc.nextLine();
		
		while(!("탈출".equals(word))) {
			System.out.println(word);
			System.out.print("입력 : ");
			word = sc.nextLine();
		}
		System.out.println("프로그램 종료");
	}

}
