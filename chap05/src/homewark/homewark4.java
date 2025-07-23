package homewark;

import java.util.Scanner;

public class homewark4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String game1 = "";
		
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			game1 = sc.nextLine();
		} while ("yes".equals(game1));
		System.out.println("게임을 종료합니다.");
	}

}
