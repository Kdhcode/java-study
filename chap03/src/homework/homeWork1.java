package homework;

import java.util.Scanner;
// 문제 : https://devkgn24.notion.site/14afda8bae578074bad4f9c76f5f50b9
public class homeWork1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요 : ");
		String a = sc.nextLine();
		String b = a.equals("간다")  ? "온다" : "간다";
		System.out.println("앵무새 : " + b);
	}

}
