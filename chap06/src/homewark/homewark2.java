package homewark;

import java.util.Iterator;
import java.util.Scanner;

public class homewark2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] line = new int[num];
		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num1 = sc.nextInt();
			line[i] = num1;
		}
		for(int i = 0; i < num; i++) {
			System.out.print(line[i] + " ");
			sum += line[i];
		}
		System.out.println("");
		System.out.println("총합 : " + sum);
		
		
		
	}
}
