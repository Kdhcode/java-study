package test03;

import java.util.Scanner;

public class test03_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if (b == 0 || a / b == 0.0) {
			System.out.println("결과 : " + a/b + "or 결과 : 무한대");
		}else {System.out.println("결과 :"+ a/b );}
	}

}
