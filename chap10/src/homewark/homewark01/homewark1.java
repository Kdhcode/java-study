package homewark.homewark01;

import java.util.Scanner;

public class homewark1 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*50)+1;
		int num1 = 0;
		int count = 0;
		while(true) {
			System.out.print("1~50사이의 숫자 : ");
			Scanner sc = new Scanner(System.in);
			try {
				num1 = sc.nextInt();				
			} catch (Exception e) {
				System.out.println("잘못되 값입니다. 숫자를 입력해주세요.");
				count++;
				continue;
			}
			if (num1 > num) {
				System.out.println("Down!");
				count++;
			} else if(num1 < num) {
				System.out.println("up!");
				count++;
			} else {
				System.out.println("축하합니다~ 정답이에요");
				System.out.println("총 시도 횟수: " + count);
				break;
			}
		}
	}
}
