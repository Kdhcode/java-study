package homewark;

import java.util.Iterator;
import java.util.Scanner;

public class homewark3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		while (3 > num || num % 2 == 0) {
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");
			num = sc.nextInt();
		}
		
		int[] line = new int[num];
		int count = 0;
		for (int i = 0; i < num; i++) {
			if(i >= num / 2 + 1) {
				line[i] = count - 1;
				count--;
			} else {
				line[i] = count + 1;
				count++;
			}
			System.out.print(line[i] + " ");
		}
		
	}
}
