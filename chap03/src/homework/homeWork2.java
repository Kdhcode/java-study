package homework;

import java.util.Scanner;

public class homeWork2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("구슬의 개수 : ");
		int a = sc.nextInt();
		
		String b = a % 2 == 0 ? "짝수" : "홀수" ; 
		System.out.println("구슬의 개수는 " + b + "입니다." );
	}

}
