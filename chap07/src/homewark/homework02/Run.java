package homewark.homework02;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.printlufo(h, m);
		
	}
	
}
