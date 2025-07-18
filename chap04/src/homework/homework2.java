package homework;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월: ");
		int a = sc.nextInt();
		System.out.print("기온: ");
		int b = sc.nextInt();
		if ((a == 1 || a == 2 ||a == 12) && b <=-15) {
			System.out.println("겨울 한파 경보");
		
		} else if ((a == 1 || a == 2 || a == 12) 
				&& (b <= -12 && b > -15)) {
			System.out.println("겨울 한파 주의보");
		
		} else if (a >= 3 && a <= 5) {
			System.out.println("봄");
		
		} else if ((a >= 6 && a <= 8) && b > 35) {
			System.out.println("여름 폭염 경보");
			
		} else if ((a >= 6 && a <= 8) 
				&& (b >= 33 && b <35)) {
			System.out.println("여름 폭염 주의");
		
		} else if (a >= 9 && a <= 11) {
			System.out.println("여름 폭염 경보");

		} else if (!(a <= 1 && a <=12)) {
			System.out.println("해당하는 계절이 없습니다.");
		}
	}

}
