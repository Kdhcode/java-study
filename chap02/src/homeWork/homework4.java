package homeWork;

import java.util.Scanner;

public class homework4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		char b = sc.nextLine().charAt(0);
		System.out.println("A의 유니코드 : " + (int)b );
		
	}
}
